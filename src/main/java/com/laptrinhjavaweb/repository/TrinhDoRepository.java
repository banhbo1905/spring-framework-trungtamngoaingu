package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.BaiThiEntity;
import com.laptrinhjavaweb.entity.DuThiEntity;
import com.laptrinhjavaweb.entity.PhongThiEntity;
import com.laptrinhjavaweb.entity.TrinhDoEntity;




public interface TrinhDoRepository extends JpaRepository<TrinhDoEntity, String> {
	TrinhDoEntity findOneByTentrinhdo(String tentrinhdo);
}
