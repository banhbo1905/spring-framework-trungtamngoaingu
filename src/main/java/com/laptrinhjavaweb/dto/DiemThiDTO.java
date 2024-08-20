package com.laptrinhjavaweb.dto;
import java.util.ArrayList;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;



public class DiemThiDTO {
	
    private String tenphanthi;
    private String mabaithi;
    private float diem;
    
  
	private PhanThiDTO phanthi;
	
	private BaiThiDTO baithi;

	public String getTenphanthi() {
		return tenphanthi;
	}

	public void setTenphanthi(String tenphanthi) {
		this.tenphanthi = tenphanthi;
	}

	public String getMabaithi() {
		return mabaithi;
	}

	public void setMabaithi(String mabaithi) {
		this.mabaithi = mabaithi;
	}

	public float getDiem() {
		return diem;
	}

	public void setDiem(float diem) {
		this.diem = diem;
	}

	public PhanThiDTO getPhanthi() {
		return phanthi;
	}

	public void setPhanthi(PhanThiDTO phanthi) {
		this.phanthi = phanthi;
	}

	public BaiThiDTO getBaithi() {
		return baithi;
	}

	public void setBaithi(BaiThiDTO baithi) {
		this.baithi = baithi;
	}


	

    
}
