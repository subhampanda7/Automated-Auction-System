package com.DTOClasses;

public class RegisteredSeller {
	
	private int administration_Id;
	private int seller_Id;
	private String name;
	private String address;
	private String mobile;
	private String any_Problem;
	
	public RegisteredSeller() {
		// TODO Auto-generated constructor stub
	}

	public RegisteredSeller(int administration_Id, int seller_Id, String name, String address, String mobile,
			String any_Problem) {
		super();
		this.administration_Id = administration_Id;
		this.seller_Id = seller_Id;
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

	public int getSeller_Id() {
		return seller_Id;
	}

	public void setSeller_Id(int seller_Id) {
		this.seller_Id = seller_Id;
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
		return "RegisteredSeller [administration_Id=" + administration_Id + ", seller_Id=" + seller_Id + ", name="
				+ name + ", address=" + address + ", mobile=" + mobile + ", any_Problem=" + any_Problem + "]";
	}
	
	

}
