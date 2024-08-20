package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.BaiThiEntity;
import com.laptrinhjavaweb.entity.DuThiEntity;
import com.laptrinhjavaweb.entity.PhongThiEntity;




public interface BaiThiRepository extends JpaRepository<BaiThiEntity, String> {
	BaiThiEntity findOneByMabaithi(String mabaithi);
	BaiThiEntity findOneBySbd(String sbd);
}
