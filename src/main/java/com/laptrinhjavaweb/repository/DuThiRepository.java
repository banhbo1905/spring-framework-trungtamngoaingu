package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.ThiSinhEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.DuThiEntity;
import com.laptrinhjavaweb.entity.PhongThiEntity;

import java.util.List;


public interface DuThiRepository extends JpaRepository<DuThiEntity, String> {
    List<DuThiEntity> findAllByThisinh(ThiSinhEntity thiSinhEntity);

    List<DuThiEntity> findAllByPhongthi(PhongThiEntity phongThiEntity);

    DuThiEntity findOneBySbd (String sbd);
}
