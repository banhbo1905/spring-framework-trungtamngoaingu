package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.BaiThiEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.DiemThiEntity;
import com.laptrinhjavaweb.entity.DuThiEntity;
import com.laptrinhjavaweb.entity.PhongThiEntity;

import java.util.List;


public interface DiemThiRepository extends JpaRepository<DiemThiEntity, String> {
	List<DiemThiEntity> findAllByBaithi (BaiThiEntity baiThiEntity);
}
