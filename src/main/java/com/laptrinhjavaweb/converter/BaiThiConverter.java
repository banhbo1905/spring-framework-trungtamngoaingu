package com.laptrinhjavaweb.converter;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.BaiThiDTO;
import com.laptrinhjavaweb.entity.BaiThiEntity;
import com.laptrinhjavaweb.entity.PhongThiEntity;
import com.laptrinhjavaweb.repository.PhongThiRepository;

@Component
public class BaiThiConverter {

	@Autowired
    private PhongThiRepository phongThiRepository;
	
	public BaiThiDTO toDto(BaiThiEntity entity) {
		BaiThiDTO result = new BaiThiDTO();
		result.setMabaithi(entity.getMabaithi());
		result.setMaphongthi(entity.getPhongthi().getMaphongthi());
		result.setSbd(entity.getSbd());
		return result;
	}
	
	public BaiThiEntity toEntity(BaiThiDTO dto) {
		BaiThiEntity result = new BaiThiEntity();
		result.setMabaithi(dto.getMabaithi());
		PhongThiEntity phongthiEntity = phongThiRepository.findOneByMaphongthi(dto.getMaphongthi());
		result.setPhongthi(phongthiEntity);
		result.setSbd(dto.getSbd());
		return result;
	}
  
}
