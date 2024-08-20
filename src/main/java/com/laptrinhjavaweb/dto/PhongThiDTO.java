package com.laptrinhjavaweb.dto;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;




public class PhongThiDTO {

    private String maphongthi;
    private String tenphongthi;
    private int soluong;
    private String tentrinhdo;
    private String makhoathi;

    
	private TrinhDoDTO trinhdo;
	
	
	private KhoaThiDTO khoathi;
	
	
	private List<DuThiDTO> duthi;
	
	
	private List<BaiThiDTO> baithi;
	
	
    private List<GiaoVienDTO> giaovien;


	public String getMaphongthi() {
		return maphongthi;
	}


	public void setMaphongthi(String maphongthi) {
		this.maphongthi = maphongthi;
	}


	public String getTenphongthi() {
		return tenphongthi;
	}


	public void setTenphongthi(String tenphongthi) {
		this.tenphongthi = tenphongthi;
	}


	public int getSoluong() {
		return soluong;
	}


	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}


	public String getTentrinhdo() {
		return tentrinhdo;
	}


	public void setTentrinhdo(String tentrinhdo) {
		this.tentrinhdo = tentrinhdo;
	}


	public String getMakhoathi() {
		return makhoathi;
	}


	public void setMakhoathi(String makhoathi) {
		this.makhoathi = makhoathi;
	}


	public TrinhDoDTO getTrinhdo() {
		return trinhdo;
	}


	public void setTrinhdo(TrinhDoDTO trinhdo) {
		this.trinhdo = trinhdo;
	}


	public KhoaThiDTO getKhoathi() {
		return khoathi;
	}


	public void setKhoathi(KhoaThiDTO khoathi) {
		this.khoathi = khoathi;
	}


	public List<DuThiDTO> getDuthi() {
		return duthi;
	}


	public void setDuthi(List<DuThiDTO> duthi) {
		this.duthi = duthi;
	}


	public List<BaiThiDTO> getBaithi() {
		return baithi;
	}


	public void setBaithi(List<BaiThiDTO> baithi) {
		this.baithi = baithi;
	}


	public List<GiaoVienDTO> getGiaovien() {
		return giaovien;
	}


	public void setGiaovien(List<GiaoVienDTO> giaovien) {
		this.giaovien = giaovien;
	}


	

}
