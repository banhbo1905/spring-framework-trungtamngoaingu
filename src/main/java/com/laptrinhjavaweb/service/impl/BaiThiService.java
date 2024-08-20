package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.converter.BaiThiConverter;
import com.laptrinhjavaweb.converter.PhongThiConverter;
import com.laptrinhjavaweb.dto.BaiThiDTO;
import com.laptrinhjavaweb.dto.BaiThiDTO;
import com.laptrinhjavaweb.entity.BaiThiEntity;
import com.laptrinhjavaweb.repository.BaiThiRepository;
import com.laptrinhjavaweb.repository.PhongThiRepository;
import com.laptrinhjavaweb.service.IBaiThiService;
import com.laptrinhjavaweb.service.IPhongThiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BaiThiService implements IBaiThiService {
	
	@Autowired
	private BaiThiRepository baiThiRepository;
	
	@Autowired
    private BaiThiConverter baiThiConverter;

	@Override
	public BaiThiDTO findOneBySbd(String sbd) {
		BaiThiDTO baiThiDTO = new BaiThiDTO();
		BaiThiEntity baiThiEntity = baiThiRepository.findOneBySbd(sbd);
		baiThiDTO = baiThiConverter.toDto(baiThiEntity);
		return baiThiDTO;
	}
}
