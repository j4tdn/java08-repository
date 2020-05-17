package com.haubui.lesson03_oop_overview.bean;

//pojo object
public class Customer {

	//attributes
	private String id;
	private String fullName;
	private String phone;
	private String address;

	//default constructor
	public Customer() {
	}

	public Customer(String name, String phone, String id, String address) {
		this.fullName = name;
		this.phone = phone;
		this.id = id;
		this.address = address;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String name) {
		this.fullName = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
