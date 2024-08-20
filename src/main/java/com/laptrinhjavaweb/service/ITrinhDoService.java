package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.BaiThiDTO;
import com.laptrinhjavaweb.dto.TrinhDoDTO;
import com.laptrinhjavaweb.entity.TrinhDoEntity;


public interface ITrinhDoService {
	TrinhDoDTO findOneByTentrinhdo(String tentrinhdo);
}
