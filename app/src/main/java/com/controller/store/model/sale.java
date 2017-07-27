package com.controller.store.model;

import java.util.Date;
import java.util.Set;


public class sale implements java.io.Serializable {
	private String sale_id;
	private String sale_name;
	private String sale_price;
	private String sale_qut;
	private customer sale_cust;
	private Set<production> prolist;
	private Date sale_time;
	private boolean sale_state;

	public String getSale_id() {
		return sale_id;
	}
	public void setSale_id(String sale_id) {
		this.sale_id = sale_id;
	}
	

	public String getSale_name() {
		return sale_name;
	}
	public void setSale_name(String sale_name) {
		this.sale_name = sale_name;
	}
	

	public String getSale_price() {
		return sale_price;
	}
	public void setSale_price(String sale_price) {
		this.sale_price = sale_price;
	}


	public String getSale_qut() {
		return sale_qut;
	}
	public void setSale_qut(String sale_qut) {
		this.sale_qut = sale_qut;
	}
	

	public customer getSale_cust() {
		return sale_cust;
	}
	public void setSale_cust(customer sale_cust) {
		this.sale_cust = sale_cust;
	}

	public Date getSale_time(){
		return sale_time;
	}
	public void setSale_time(Date sale_time) {
		this.sale_time = sale_time;
	}

	public boolean getSale_state() {
		return sale_state;
	}
	public void setSale_state(boolean sale_state) {
		this.sale_state = sale_state;
	}

	public Set<production> getProlist() {
		return prolist;
	}
	public void setProlist(Set<production> prolist) {
		this.prolist = prolist;
	}
}
