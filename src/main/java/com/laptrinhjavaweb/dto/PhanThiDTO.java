package com.laptrinhjavaweb.dto;

import java.util.List;


public class PhanThiDTO {
    private String tenphanthi;

    private List<DiemThiDTO> diemthi;

	public String getTenphanthi() {
		return tenphanthi;
	}

	public void setTenphanthi(String tenphanthi) {
		this.tenphanthi = tenphanthi;
	}

	public List<DiemThiDTO> getDiemthi() {
		return diemthi;
	}

	public void setDiemthi(List<DiemThiDTO> diemthi) {
		this.diemthi = diemthi;
	}

	
}
