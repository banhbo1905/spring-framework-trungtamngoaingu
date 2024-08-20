package com.laptrinhjavaweb.converter;


import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.GiaoVienDTO;
import com.laptrinhjavaweb.dto.PhongThiDTO;
import com.laptrinhjavaweb.dto.GiaoVienDTO;
import com.laptrinhjavaweb.entity.GiaoVienEntity;
import com.laptrinhjavaweb.entity.GiaoVienEntity;
import com.laptrinhjavaweb.entity.PhongThiEntity;
import com.laptrinhjavaweb.entity.ThiSinhEntity;
import com.laptrinhjavaweb.repository.PhongThiRepository;
import com.laptrinhjavaweb.repository.ThiSinhRepository;

@Component
public class GiaoVienConverter {
	
	
	
	public GiaoVienDTO toDto(GiaoVienEntity entity) {
		GiaoVienDTO result = new GiaoVienDTO();

		
		result.setMagiaovien(entity.getMagiaovien());
		result.setHoten(entity.getHoten());
		result.setEmail(entity.getEmail());
		result.setGioitinh(entity.getGioitinh());
		result.setNgaysinh(entity.getNgaysinh());
		result.setSdt(entity.getSdt());
		return result;
	}
	
	public GiaoVienEntity toEntity(GiaoVienDTO dto) {
		GiaoVienEntity result = new GiaoVienEntity();
	
		
		result.setMagiaovien(dto.getMagiaovien());
		result.setHoten(dto.getHoten());
		result.setEmail(dto.getEmail());
		result.setGioitinh(dto.getGioitinh());
		result.setNgaysinh(dto.getNgaysinh());
		result.setSdt(dto.getSdt());
		return result;
	}

  
}
