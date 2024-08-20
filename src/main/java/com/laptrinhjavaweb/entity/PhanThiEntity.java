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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "phanthi")
public class PhanThiEntity {

	@Id
	@Column(name = "TenPhanThi")
	private String tenphanthi;
	
	@OneToMany(mappedBy = "phanthi")
	private List<DiemThiEntity> diemthi;



	public String getTenphanthi() {
		return tenphanthi;
	}

	public void setTenphanthi(String tenphanthi) {
		this.tenphanthi = tenphanthi;
	}

	public List<DiemThiEntity> getDiemthi() {
		return diemthi;
	}

	public void setDiemthi(List<DiemThiEntity> diemthi) {
		this.diemthi = diemthi;
	}


	
	
}
