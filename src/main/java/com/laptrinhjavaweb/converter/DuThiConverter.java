package com.laptrinhjavaweb.converter;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.DuThiDTO;
import com.laptrinhjavaweb.dto.DuThiDTO;
import com.laptrinhjavaweb.entity.BaiThiEntity;
import com.laptrinhjavaweb.entity.DuThiEntity;
import com.laptrinhjavaweb.entity.DuThiEntity;
import com.laptrinhjavaweb.entity.PhanThiEntity;
import com.laptrinhjavaweb.entity.PhongThiEntity;
import com.laptrinhjavaweb.entity.ThiSinhEntity;
import com.laptrinhjavaweb.repository.BaiThiRepository;
import com.laptrinhjavaweb.repository.PhanThiRepository;
import com.laptrinhjavaweb.repository.PhongThiRepository;
import com.laptrinhjavaweb.repository.ThiSinhRepository;

@Component
public class DuThiConverter {

	@Autowired
    private PhongThiRepository phongThiRepository;
	
	@Autowired
    private ThiSinhRepository thiSinhRepository;

	
	
	public DuThiDTO toDto(DuThiEntity entity) {
		DuThiDTO result = new DuThiDTO();
		result.setMaphongthi(entity.getPhongthi().getMaphongthi());
		result.setCmnd(entity.getThisinh().getCmnd());
		result.setSbd(entity.getSbd());
		return result;
	}
	
	public DuThiEntity toEntity(DuThiDTO dto) {
		DuThiEntity result = new DuThiEntity();
		PhongThiEntity phongthiEntity = phongThiRepository.findOneByMaphongthi(dto.getMaphongthi());
		ThiSinhEntity thisinhEntity = thiSinhRepository.findOneByCmnd(dto.getCmnd());
		
		result.setPhongthi(phongthiEntity);
		result.setThisinh(thisinhEntity);
		result.setSbd(dto.getSbd());
		return result;
	}

  
}
