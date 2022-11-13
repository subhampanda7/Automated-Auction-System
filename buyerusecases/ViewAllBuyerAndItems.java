package com.buyerusecases;

import java.util.List;

import com.DTOClasses.BuyerAndItems;
import com.buyerdao.BuyerDao;
import com.buyerdao.BuyerDaoImpl;
import com.exceptions.BuyerException;

public class ViewAllBuyerAndItems {
	
	public static void main(String[] args) {
		
		BuyerDao dao = new BuyerDaoImpl();
		
		try {
			List<BuyerAndItems> andItems = dao.viewAllBuyerAndItems();
			andItems.forEach(b -> {
				System.out.println("Buyer name : "+b.getBuyer_Name());
				System.out.println("Buyer address : "+b.getBuyer_Address());
				System.out.println("Item category : "+b.getItem_Category());
				System.out.println("Item name : "+b.getItem_Name());
				System.out.println("Item price : "+b.getItem_Price());
				System.out.println("Item quantity : "+b.getItem_Quantity());
				System.out.println("----------------------------------------");
			});
			
			System.out.println("=====================================");
			
		} catch (BuyerException e) {
			System.out.println(e.getMessage());
		}
	
		
	}

}
