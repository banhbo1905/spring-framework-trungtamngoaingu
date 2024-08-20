package com.laptrinhjavaweb.entity;


import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DuThiKey implements Serializable {

     private String maphongthi;

     private String cmnd;

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

	@Override
	public int hashCode() {
		return Objects.hash(cmnd, maphongthi);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DuThiKey other = (DuThiKey) obj;
		return Objects.equals(cmnd, other.cmnd) && Objects.equals(maphongthi, other.maphongthi);
	}

	
}