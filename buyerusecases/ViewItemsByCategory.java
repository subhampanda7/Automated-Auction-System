package com.buyerusecases;

import java.util.List;
import java.util.Scanner;

import com.buyerdao.BuyerDao;
import com.buyerdao.BuyerDaoImpl;
import com.exceptions.BuyerException;
import com.model.SellerSpecific;

public class ViewItemsByCategory {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Category Name");
		String name = sc.next();
		
		sc.close();
		
		BuyerDao dao = new BuyerDaoImpl();
		
		try {
			List<SellerSpecific> sellerSpecifics = dao.viewItemsByCategory(name);
			sellerSpecifics.forEach(s -> {
				System.out.println("Item category : "+s.getItem_category());
				System.out.println("Item name : "+s.getItem_name());
				
				System.out.println("------------------------------");
			});
			
			System.out.println("=====================================");
			
		} catch (BuyerException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
