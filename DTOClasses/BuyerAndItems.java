package com.DTOClasses;

public class BuyerAndItems {
	
	private String buyer_Name;
	private String buyer_Address;
	
	private String item_Category;
	private String item_Name;
	private int item_Price;
	private int item_Quantity;
	
	public BuyerAndItems() {
		// TODO Auto-generated constructor stub
	}
	
	

	public BuyerAndItems(String buyer_Name, String buyer_Address, String item_Category, String item_Name,
			int item_Price, int item_Quantity) {
		super();
		this.buyer_Name = buyer_Name;
		this.buyer_Address = buyer_Address;
		this.item_Category = item_Category;
		this.item_Name = item_Name;
		this.item_Price = item_Price;
		this.item_Quantity = item_Quantity;
	}



	public String getBuyer_Name() {
		return buyer_Name;
	}

	public void setBuyer_Name(String buyer_Name) {
		this.buyer_Name = buyer_Name;
	}

	public String getBuyer_Address() {
		return buyer_Address;
	}

	public void setBuyer_Address(String buyer_Address) {
		this.buyer_Address = buyer_Address;
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

	public int getItem_Price() {
		return item_Price;
	}

	public void setItem_Price(int item_Price) {
		this.item_Price = item_Price;
	}

	public int getItem_Quantity() {
		return item_Quantity;
	}

	public void setItem_Quantity(int item_Quantity) {
		this.item_Quantity = item_Quantity;
	}

	@Override
	public String toString() {
		return "BuyerAndItems [buyer_Name=" + buyer_Name + ", buyer_Address=" + buyer_Address + ", item_Category="
				+ item_Category + ", item_Name=" + item_Name + ", item_Price=" + item_Price + ", item_Quantity="
				+ item_Quantity + "]";
	}
	
	
	
	
	
	
	
	

}
