package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.BaiThiDTO;
import com.laptrinhjavaweb.dto.DiemThiDTO;
import com.laptrinhjavaweb.dto.DuThiDTO;
import com.laptrinhjavaweb.dto.ThiSinhDTO;
import com.laptrinhjavaweb.entity.BaiThiEntity;

import java.util.List;


public interface IDiemThiService {
	List<DiemThiDTO> findAllByBaithi (String mabaithi);
}
