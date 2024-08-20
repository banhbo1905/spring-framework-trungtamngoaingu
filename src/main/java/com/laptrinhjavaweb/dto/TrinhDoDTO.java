package com.laptrinhjavaweb.dto;

import java.util.List;

import javax.persistence.OneToMany;


public class TrinhDoDTO {

    private String tentrinhdo;
    
	private List<PhongThiDTO> phongthi;

	private List<DangKyDTO> dangky;

	public String getTentrinhdo() {
		return tentrinhdo;
	}

	public void setTentrinhdo(String tentrinhdo) {
		this.tentrinhdo = tentrinhdo;
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
