package com.laptrinhjavaweb.converter;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.PhongThiDTO;
import com.laptrinhjavaweb.dto.PhongThiDTO;
import com.laptrinhjavaweb.entity.BaiThiEntity;
import com.laptrinhjavaweb.entity.KhoaThiEntity;
import com.laptrinhjavaweb.entity.PhanThiEntity;
import com.laptrinhjavaweb.entity.PhongThiEntity;
import com.laptrinhjavaweb.entity.TrinhDoEntity;
import com.laptrinhjavaweb.repository.BaiThiRepository;
import com.laptrinhjavaweb.repository.KhoaThiRepository;
import com.laptrinhjavaweb.repository.PhanThiRepository;
import com.laptrinhjavaweb.repository.TrinhDoRepository;
import com.laptrinhjavaweb.entity.PhongThiEntity;

@Component
public class PhongThiConverter {
	
	@Autowired
    private TrinhDoRepository trinhDoRepository;
	
	@Autowired
    private KhoaThiRepository khoaThiRepository;
	
	

	public PhongThiDTO toDto(PhongThiEntity entity) {
		PhongThiDTO result = new PhongThiDTO();
		
		result.setMaphongthi(entity.getMaphongthi());
		result.setTenphongthi(entity.getTenphongthi());
		result.setSoluong(entity.getSoluong());
		result.setTentrinhdo(entity.getTrinhdo().getTentrinhdo());
		result.setMakhoathi(entity.getKhoathi().getMakhoathi());
		return result;
	}
	
	public PhongThiEntity toEntity(PhongThiDTO dto) {
		PhongThiEntity result = new PhongThiEntity();
		TrinhDoEntity trinhdoEntity = trinhDoRepository.findOneByTentrinhdo(dto.getTentrinhdo());
		KhoaThiEntity khoathiEntity = khoaThiRepository.findOneByMakhoathi(dto.getMakhoathi());
		
		result.setMaphongthi(dto.getMaphongthi());
		result.setTenphongthi(dto.getTenphongthi());
		result.setSoluong(dto.getSoluong());
		result.setTrinhdo(trinhdoEntity);
		result.setKhoathi(khoathiEntity);
		
		return result;
	}
  
}
