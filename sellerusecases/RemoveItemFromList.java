package com.sellerusecases;

import java.util.Scanner;

import com.exceptions.SellerException;
import com.sellerdao.SellerDao;
import com.sellerdao.SellerDaoImpl;

public class RemoveItemFromList {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Seller Id To Remove The Product");
		int id = sc.nextInt();
		
		sc.close();
		
		SellerDao dao = new SellerDaoImpl();
		
		try {
			String result = dao.removeItemFromList(id);
			System.out.println(result);
		} catch (SellerException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
