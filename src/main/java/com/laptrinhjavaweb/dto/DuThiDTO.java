package com.laptrinhjavaweb.dto;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;




public class DuThiDTO {

    private String maphongthi;
    private String cmnd;
    private String sbd;
    

	private PhongThiDTO phongthi;
	private ThiSinhDTO thisinh;
	public String getMaphongthi() {
		return maphongthi;
	}
	public void setMaphongthi(String maphongthi) {
		this.maphongthi = maphongthi;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public String getSbd() {
		return sbd;
	}
	public void setSbd(String sbd) {
		this.sbd = sbd;
	}
	public PhongThiDTO getPhongthi() {
		return phongthi;
	}
	public void setPhongthi(PhongThiDTO phongthi) {
		this.phongthi = phongthi;
	}
	public ThiSinhDTO getThisinh() {
		return thisinh;
	}
	public void setThisinh(ThiSinhDTO thisinh) {
		this.thisinh = thisinh;
	}
	
	
	
	
}
