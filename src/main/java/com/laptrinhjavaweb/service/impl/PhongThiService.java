package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.converter.KhoaThiConverter;
import com.laptrinhjavaweb.converter.PhongThiConverter;
import com.laptrinhjavaweb.converter.ThiSinhConverter;
import com.laptrinhjavaweb.converter.TrinhDoConverter;
import com.laptrinhjavaweb.dto.KhoaThiDTO;
import com.laptrinhjavaweb.dto.PhongThiDTO;
import com.laptrinhjavaweb.dto.PhongThiDTO;
import com.laptrinhjavaweb.dto.TrinhDoDTO;
import com.laptrinhjavaweb.entity.KhoaThiEntity;
import com.laptrinhjavaweb.entity.PhongThiEntity;
import com.laptrinhjavaweb.entity.TrinhDoEntity;
import com.laptrinhjavaweb.repository.PhongThiRepository;
import com.laptrinhjavaweb.repository.ThiSinhRepository;
import com.laptrinhjavaweb.service.IPhongThiService;
import com.laptrinhjavaweb.service.IThiSinhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class PhongThiService implements IPhongThiService {
	
	@Autowired
	private PhongThiRepository phongThiRepository;
	
	@Autowired
    private PhongThiConverter phongThiConverter;

	@Autowired
	private KhoaThiConverter khoaThiConverter;

	@Autowired
	private TrinhDoConverter trinhDoConverter;

	@Override
	public PhongThiDTO findOneByMaphongthi(String maphongthi) {
		PhongThiDTO phongThiDTO = new PhongThiDTO();
		PhongThiEntity phongThiEntity = phongThiRepository.findOneByMaphongthi(maphongthi);
		phongThiDTO = phongThiConverter.toDto(phongThiEntity);
		return phongThiDTO;
	}

	@Override
	public List<PhongThiDTO> findAll() {
		List<PhongThiEntity> phongThiEntities = phongThiRepository.findAll();
		List<PhongThiDTO> results = new ArrayList<>();
		for (PhongThiEntity item: phongThiEntities){
			PhongThiDTO phongThiDTO = phongThiConverter.toDto(item);
			results.add(phongThiDTO);
		}
		return results;
	}

//	@Override
//	public PhongThiDTO findOneByMaphongthiAndKhoathi(String maphongthi, KhoaThiDTO khoaThiDTO) {
//		KhoaThiEntity khoaThiEntity = khoaThiConverter.toEntity(khoaThiDTO);
//		PhongThiEntity phongThiEntity = phongThiRepository.findOneByMaphongthiAndKhoathi(maphongthi, khoaThiEntity);
//		PhongThiDTO phongThiDTO = phongThiConverter.toDto(phongThiEntity);
//		return  phongThiDTO;
//	}

	@Override
	public boolean checkNull(String maphongthi, KhoaThiDTO khoaThiDTO) {
		KhoaThiEntity khoaThiEntity = khoaThiConverter.toEntity(khoaThiDTO);
		PhongThiEntity phongThiEntity = phongThiRepository.findOneByMaphongthiAndKhoathi(maphongthi, khoaThiEntity);
		if(phongThiEntity == null){
			return true;
		}
		return false;
	}

	@Override
	public List<PhongThiDTO> findAllByKhoathiAndTrinhdo(KhoaThiDTO khoaThiDTO, TrinhDoDTO trinhDoDTO) {
		KhoaThiEntity khoaThiEntity = khoaThiConverter.toEntity(khoaThiDTO);
		TrinhDoEntity trinhDoEntity = trinhDoConverter.toEntity(trinhDoDTO);
		List<PhongThiEntity> phongThiEntities = phongThiRepository.findAllByKhoathiAndTrinhdo(khoaThiEntity, trinhDoEntity);
		List<PhongThiDTO> results = new ArrayList<>();
		for (PhongThiEntity item: phongThiEntities){
			PhongThiDTO phongThiDTO = phongThiConverter.toDto(item);
			results.add(phongThiDTO);
		}
		return results;
	}

	@Override
	public boolean checkNullPhongThi(KhoaThiDTO khoaThiDTO, TrinhDoDTO trinhDoDTO) {
		KhoaThiEntity khoaThiEntity = khoaThiConverter.toEntity(khoaThiDTO);
		TrinhDoEntity trinhDoEntity = trinhDoConverter.toEntity(trinhDoDTO);
		List<PhongThiEntity> phongThiEntities = phongThiRepository.findAllByKhoathiAndTrinhdo(khoaThiEntity, trinhDoEntity);
		if(phongThiEntities == null){
			return true;
		}
		return false;
	}

	@Override
	public boolean checkNullPhongThiKhoaThi(String maphongthi, KhoaThiDTO khoaThiDTO) {
		KhoaThiEntity khoaThiEntity = khoaThiConverter.toEntity(khoaThiDTO);
		List<PhongThiEntity> phongThiEntities = phongThiRepository.findAllByMaphongthiAndKhoathi(maphongthi,khoaThiEntity);
		if(phongThiEntities.size() == 0){
			return true;
		}

		return false;

	}
}
