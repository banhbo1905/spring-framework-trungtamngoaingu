package com.laptrinhjavaweb.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.converter.ThiSinhConverter;
import com.laptrinhjavaweb.dto.ThiSinhDTO;
import com.laptrinhjavaweb.entity.ThiSinhEntity;
import com.laptrinhjavaweb.repository.ThiSinhRepository;
import com.laptrinhjavaweb.service.IThiSinhService;



@Service
public class ThiSinhService implements IThiSinhService {
	
	@Autowired
	private ThiSinhRepository thiSinhRepository;
	
	@Autowired
    private ThiSinhConverter thiSinhConverter;
	
	
	@Override
	public ThiSinhDTO findOneByHotenAndSdt(String hoten, String sdt) {
		ThiSinhDTO thiSinhDTO = new ThiSinhDTO();
        ThiSinhEntity thiSinhEntity = thiSinhRepository.findOneByHotenAndSdt(hoten, sdt);
        thiSinhDTO = thiSinhConverter.toDto(thiSinhEntity);
        return thiSinhDTO;
	}

	@Override
	public boolean checkNull(String hoten, String sdt) {
		ThiSinhEntity thiSinhEntity = thiSinhRepository.findOneByHotenAndSdt(hoten, sdt);
		if(thiSinhEntity == null){
			return true;
		}
		return false;
	}

	@Override
	public ThiSinhDTO findOneByCmnd(String cmnd) {
		ThiSinhEntity thiSinhEntity = thiSinhRepository.findOneByCmnd(cmnd);
		ThiSinhDTO thiSinhDTO = thiSinhConverter.toDto(thiSinhEntity);
		return thiSinhDTO;
	}



}
