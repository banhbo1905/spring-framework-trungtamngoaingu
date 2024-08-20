package com.laptrinhjavaweb.converter;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.DangKyDTO;
import com.laptrinhjavaweb.dto.DangKyDTO;
import com.laptrinhjavaweb.entity.DangKyEntity;
import com.laptrinhjavaweb.entity.KhoaThiEntity;
import com.laptrinhjavaweb.entity.DangKyEntity;
import com.laptrinhjavaweb.entity.PhongThiEntity;
import com.laptrinhjavaweb.entity.ThiSinhEntity;
import com.laptrinhjavaweb.entity.TrinhDoEntity;
import com.laptrinhjavaweb.repository.KhoaThiRepository;
import com.laptrinhjavaweb.repository.PhongThiRepository;
import com.laptrinhjavaweb.repository.ThiSinhRepository;
import com.laptrinhjavaweb.repository.TrinhDoRepository;

@Component
public class DangKyConverter {

	@Autowired
    private KhoaThiRepository khoaThiRepository;
	
	@Autowired
    private ThiSinhRepository thiSinhRepository;
	
	@Autowired
    private TrinhDoRepository trinhDoRepository;
	
	
	public DangKyDTO toDto(DangKyEntity entity) {
		DangKyDTO result = new DangKyDTO();
		
	
		
		result.setMakhoathi(entity.getKhoathi().getMakhoathi());
		result.setCmnd(entity.getThisinh().getCmnd());
		result.setTentrinhdo(entity.getTrinhdo().getTentrinhdo());
		return result;
	}
	
	public DangKyEntity toEntity(DangKyDTO dto) {
		DangKyEntity result = new DangKyEntity();
		KhoaThiEntity khoathiEntity = khoaThiRepository.findOneByMakhoathi(dto.getMakhoathi());
		ThiSinhEntity thisinhEntity = thiSinhRepository.findOneByCmnd(dto.getCmnd());
		TrinhDoEntity trinhdoEntity = trinhDoRepository.findOneByTentrinhdo(dto.getTentrinhdo());
		
		
		result.setKhoathi(khoathiEntity);
		result.setThisinh(thisinhEntity);
		result.setTrinhdo(trinhdoEntity);
		return result;
	}

  
}
