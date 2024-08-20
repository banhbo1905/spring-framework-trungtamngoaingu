package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.converter.BaiThiConverter;
import com.laptrinhjavaweb.converter.DiemThiConverter;
import com.laptrinhjavaweb.converter.DuThiConverter;
import com.laptrinhjavaweb.converter.ThiSinhConverter;
import com.laptrinhjavaweb.dto.BaiThiDTO;
import com.laptrinhjavaweb.dto.DiemThiDTO;
import com.laptrinhjavaweb.dto.DuThiDTO;
import com.laptrinhjavaweb.dto.ThiSinhDTO;
import com.laptrinhjavaweb.entity.BaiThiEntity;
import com.laptrinhjavaweb.entity.DiemThiEntity;
import com.laptrinhjavaweb.entity.DuThiEntity;
import com.laptrinhjavaweb.entity.ThiSinhEntity;
import com.laptrinhjavaweb.repository.BaiThiRepository;
import com.laptrinhjavaweb.repository.DiemThiRepository;
import com.laptrinhjavaweb.repository.DuThiRepository;
import com.laptrinhjavaweb.service.IDiemThiService;
import com.laptrinhjavaweb.service.IDuThiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class DiemThiService implements IDiemThiService {
	
	@Autowired
	private DiemThiRepository diemThiRepository;

	@Autowired
	private BaiThiRepository baiThiRepository;

	@Autowired
	private DiemThiConverter diemThiConverter;

	@Override
	public List<DiemThiDTO> findAllByBaithi(String mabaithi) {
		BaiThiEntity baiThiEntity = baiThiRepository.findOneByMabaithi(mabaithi);
		List<DiemThiEntity> diemThiEntity = diemThiRepository.findAllByBaithi(baiThiEntity);
		List<DiemThiDTO> results = new ArrayList<>();
		for (DiemThiEntity item: diemThiEntity) {
			DiemThiDTO diemThiDTO = diemThiConverter.toDto(item);
			results.add(diemThiDTO);
		}
		return results;
	}
}
