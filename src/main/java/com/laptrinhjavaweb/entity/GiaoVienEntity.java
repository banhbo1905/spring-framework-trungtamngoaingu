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
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "giaovien")
public class GiaoVienEntity {

	@Id
	@Column(name = "MaGiaoVien")
	private String magiaovien;

	@Column(name = "HoTen")
	private String hoten;

	@Column(name = "Email")
	private String email;

	@Column(name = "GioiTinh")
	private String gioitinh;

	@Column(name = "NgaySinh")
	private Date ngaysinh;

	@Column(name = "SDT")
	private String sdt;
	
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "gacthi", joinColumns = @JoinColumn(name = "MaGiaoVien"), 
								  inverseJoinColumns = @JoinColumn(name = "MaPhongThi"))
	private List<PhongThiEntity> phongthi = new ArrayList<>();


	public String getMagiaovien() {
		return magiaovien;
	}


	public void setMagiaovien(String magiaovien) {
		this.magiaovien = magiaovien;
	}


	public String getHoten() {
		return hoten;
	}


	public void setHoten(String hoten) {
		this.hoten = hoten;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
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


	public String getSdt() {
		return sdt;
	}


	public void setSdt(String sdt) {
		this.sdt = sdt;
	}


	public List<PhongThiEntity> getPhongthi() {
		return phongthi;
	}


	public void setPhongthi(List<PhongThiEntity> phongthi) {
		this.phongthi = phongthi;
	}

	
	
	
}
