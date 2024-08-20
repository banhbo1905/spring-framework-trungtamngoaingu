package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.DuThiDTO;
import com.laptrinhjavaweb.dto.PhongThiDTO;
import com.laptrinhjavaweb.dto.ThiSinhDTO;
import com.laptrinhjavaweb.entity.DuThiEntity;
import com.laptrinhjavaweb.entity.PhongThiEntity;

import java.util.List;


public interface IDuThiService {
	List<DuThiDTO> findAllByThisinh(ThiSinhDTO thiSinhDTO);

	DuThiDTO findOneBySbd (String sbd);

	boolean checkNull(String sbd);

	List<DuThiDTO> findAllByPhongthi(PhongThiDTO phongThiDTO);
}
