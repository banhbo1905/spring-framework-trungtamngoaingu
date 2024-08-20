package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.converter.BaiThiConverter;
import com.laptrinhjavaweb.converter.TrinhDoConverter;
import com.laptrinhjavaweb.dto.BaiThiDTO;
import com.laptrinhjavaweb.dto.TrinhDoDTO;
import com.laptrinhjavaweb.entity.BaiThiEntity;
import com.laptrinhjavaweb.entity.TrinhDoEntity;
import com.laptrinhjavaweb.repository.BaiThiRepository;
import com.laptrinhjavaweb.repository.TrinhDoRepository;
import com.laptrinhjavaweb.service.IBaiThiService;
import com.laptrinhjavaweb.service.ITrinhDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TrinhDoService implements ITrinhDoService {
	
	@Autowired
	private TrinhDoRepository trinhDoRepository;
	
	@Autowired
    private TrinhDoConverter trinhDoConverter;

	@Override
	public TrinhDoDTO findOneByTentrinhdo(String tentrinhdo) {
		TrinhDoEntity trinhDoEntity = trinhDoRepository.findOneByTentrinhdo(tentrinhdo);
		TrinhDoDTO trinhDoDTO = trinhDoConverter.toDto(trinhDoEntity);
		return trinhDoDTO;
	}
}
