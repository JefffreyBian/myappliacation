package com.controller.store.model;

import java.util.Set;


public class customer implements java.io.Serializable {
	private Integer cust_id;
	private String cust_name;
	private String cust_adre;
	private String cust_phnum;
	private String cust_mail;
	private Set<sale> salelist;

	public Integer getCust_id() {
		return cust_id;
	}
	public void setCust_id(Integer cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getCust_adre() {
		return cust_adre;
	}
	public void setCust_adre(String cust_adre) {
		this.cust_adre = cust_adre;
	}
	public String getCust_phnum() {
		return cust_phnum;
	}
	public void setCust_phnum(String cust_phnum) {
		this.cust_phnum = cust_phnum;
	}
	public String getCust_mail() {
		return cust_mail;
	}
	public void setCust_mail(String cust_mail) {
		this.cust_mail = cust_mail;
	}
	public Set<sale> getSalelist() {
		return salelist;
	}
	public void setSalelist(Set<sale> salelist) {
		this.salelist = salelist;
	}

}
