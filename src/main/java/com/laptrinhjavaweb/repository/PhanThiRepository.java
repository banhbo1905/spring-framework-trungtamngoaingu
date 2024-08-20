package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.BaiThiEntity;
import com.laptrinhjavaweb.entity.DuThiEntity;
import com.laptrinhjavaweb.entity.KhoaThiEntity;
import com.laptrinhjavaweb.entity.PhanThiEntity;
import com.laptrinhjavaweb.entity.PhongThiEntity;




public interface PhanThiRepository extends JpaRepository<PhanThiEntity, String> {
	PhanThiEntity findOneByTenphanthi(String tenphanthi);
}
