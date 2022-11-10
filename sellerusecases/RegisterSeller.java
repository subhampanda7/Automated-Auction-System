package com.sellerusecases;

import java.util.Scanner;

import com.exceptions.SellerException;
import com.model.Seller;
import com.sellerdao.SellerDao;
import com.sellerdao.SellerDaoImpl;

public class RegisterSeller {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to seller portal");
		
		System.out.println("Enter seller id");
		int id = sc.nextInt();
		
		System.out.println("Enter valid anministration id");
		int aid = sc.nextInt();
		
		System.out.println("Enter seller name");
		String name = sc.next();
		
		System.out.println("Enter seller address");
		String address = sc.next();
		
		System.out.println("Enter seller mobile");
		String mobile= sc.next();
		
		System.out.println("Enter item category");
		String  category= sc.next();
		
		System.out.println("Enter item name");
		String iname = sc.next();
		
		System.out.println("Enter item price");
		int iprice = sc.nextInt();
		
		System.out.println("Enter item quantity");
		int iqty = sc.nextInt();
		
		System.out.println("Is item sold?");
		String sold = sc.next();
		
		System.out.println("Do you have any Problem?");
		String  problem = sc.next();
		
		sc.close();
		
		SellerDao dao = new SellerDaoImpl();
		
		try {
			String result = dao.registerSeller(new Seller(id, aid, name, address, mobile, category, iname, iprice, iqty, sold, problem));
			System.out.println(result);
		} catch (SellerException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
