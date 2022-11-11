package com.DTOClasses;

public class SellingReport {
	
	private int seller_id;
	private String seller_Name;
	private String item_Category;
	private String item_Name;
	private int item_Quantity;
	private String sold;
	
	public SellingReport() {
		// TODO Auto-generated constructor stub
	}

	public SellingReport(int seller_id, String seller_Name, String item_Category, String item_Name, int item_Quantity,
			String sold) {
		super();
		this.seller_id = seller_id;
		this.seller_Name = seller_Name;
		this.item_Category = item_Category;
		this.item_Name = item_Name;
		this.item_Quantity = item_Quantity;
		this.sold = sold;
	}

	public int getSeller_id() {
		return seller_id;
	}

	public void setSeller_id(int seller_id) {
		this.seller_id = seller_id;
	}

	public String getSeller_Name() {
		return seller_Name;
	}

	public void setSeller_Name(String seller_Name) {
		this.seller_Name = seller_Name;
	}

	public String getItem_Category() {
		return item_Category;
	}

	public void setItem_Category(String item_Category) {
		this.item_Category = item_Category;
	}

	public String getItem_Name() {
		return item_Name;
	}

	public void setItem_Name(String item_Name) {
		this.item_Name = item_Name;
	}

	public int getItem_Quantity() {
		return item_Quantity;
	}

	public void setItem_Quantity(int item_Quantity) {
		this.item_Quantity = item_Quantity;
	}

	public String getSold() {
		return sold;
	}

	public void setSold(String sold) {
		this.sold = sold;
	}

	@Override
	public String toString() {
		return "SellingReport [seller_id=" + seller_id + ", seller_Name=" + seller_Name + ", item_Category="
				+ item_Category + ", item_Name=" + item_Name + ", item_Quantity=" + item_Quantity + ", sold=" + sold
				+ "]";
	}
	
	

}
