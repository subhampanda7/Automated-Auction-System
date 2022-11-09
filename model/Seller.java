package com.model;

public class Seller {
	
	private int id;
	private int aid;
	private String name;
	private String address;
	private String mobile;
	private String icategory;
	private String iname;
	private int iprice;
	private int iquantity;
	private String sold;
	private String problem;
	
	public Seller() {
		// TODO Auto-generated constructor stub
	}

	public Seller(int id, int aid, String name, String address, String mobile, String icategory, String iname,
			int iprice, int iquantity, String sold, String problem) {
		super();
		this.id = id;
		this.aid = aid;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.icategory = icategory;
		this.iname = iname;
		this.iprice = iprice;
		this.iquantity = iquantity;
		this.sold = sold;
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

	public String getIcategory() {
		return icategory;
	}

	public void setIcategory(String icategory) {
		this.icategory = icategory;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public int getIprice() {
		return iprice;
	}

	public void setIprice(int iprice) {
		this.iprice = iprice;
	}

	public int getIquantity() {
		return iquantity;
	}

	public void setIquantity(int iquantity) {
		this.iquantity = iquantity;
	}

	public String getSold() {
		return sold;
	}

	public void setSold(String sold) {
		this.sold = sold;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", aid=" + aid + ", name=" + name + ", address=" + address + ", mobile=" + mobile
				+ ", icategory=" + icategory + ", iname=" + iname + ", iprice=" + iprice + ", iquantity=" + iquantity
				+ ", sold=" + sold + ", problem=" + problem + "]";
	}
	
		
}
