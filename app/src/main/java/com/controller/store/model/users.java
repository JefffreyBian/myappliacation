package com.controller.store.model;

import java.util.Set;


public class users implements java.io.Serializable {
		private Integer user_id;
		private String user_pw;
		private String user_name;
		private String user_phnum;
		private String user_mail;
		private String user_barcode;

		public String getUser_barcode() {
			return user_barcode;
		}
		public void setUser_barcode(String user_barcode) {
			this.user_barcode = user_barcode;
		}
		private Set<orders>  user_orders;
		public void setUser_pw(String user_pw) {
			this.user_pw = user_pw;
		}

		public Integer getUser_id() {
			return user_id;
		}
		public void setUser_id(Integer user_id) {
			this.user_id = user_id;
		}
		

		public String getUser_name() {
			return user_name;
		}
		public void setUser_name(String user_name) {
			this.user_name = user_name;
		}

		public String getUser_pw() {
			return user_pw;
		}
		public void setUser_adre(String user_pw) {
			this.user_pw = user_pw;
		}

		public String getUser_phnum() {
			return user_phnum;
		}
		public void setUser_phnum(String user_phnum) {
			this.user_phnum = user_phnum;
		}

		public String getUser_mail() {
			return user_mail;
		}
		public void setUser_mail(String user_mail) {
			this.user_mail = user_mail;
		}

		public Set<orders> getUser_orders() {
			return user_orders;
		}
		public void setUser_orders(Set<orders> user_orders) {
			this.user_orders = user_orders;
		}


}
