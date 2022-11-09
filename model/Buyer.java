package com.model;

public class Buyer {
	
	private int id;
	private int aid;
	private String name;
	private String address;
	private String mobile;
	private String problem;
	
	public Buyer() {
		// TODO Auto-generated constructor stub
	}

	public Buyer(int id, int aid, String name, String address, String mobile, String problem) {
		super();
		this.id = id;
		this.aid = aid;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.problem = problem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
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

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	@Override
	public String toString() {
		return "Buyer [id=" + id + ", aid=" + aid + ", name=" + name + ", address=" + address + ", mobile=" + mobile
				+ ", problem=" + problem + "]";
	}
	
	
}
