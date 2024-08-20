package com.laptrinhjavaweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.BaiThiEntity;
import com.laptrinhjavaweb.entity.DuThiEntity;
import com.laptrinhjavaweb.entity.GiaoVienEntity;
import com.laptrinhjavaweb.entity.PhongThiEntity;




public interface GiaoVienRepository extends JpaRepository<GiaoVienEntity, String> {
	List<GiaoVienEntity> findAllByPhongthi(PhongThiEntity phongthi);
}
