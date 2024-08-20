package com.laptrinhjavaweb.entity;


import java.util.ArrayList;
import java.util.Date;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "khoathi")
public class KhoaThiEntity {
	
	 @Id
	 @Column(name = "MaKhoaThi")
	 private String  makhoathi;
	

	

	@Column(name = "TenKhoaThi")
	private String tenkhoathi;

	
	@Column(name = "NgayThi")
	private Date ngaythi;

	@OneToMany(mappedBy = "khoathi")
	private List<PhongThiEntity> phongthi;
	
	@OneToMany(mappedBy = "khoathi")
	private List<DangKyEntity> dangky;

	public String getMakhoathi() {
		return makhoathi;
	}

	public void setMakhoathi(String makhoathi) {
		this.makhoathi = makhoathi;
	}

	public String getTenkhoathi() {
		return tenkhoathi;
	}

	public void setTenkhoathi(String tenkhoathi) {
		this.tenkhoathi = tenkhoathi;
	}

	public Date getNgaythi() {
		return ngaythi;
	}

	public void setNgaythi(Date ngaythi) {
		this.ngaythi = ngaythi;
	}

	public List<PhongThiEntity> getPhongthi() {
		return phongthi;
	}

	public void setPhongthi(List<PhongThiEntity> phongthi) {
		this.phongthi = phongthi;
	}

	public List<DangKyEntity> getDangky() {
		return dangky;
	}

	public void setDangky(List<DangKyEntity> dangky) {
		this.dangky = dangky;
	}
	

	
	
}
