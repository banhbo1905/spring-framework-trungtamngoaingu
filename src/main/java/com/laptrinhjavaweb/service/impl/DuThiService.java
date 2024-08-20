package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.converter.DuThiConverter;
import com.laptrinhjavaweb.converter.PhongThiConverter;
import com.laptrinhjavaweb.converter.ThiSinhConverter;
import com.laptrinhjavaweb.dto.DuThiDTO;
import com.laptrinhjavaweb.dto.PhongThiDTO;
import com.laptrinhjavaweb.dto.ThiSinhDTO;
import com.laptrinhjavaweb.entity.DuThiEntity;
import com.laptrinhjavaweb.entity.PhongThiEntity;
import com.laptrinhjavaweb.entity.ThiSinhEntity;
import com.laptrinhjavaweb.repository.DuThiRepository;
import com.laptrinhjavaweb.repository.ThiSinhRepository;
import com.laptrinhjavaweb.service.IDuThiService;
import com.laptrinhjavaweb.service.IThiSinhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class DuThiService implements IDuThiService {
	
	@Autowired
	private DuThiRepository duThiRepository;

	@Autowired
	private ThiSinhConverter thiSinhConverter;

	@Autowired
	private DuThiConverter duThiConverter;

	@Autowired
	private PhongThiConverter phongThiConverter;


	@Override
	public List<DuThiDTO> findAllByThisinh(ThiSinhDTO thiSinhDTO) {
		ThiSinhEntity thiSinhEntity = thiSinhConverter.toEntity(thiSinhDTO);
		List<DuThiEntity> duThiEntities = duThiRepository.findAllByThisinh(thiSinhEntity);
		List<DuThiDTO> results = new ArrayList<>();
		for (DuThiEntity item: duThiEntities) {
			DuThiDTO duThiDTO = duThiConverter.toDto(item);
			results.add(duThiDTO);
		}
		return results;
	}

	@Override
	public DuThiDTO findOneBySbd(String sbd) {
		DuThiEntity duThiEntity = duThiRepository.findOneBySbd(sbd);
		DuThiDTO duThiDTO = duThiConverter.toDto(duThiEntity);
		return duThiDTO;
	}

	@Override
	public boolean checkNull(String sbd) {
		DuThiEntity duThiEntity = duThiRepository.findOneBySbd(sbd);
		if(duThiEntity == null){
			return true;
		}
		return false;
	}

	@Override
	public List<DuThiDTO> findAllByPhongthi(PhongThiDTO phongThiDTO) {
		PhongThiEntity phongThiEntity = phongThiConverter.toEntity(phongThiDTO);
		List<DuThiEntity> duThiEntities = duThiRepository.findAllByPhongthi(phongThiEntity);
		List<DuThiDTO> results = new ArrayList<>();
		for (DuThiEntity item: duThiEntities){
			DuThiDTO duThiDTO = duThiConverter.toDto(item);
			results.add(duThiDTO);
		}
		return results;
	}
}
