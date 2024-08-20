package com.laptrinhjavaweb.converter;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.TrinhDoDTO;
import com.laptrinhjavaweb.dto.TrinhDoDTO;
import com.laptrinhjavaweb.entity.TrinhDoEntity;
import com.laptrinhjavaweb.entity.TrinhDoEntity;

@Component
public class TrinhDoConverter {


	public TrinhDoDTO toDto(TrinhDoEntity entity) {
		TrinhDoDTO result = new TrinhDoDTO();
		result.setTentrinhdo(entity.getTentrinhdo());
		return result;
	}
	
	public TrinhDoEntity toEntity(TrinhDoDTO dto) {
		TrinhDoEntity result = new TrinhDoEntity();
		result.setTentrinhdo(dto.getTentrinhdo());
		return result;
	}
  
}
