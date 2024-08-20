package com.laptrinhjavaweb.repository;

import java.util.List;

import com.laptrinhjavaweb.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PhongThiRepository extends JpaRepository<PhongThiEntity, String> {

	List<PhongThiEntity> findAll();

	PhongThiEntity findOneByMaphongthi(String maphongthi);
	List<PhongThiEntity> findAllByGiaovien(GiaoVienEntity giaovien);

	PhongThiEntity findOneByMaphongthiAndKhoathi(String maphongthi, KhoaThiEntity khoaThiEntity);

	List<PhongThiEntity> findAllByKhoathiAndTrinhdo(KhoaThiEntity khoaThiEntity, TrinhDoEntity trinhDoEntity);

	List<PhongThiEntity> findAllByMaphongthiAndKhoathi(String maphongthi, KhoaThiEntity khoaThiEntity);
	
}
