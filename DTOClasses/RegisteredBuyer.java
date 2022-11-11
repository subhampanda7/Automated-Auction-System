package com.DTOClasses;

public class RegisteredBuyer {
	
	private int administration_Id;
	private int buyer_Id;
	private String name;
	private String address;
	private String mobile;
	private String any_Problem;
	
	public RegisteredBuyer() {
		// TODO Auto-generated constructor stub
	}

	public RegisteredBuyer(int administration_Id, int buyer_Id, String name, String address, String mobile,
			String any_Problem) {
		super();
		this.administration_Id = administration_Id;
		this.buyer_Id = buyer_Id;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.any_Problem = any_Problem;
	}

	public int getAdministration_Id() {
		return administration_Id;
	}

	public void setAdministration_Id(int administration_Id) {
		this.administration_Id = administration_Id;
	}

	public int getBuyer_Id() {
		return buyer_Id;
	}

	public void setBuyer_Id(int buyer_Id) {
		this.buyer_Id = buyer_Id;
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

	public String getAny_Problem() {
		return any_Problem;
	}

	public void setAny_Problem(String any_Problem) {
		this.any_Problem = any_Problem;
	}

	@Override
	public String toString() {
		return "RegisteredBuyer [administration_Id=" + administration_Id + ", buyer_Id=" + buyer_Id + ", name=" + name
				+ ", address=" + address + ", mobile=" + mobile + ", any_Problem=" + any_Problem + "]";
	}
	
	

}
