package com.sellerdao;

import java.util.List;

import com.exceptions.SellerException;
import com.model.Seller;

public interface SellerDao {
	
	public String registerSeller(Seller seller) throws SellerException;
	
	public String updateItemPriceQuantity(Seller seller) throws SellerException;
	
	public String removeItemFromList(int id) throws SellerException;
	
	public List<Seller> viewSoldItem() throws SellerException;

}
