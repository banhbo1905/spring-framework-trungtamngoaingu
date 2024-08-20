package com.laptrinhjavaweb.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "dangky")
public class DangKyEntity {
	
	@EmbeddedId
    private DangKyKey dangKyKey = new DangKyKey();
	
	@ManyToOne
	@MapsId("makhoathi")
	@JoinColumn(name = "MaKhoaThi")
	private KhoaThiEntity khoathi;
	

	@ManyToOne
	@MapsId("cmnd")
	@JoinColumn(name = "CMND")
	private ThiSinhEntity thisinh;
	
	
	@ManyToOne
	@JoinColumn(name = "TenTrinhDo")
	private TrinhDoEntity trinhdo;


	public DangKyKey getDangKyKey() {
		return dangKyKey;
	}


	public void setDangKyKey(DangKyKey dangKyKey) {
		this.dangKyKey = dangKyKey;
	}


	public KhoaThiEntity getKhoathi() {
		return khoathi;
	}


	public void setKhoathi(KhoaThiEntity khoathi) {
		this.khoathi = khoathi;
	}


	public ThiSinhEntity getThisinh() {
		return thisinh;
	}


	public void setThisinh(ThiSinhEntity thisinh) {
		this.thisinh = thisinh;
	}


	public TrinhDoEntity getTrinhdo() {
		return trinhdo;
	}


	public void setTrinhdo(TrinhDoEntity trinhdo) {
		this.trinhdo = trinhdo;
	}


	


	
	
}
