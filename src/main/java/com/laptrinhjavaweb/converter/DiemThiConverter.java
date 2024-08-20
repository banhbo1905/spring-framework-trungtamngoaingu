package com.laptrinhjavaweb.converter;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.DiemThiDTO;
import com.laptrinhjavaweb.dto.DiemThiDTO;
import com.laptrinhjavaweb.entity.BaiThiEntity;
import com.laptrinhjavaweb.entity.DiemThiEntity;
import com.laptrinhjavaweb.entity.DiemThiEntity;
import com.laptrinhjavaweb.entity.KhoaThiEntity;
import com.laptrinhjavaweb.entity.PhanThiEntity;
import com.laptrinhjavaweb.entity.ThiSinhEntity;
import com.laptrinhjavaweb.entity.TrinhDoEntity;
import com.laptrinhjavaweb.repository.BaiThiRepository;
import com.laptrinhjavaweb.repository.KhoaThiRepository;
import com.laptrinhjavaweb.repository.PhanThiRepository;
import com.laptrinhjavaweb.repository.ThiSinhRepository;
import com.laptrinhjavaweb.repository.TrinhDoRepository;

@Component
public class DiemThiConverter {

	@Autowired
    private BaiThiRepository baiThiRepository;
	
	@Autowired
    private PhanThiRepository phanThiRepository;
	

	
	
	public DiemThiDTO toDto(DiemThiEntity entity) {
		DiemThiDTO result = new DiemThiDTO();
		result.setMabaithi(entity.getBaithi().getMabaithi());
		result.setTenphanthi(entity.getPhanthi().getTenphanthi());
		result.setDiem(entity.getDiem());
		return result;
	}
	
	public DiemThiEntity toEntity(DiemThiDTO dto) {
		DiemThiEntity result = new DiemThiEntity();
		BaiThiEntity baithiEntity = baiThiRepository.findOneByMabaithi(dto.getMabaithi());
		PhanThiEntity phanthiEntity = phanThiRepository.findOneByTenphanthi(dto.getTenphanthi());
		
		result.setBaithi(baithiEntity);
		result.setPhanthi(phanthiEntity);
		result.setDiem(dto.getDiem());
		return result;
	}
  
}
