
package com.laptrinhjavaweb.dto;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;




public class BaiThiDTO {

    private String mabaithi;

    private String maphongthi;

	private String sbd;
	
	
	private PhongThiDTO phongthi;
	
	private List<DiemThiDTO> diemthi;

	

	public String getMabaithi() {
		return mabaithi;
	}

	public void setMabaithi(String mabaithi) {
		this.mabaithi = mabaithi;
	}

	public String getMaphongthi() {
		return maphongthi;
	}

	public void setMaphongthi(String maphongthi) {
		this.maphongthi = maphongthi;
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

	public List<DiemThiDTO> getDiemthi() {
		return diemthi;
	}

	public void setDiemthi(List<DiemThiDTO> diemthi) {
		this.diemthi = diemthi;
	}

	
	
	

}
