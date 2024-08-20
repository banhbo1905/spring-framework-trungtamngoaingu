package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.BaiThiDTO;
import com.laptrinhjavaweb.dto.PhongThiDTO;


public interface IBaiThiService {
	BaiThiDTO findOneBySbd(String sbd);
}
