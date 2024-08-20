package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.KhoaThiDTO;
import com.laptrinhjavaweb.dto.PhongThiDTO;
import com.laptrinhjavaweb.dto.ThiSinhDTO;
import com.laptrinhjavaweb.dto.TrinhDoDTO;
import com.laptrinhjavaweb.entity.KhoaThiEntity;
import com.laptrinhjavaweb.entity.PhongThiEntity;

import java.util.List;


public interface IPhongThiService {
	PhongThiDTO findOneByMaphongthi(String maphongthi);

	List<PhongThiDTO> findAll();

	boolean checkNull(String maphongthi, KhoaThiDTO khoaThiDTO);

	List<PhongThiDTO> findAllByKhoathiAndTrinhdo (KhoaThiDTO khoaThiDTO, TrinhDoDTO trinhDoDTO);

	boolean checkNullPhongThi (KhoaThiDTO khoaThiDTO, TrinhDoDTO trinhDoDTO);

	boolean checkNullPhongThiKhoaThi(String maphongthi, KhoaThiDTO khoaThiDTO);
}
