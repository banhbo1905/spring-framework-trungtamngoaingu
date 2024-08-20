package com.laptrinhjavaweb.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class GiaoVienDTO {

    private String magiaovien;
    private String hoten;
    private String email;
    private String gioitinh;
    private Date ngaysinh;
    private String sdt;

    private List<PhongThiDTO> phongthi;

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

	public List<PhongThiDTO> getPhongthi() {
		return phongthi;
	}

	public void setPhongthi(List<PhongThiDTO> phongthi) {
		this.phongthi = phongthi;
	}

	
}
