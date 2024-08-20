package com.laptrinhjavaweb.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.OneToMany;


public class ThiSinhDTO {

    private String cmnd;
    private String hoten;
    private String gioitinh;
    private Date ngaysinh;
    private String noisinh;
    private Date ngaycap;
    private String noicap;
    private String sdt;
    private String email;
    

	private List<DangKyDTO> dangky;

	private List<DuThiDTO> duthi;

	private DuThiDTO duthitheosbd;

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

	public List<DangKyDTO> getDangky() {
		return dangky;
	}

	public void setDangky(List<DangKyDTO> dangky) {
		this.dangky = dangky;
	}

	public List<DuThiDTO> getDuthi() {
		return duthi;
	}

	public void setDuthi(List<DuThiDTO> duthi) {
		this.duthi = duthi;
	}

	public DuThiDTO getDuthitheosbd() {
		return duthitheosbd;
	}

	public void setDuthitheosbd(DuThiDTO duthitheosbd) {
		this.duthitheosbd = duthitheosbd;
	}
}
