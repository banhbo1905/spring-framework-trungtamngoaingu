package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.BaiThiEntity;
import com.laptrinhjavaweb.entity.DuThiEntity;
import com.laptrinhjavaweb.entity.KhoaThiEntity;
import com.laptrinhjavaweb.entity.PhongThiEntity;

import java.util.List;


public interface KhoaThiRepository extends JpaRepository<KhoaThiEntity, String> {
	KhoaThiEntity findOneByMakhoathi(String makhoathi);
	List<KhoaThiEntity> findAll();
}
