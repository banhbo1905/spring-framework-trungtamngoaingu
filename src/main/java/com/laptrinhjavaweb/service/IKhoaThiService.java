package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.BaiThiDTO;
import com.laptrinhjavaweb.dto.KhoaThiDTO;

import java.util.List;


public interface IKhoaThiService {
	KhoaThiDTO findOneByMakhoathi(String makhoathi);
	List<KhoaThiDTO> findAll();

}
