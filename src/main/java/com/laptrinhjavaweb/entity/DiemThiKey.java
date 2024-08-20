package com.laptrinhjavaweb.entity;


import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DiemThiKey implements Serializable {

     private String tenphanthi;

     private String mabaithi;

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

	@Override
	public int hashCode() {
		return Objects.hash(mabaithi, tenphanthi);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiemThiKey other = (DiemThiKey) obj;
		return Objects.equals(mabaithi, other.mabaithi) && Objects.equals(tenphanthi, other.tenphanthi);
	}

	
}