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
@Table(name = "duthi")
public class DuThiEntity {
	
	@EmbeddedId
    private DuThiKey duThiKey = new DuThiKey();
	
	@ManyToOne
	@MapsId("maphongthi")
	@JoinColumn(name = "MaPhongThi")
	private PhongThiEntity phongthi;
	

	@ManyToOne
	@MapsId("cmnd")
	@JoinColumn(name = "CMND")
	private ThiSinhEntity thisinh;
	
	
	@Column(name = "SBD")
	private String sbd;


	public DuThiKey getDuThiKey() {
		return duThiKey;
	}


	public void setDuThiKey(DuThiKey duThiKey) {
		this.duThiKey = duThiKey;
	}


	




	public PhongThiEntity getPhongthi() {
		return phongthi;
	}


	public void setPhongthi(PhongThiEntity phongthi) {
		this.phongthi = phongthi;
	}


	public ThiSinhEntity getThisinh() {
		return thisinh;
	}


	public void setThisinh(ThiSinhEntity thisinh) {
		this.thisinh = thisinh;
	}


	public String getSbd() {
		return sbd;
	}


	public void setSbd(String sbd) {
		this.sbd = sbd;
	}


	
	
}
