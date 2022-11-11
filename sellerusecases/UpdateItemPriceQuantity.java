package com.sellerusecases;

import java.util.Scanner;

import com.exceptions.SellerException;
import com.model.Seller;
import com.sellerdao.SellerDao;
import com.sellerdao.SellerDaoImpl;

public class UpdateItemPriceQuantity {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Seller Id");
		int id = sc.nextInt();
		
		System.out.println("Enter Seller Price");
		int price = sc.nextInt();
		
		System.out.println("Enter Seller Quantity");
		int qty = sc.nextInt();
		
		sc.close();
		
		SellerDao dao = new SellerDaoImpl();
		
		Seller seller = new Seller();
		seller.setId(id);
		seller.setIprice(price);
		seller.setIquantity(qty);
		
		try {
			String result = dao.updateItemPriceQuantity(seller);
			System.out.println(result);
		} catch (SellerException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
