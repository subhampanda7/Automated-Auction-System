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
			andItems.forEach(System.out::println);
		} catch (BuyerException e) {
			System.out.println(e.getMessage());
		}
	
		
	}

}
