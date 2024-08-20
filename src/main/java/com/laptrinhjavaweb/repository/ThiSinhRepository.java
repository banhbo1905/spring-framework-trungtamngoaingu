package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.ThiSinhEntity;



public interface ThiSinhRepository extends JpaRepository<ThiSinhEntity, String> {
	ThiSinhEntity findOneByHotenAndSdt(String hoten, String sdt);
	ThiSinhEntity findOneByCmnd(String cmnd);

}
