package com.buyerdao;

import java.util.List;

import com.DTOClasses.BuyerAndItems;
import com.exceptions.BuyerException;
import com.model.Buyer;
import com.model.SellerSpecific;

public interface BuyerDao {
	
	public String registerBuyer(Buyer buyer) throws BuyerException;
	
	public List<SellerSpecific> viewItemsByCategory(String category) throws BuyerException;
	
	public List<BuyerAndItems> viewAllBuyerAndItems() throws BuyerException;
	
	public String SelectItemsToBuy(String item) throws BuyerException;
	
}
