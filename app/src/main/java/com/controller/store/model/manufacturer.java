package com.controller.store.model;

import java.util.Set;


public class manufacturer implements java.io.Serializable {
	private Integer mfr_id;
	private String mfr_name;
	private String mfr_adre;
	private String mfr_phnum;
	private String mfr_mail;
	private Set<orders> orderlist;

	public Integer getMfr_id() {
		return mfr_id;
	}
	public void setMfr_id(Integer mfr_id) {
		this.mfr_id = mfr_id;
	}
	

	public String getMfr_name() {
		return mfr_name;
	}
	public void setMfr_name(String mfr_name) {
		this.mfr_name = mfr_name;
	}

	public String getMfr_adre() {
		return mfr_adre;
	}
	public void setMfr_adre(String mfr_adre) {
		this.mfr_adre = mfr_adre;
	}

	public String getMfr_phnum() {
		return mfr_phnum;
	}
	public void setMfr_phnum(String mfr_phnum) {
		this.mfr_phnum = mfr_phnum;
	}
	public Set<orders> getOrderlist() {
		return orderlist;
	}
	public void setOrderlist(Set<orders> orderlist) {
		this.orderlist = orderlist;
	}

}
