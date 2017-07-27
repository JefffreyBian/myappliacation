package com.controller.store.model;

import java.util.Date;
import java.util.Set;


public class orders implements java.io.Serializable {
private String order_id;
private String order_name;
private String order_price;
private String order_qut;
private users order_user;
private manufacturer order_mfr;
private Date order_time;
private boolean order_state;
private Set<production> prolist;


public String getOrder_id() {
	return order_id;
}
public void setOrder_id(String order_id) {
	this.order_id = order_id;
}



public String getOrder_name() {
	return order_name;
}
public void setOrder_name(String order_name) {
	this.order_name = order_name;
}

public String getOrder_price() {
	return order_price;
}
public void setOrder_price(String order_price) {
	this.order_price = order_price;
}


public String getOrder_qut() {
	return order_qut;
}
public void setOrder_qut(String order_qut) {
	this.order_qut = order_qut;
}


public manufacturer getOrder_mfr() {
	return order_mfr;
}
public void setOrder_mfr(manufacturer order_mfr) {
	this.order_mfr = order_mfr;
}

public users getOrder_user() {
	return order_user;
}
public void setOrder_user(users order_user) {
	this.order_user = order_user;
}



public Date getOrder_time() {
	return order_time;
}
public void setOrder_time(Date order_time) {
	this.order_time = order_time;
}


public boolean getOrder_state() {
	return order_state;
}
public void setOrder_state(boolean order_state) {
	this.order_state = order_state;
}


public Set<production> getProlist() {
	return prolist;
}
public void setProlist(Set<production> prolist) {
	this.prolist = prolist;
}
}
