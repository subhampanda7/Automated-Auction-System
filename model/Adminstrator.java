package com.model;

public class Adminstrator {
	
	private int id;
	private String paswword;
	private String name; 
	private String address; 
	private String mobile; 
	
	public Adminstrator() {
		// TODO Auto-generated constructor stub
	}

	public Adminstrator(int id, String paswword, String name, String address, String mobile) {
		super();
		this.id = id;
		this.paswword = paswword;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPaswword() {
		return paswword;
	}

	public void setPaswword(String paswword) {
		this.paswword = paswword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Adminstrator [id=" + id + ", paswword=" + paswword + ", name=" + name + ", address=" + address
				+ ", mobile=" + mobile + "]";
	}

	

}
