package com.laptrinhjavaweb.dto;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;


public class DangKyDTO {

    private String makhoathi;
    private String cmnd;
    private String tentrinhdo;

   
	private ThiSinhDTO thisinh;
	private TrinhDoDTO trinhdo;
	
	public String getMakhoathi() {
		return makhoathi;
	}
	public void setMakhoathi(String makhoathi) {
		this.makhoathi = makhoathi;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public String getTentrinhdo() {
		return tentrinhdo;
	}
	public void setTentrinhdo(String tentrinhdo) {
		this.tentrinhdo = tentrinhdo;
	}
	public ThiSinhDTO getThisinh() {
		return thisinh;
	}
	public void setThisinh(ThiSinhDTO thisinh) {
		this.thisinh = thisinh;
	}
	public TrinhDoDTO getTrinhdo() {
		return trinhdo;
	}
	public void setTrinhdo(TrinhDoDTO trinhdo) {
		this.trinhdo = trinhdo;
	}
	
	
	
}
