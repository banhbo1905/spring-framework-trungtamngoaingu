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
@Table(name = "trinhdo")
public class TrinhDoEntity {

	@Id
	@Column(name = "TenTrinhDo")
	private String tentrinhdo;
	
	@OneToMany(mappedBy = "trinhdo")
	private List<PhongThiEntity> phongthi;
	
	@OneToMany(mappedBy = "trinhdo")
	private List<DangKyEntity> dangky;

	

	public String getTentrinhdo() {
		return tentrinhdo;
	}

	public void setTentrinhdo(String tentrinhdo) {
		this.tentrinhdo = tentrinhdo;
	}

	public List<PhongThiEntity> getPhongthi() {
		return phongthi;
	}

	public void setPhongthi(List<PhongThiEntity> phongthi) {
		this.phongthi = phongthi;
	}

	public List<DangKyEntity> getDangky() {
		return dangky;
	}

	public void setDangky(List<DangKyEntity> dangky) {
		this.dangky = dangky;
	}


	
	
}
