package com.laptrinhjavaweb.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "phongthi")
public class PhongThiEntity {
	
	 @Id
	 @Column(name = "MaPhongThi")
	 private String  maphongthi;
	

	

	@Column(name = "TenPhongThi")
	private String tenphongthi;

	@Column(name = "SoLuong")
	private int soluong;
	
	@ManyToOne
	@JoinColumn(name = "TenTrinhDo")
	private TrinhDoEntity trinhdo;
	
	@ManyToOne
	@JoinColumn(name = "MaKhoaThi")
	private KhoaThiEntity khoathi;
	
	@OneToMany(mappedBy = "phongthi")
	private List<DuThiEntity> duthi;
	
	@OneToMany(mappedBy = "phongthi")
	private List<BaiThiEntity> baithi;
	
	@ManyToMany(mappedBy = "phongthi")
    private List<GiaoVienEntity> giaovien = new ArrayList<>();

	public String getMaphongthi() {
		return maphongthi;
	}

	public void setMaphongthi(String maphongthi) {
		this.maphongthi = maphongthi;
	}

	public String getTenphongthi() {
		return tenphongthi;
	}

	public void setTenphongthi(String tenphongthi) {
		this.tenphongthi = tenphongthi;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public TrinhDoEntity getTrinhdo() {
		return trinhdo;
	}

	public void setTrinhdo(TrinhDoEntity trinhdo) {
		this.trinhdo = trinhdo;
	}

	public KhoaThiEntity getKhoathi() {
		return khoathi;
	}

	public void setKhoathi(KhoaThiEntity khoathi) {
		this.khoathi = khoathi;
	}

	public List<DuThiEntity> getDuthi() {
		return duthi;
	}

	public void setDuthi(List<DuThiEntity> duthi) {
		this.duthi = duthi;
	}

	public List<BaiThiEntity> getBaithi() {
		return baithi;
	}

	public void setBaithi(List<BaiThiEntity> baithi) {
		this.baithi = baithi;
	}

	public List<GiaoVienEntity> getGiaovien() {
		return giaovien;
	}

	public void setGiaovien(List<GiaoVienEntity> giaovien) {
		this.giaovien = giaovien;
	}

	
	
	
	
}
