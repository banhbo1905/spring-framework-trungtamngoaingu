package com.laptrinhjavaweb.entity;


import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DangKyKey implements Serializable {

     private String makhoathi;

     private String cmnd;

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

	@Override
	public int hashCode() {
		return Objects.hash(cmnd, makhoathi);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DangKyKey other = (DangKyKey) obj;
		return Objects.equals(cmnd, other.cmnd) && Objects.equals(makhoathi, other.makhoathi);
	}

	

	
}