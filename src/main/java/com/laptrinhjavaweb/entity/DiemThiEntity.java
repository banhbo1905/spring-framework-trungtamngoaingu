package com.laptrinhjavaweb.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "diemthi")
public class DiemThiEntity {
	
	@EmbeddedId
    private DiemThiKey diemThiKey = new DiemThiKey();
	
	@ManyToOne
	@MapsId("tenphanthi")
	@JoinColumn(name = "TenPhanThi")
	private PhanThiEntity phanthi;
	

	@ManyToOne
	@MapsId("mabaithi")
	@JoinColumn(name = "MaBaiThi")
	private BaiThiEntity baithi;
	
	
	@Column(name = "DIEM")
	private float diem;


	public DiemThiKey getDiemThiKey() {
		return diemThiKey;
	}


	public void setDiemThiKey(DiemThiKey diemThiKey) {
		this.diemThiKey = diemThiKey;
	}


	public PhanThiEntity getPhanthi() {
		return phanthi;
	}


	public void setPhanthi(PhanThiEntity phanthi) {
		this.phanthi = phanthi;
	}


	public BaiThiEntity getBaithi() {
		return baithi;
	}


	public void setBaithi(BaiThiEntity baithi) {
		this.baithi = baithi;
	}


	public float getDiem() {
		return diem;
	}


	public void setDiem(float diem) {
		this.diem = diem;
	}


	
	
	
}
