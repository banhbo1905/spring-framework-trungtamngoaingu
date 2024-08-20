package com.laptrinhjavaweb.converter;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.KhoaThiDTO;
import com.laptrinhjavaweb.dto.KhoaThiDTO;
import com.laptrinhjavaweb.entity.KhoaThiEntity;
import com.laptrinhjavaweb.entity.KhoaThiEntity;
import com.laptrinhjavaweb.entity.PhongThiEntity;

@Component
public class KhoaThiConverter {

	public KhoaThiDTO toDto(KhoaThiEntity entity) {
		KhoaThiDTO result = new KhoaThiDTO();

		
		result.setMakhoathi(entity.getMakhoathi());
		result.setTenkhoathi(entity.getTenkhoathi());
		result.setNgaythi(entity.getNgaythi());
		return result;
	}
	
	public KhoaThiEntity toEntity(KhoaThiDTO dto) {
		KhoaThiEntity result = new KhoaThiEntity();
	
		
		result.setMakhoathi(dto.getMakhoathi());
		result.setTenkhoathi(dto.getTenkhoathi());
		result.setNgaythi(dto.getNgaythi());
		return result;
	}
  
}
