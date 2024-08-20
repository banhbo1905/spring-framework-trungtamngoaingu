package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.converter.DuThiConverter;
import com.laptrinhjavaweb.converter.KhoaThiConverter;
import com.laptrinhjavaweb.converter.ThiSinhConverter;
import com.laptrinhjavaweb.dto.DiemThiDTO;
import com.laptrinhjavaweb.dto.KhoaThiDTO;
import com.laptrinhjavaweb.dto.DuThiDTO;
import com.laptrinhjavaweb.dto.ThiSinhDTO;
import com.laptrinhjavaweb.entity.*;
import com.laptrinhjavaweb.repository.DuThiRepository;
import com.laptrinhjavaweb.repository.KhoaThiRepository;
import com.laptrinhjavaweb.service.IDuThiService;
import com.laptrinhjavaweb.service.IKhoaThiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class KhoaThiService implements IKhoaThiService {
	
	@Autowired
	private KhoaThiRepository khoaThiRepository;

	@Autowired
	private ThiSinhConverter thiSinhConverter;

	@Autowired
	private KhoaThiConverter khoaThiConverter;

	@Override
	public KhoaThiDTO findOneByMakhoathi(String makhoathi) {
		KhoaThiDTO khoaThiDTO = new KhoaThiDTO();
		KhoaThiEntity khoaThiEntity = khoaThiRepository.findOneByMakhoathi(makhoathi);
		khoaThiDTO = khoaThiConverter.toDto(khoaThiEntity);
		return khoaThiDTO;
	}

	@Override
	public List<KhoaThiDTO> findAll() {
		List<KhoaThiEntity> khoaThiEntities = khoaThiRepository.findAll();
		List<KhoaThiDTO> results = new ArrayList<>();
		for (KhoaThiEntity item: khoaThiEntities) {
			KhoaThiDTO khoaThiDTO = khoaThiConverter.toDto(item);
			results.add(khoaThiDTO);
		}
		return results;
	}


}
