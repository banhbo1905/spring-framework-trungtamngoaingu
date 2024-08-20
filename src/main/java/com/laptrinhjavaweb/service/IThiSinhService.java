package com.laptrinhjavaweb.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.laptrinhjavaweb.dto.ThiSinhDTO;




public interface IThiSinhService {
	ThiSinhDTO findOneByHotenAndSdt(String hoten, String sdt);

	boolean checkNull(String hoten, String sdt);
	ThiSinhDTO findOneByCmnd(String cmnd);
}
