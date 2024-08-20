package com.laptrinhjavaweb.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "baithi")
public class BaiThiEntity {

	@Id
	@Column(name = "MaBaiThi")
	private String mabaithi;

	@ManyToOne
	@JoinColumn(name = "MaPhongThi")
	private PhongThiEntity phongthi;

	@Column(name = "SBD")
	private String sbd;
	
	@OneToMany(mappedBy = "baithi")
	private List<DiemThiEntity> diemthi;

	

	public String getMabaithi() {
		return mabaithi;
	}

	public void setMabaithi(String mabaithi) {
		this.mabaithi = mabaithi;
	}

	public PhongThiEntity getPhongthi() {
		return phongthi;
	}

	public void setPhongthi(PhongThiEntity phongthi) {
		this.phongthi = phongthi;
	}

	public String getSbd() {
		return sbd;
	}

	public void setSbd(String sbd) {
		this.sbd = sbd;
	}

	public List<DiemThiEntity> getDiemthi() {
		return diemthi;
	}

	public void setDiemthi(List<DiemThiEntity> diemthi) {
		this.diemthi = diemthi;
	}
	
	

}
