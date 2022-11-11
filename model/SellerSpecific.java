package com.model;

public class SellerSpecific {
	
	private String item_category;
	private String item_name;
	
	public SellerSpecific() {
		// TODO Auto-generated constructor stub
	}

	public SellerSpecific(String item_category, String item_name) {
		super();
		this.item_category = item_category;
		this.item_name = item_name;
	}

	public String getItem_category() {
		return item_category;
	}

	public void setItem_category(String item_category) {
		this.item_category = item_category;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	@Override
	public String toString() {
		return "SellerSpecific [item_category=" + item_category + ", item_name=" + item_name + "]";
	}

}
