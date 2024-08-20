package com.laptrinhjavaweb.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.OneToMany;



public class KhoaThiDTO {

    private String makhoathi;
    private String tenkhoathi;
    private Date ngaythi;    

	private List<PhongThiDTO> phongthi;
	
	private List<DangKyDTO> dangky;

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

	public List<PhongThiDTO> getPhongthi() {
		return phongthi;
	}

	public void setPhongthi(List<PhongThiDTO> phongthi) {
		this.phongthi = phongthi;
	}

	public List<DangKyDTO> getDangky() {
		return dangky;
	}

	public void setDangky(List<DangKyDTO> dangky) {
		this.dangky = dangky;
	}

	
	
}
