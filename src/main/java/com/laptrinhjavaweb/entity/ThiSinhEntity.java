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
@Table(name = "thisinh")
public class ThiSinhEntity {
	
	 @Id
	 @Column(name = "CMND")
	 private String  cmnd;
	

	

	@Column(name = "HoTen")
	private String hoten;

	@Column(name = "GioiTinh")
	private String gioitinh;
	
	@Column(name = "NgaySinh")
	private Date ngaysinh;

	@Column(name = "NoiSinh")
	private String noisinh;
	
	@Column(name = "NgayCap")
	private Date ngaycap;
	
	@Column(name = "NoiCap")
	private String noicap;
	
	@Column(name = "SDT")
	private String sdt;
	
	@Column(name = "Email")
	private String email;

	@OneToMany(mappedBy = "thisinh")
	private List<DangKyEntity> dangky;
	
	@OneToMany(mappedBy = "thisinh")
	private List<DuThiEntity> duthi;

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public Date getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getNoisinh() {
		return noisinh;
	}

	public void setNoisinh(String noisinh) {
		this.noisinh = noisinh;
	}

	public Date getNgaycap() {
		return ngaycap;
	}

	public void setNgaycap(Date ngaycap) {
		this.ngaycap = ngaycap;
	}

	public String getNoicap() {
		return noicap;
	}

	public void setNoicap(String noicap) {
		this.noicap = noicap;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<DangKyEntity> getDangky() {
		return dangky;
	}

	public void setDangky(List<DangKyEntity> dangky) {
		this.dangky = dangky;
	}

	public List<DuThiEntity> getDuthi() {
		return duthi;
	}

	public void setDuthi(List<DuThiEntity> duthi) {
		this.duthi = duthi;
	}


	
}
