package com.controller.store.model;

public class production implements java.io.Serializable {

	private String pro_id;
	private String pro_name;
	private sale pro_sale;
	private orders pro_order;
	private String prosale_price;
	private String proorder_price;
	

	public String getPro_id() {
		return pro_id;
	}

	public void setPro_id(String pro_id) {
		this.pro_id = pro_id;
	}

	public String getPro_name() {
		return pro_name;
	}

	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}

	public sale getPro_sale() {
		return pro_sale;
	}

	public void setPro_sale(sale pro_sale) {
		this.pro_sale = pro_sale;
	}
	
	

	public orders getPro_order() {
		return pro_order;
	}

	public void setPro_order(orders pro_order) {
		this.pro_order =pro_order;
	}
	
	

	public String getProsale_price() {
		return prosale_price;
	}

	public void setProsale_price(String prosale_price) {
		this.prosale_price = prosale_price;
	}
	
	

	public String getProorder_price() {
		return proorder_price;
	}

	public void setProorder_price(String proorder_price) {
		this.proorder_price = proorder_price;
	}
}
