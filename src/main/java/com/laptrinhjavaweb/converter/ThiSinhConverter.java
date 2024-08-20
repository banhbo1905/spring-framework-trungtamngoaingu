package com.laptrinhjavaweb.converter;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.ThiSinhDTO;
import com.laptrinhjavaweb.dto.ThiSinhDTO;
import com.laptrinhjavaweb.entity.ThiSinhEntity;
import com.laptrinhjavaweb.entity.ThiSinhEntity;

@Component
public class ThiSinhConverter {

	public ThiSinhDTO toDto(ThiSinhEntity entity) {
		ThiSinhDTO result = new ThiSinhDTO();

		
		result.setCmnd(entity.getCmnd());
		result.setHoten(entity.getHoten());
		result.setEmail(entity.getEmail());
		result.setGioitinh(entity.getGioitinh());
		result.setNgaysinh(entity.getNgaysinh());
		result.setSdt(entity.getSdt());
		result.setNoisinh(entity.getNoisinh());
		result.setNgaycap(entity.getNgaycap());
		result.setNoicap(entity.getNoicap());
		return result;
	}
	
	public ThiSinhEntity toEntity(ThiSinhDTO dto) {
		ThiSinhEntity result = new ThiSinhEntity();
	
		
		result.setCmnd(dto.getCmnd());
		result.setHoten(dto.getHoten());
		result.setEmail(dto.getEmail());
		result.setGioitinh(dto.getGioitinh());
		result.setNgaysinh(dto.getNgaysinh());
		result.setSdt(dto.getSdt());
		result.setNoisinh(dto.getNoisinh());
		result.setNgaycap(dto.getNgaycap());
		result.setNoicap(dto.getNoicap());
		return result;
	}
  
}
