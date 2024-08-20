package com.laptrinhjavaweb.converter;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.PhanThiDTO;
import com.laptrinhjavaweb.dto.PhanThiDTO;
import com.laptrinhjavaweb.entity.PhanThiEntity;
import com.laptrinhjavaweb.entity.PhanThiEntity;
import com.laptrinhjavaweb.entity.PhongThiEntity;

@Component
public class PhanThiConverter {

	public PhanThiDTO toDto(PhanThiEntity entity) {
		PhanThiDTO result = new PhanThiDTO();
		result.setTenphanthi(entity.getTenphanthi());
		return result;
	}
	
	public PhanThiEntity toEntity(PhanThiDTO dto) {
		PhanThiEntity result = new PhanThiEntity();
		result.setTenphanthi(dto.getTenphanthi());
		return result;
	}
  
}
