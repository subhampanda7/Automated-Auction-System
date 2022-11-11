package com.buyerusecases;

import java.util.Scanner;

import com.buyerdao.BuyerDao;
import com.buyerdao.BuyerDaoImpl;
import com.exceptions.BuyerException;
import com.model.Buyer;

public class RegisterBuyer {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter buyer id");
		int id = sc.nextInt();
		
		System.out.println("Enter valid anministration id");
		int aid = sc.nextInt();
		
		System.out.println("Enter buyer name");
		String name = sc.next();
		
		System.out.println("Enter buyer address");
		String address = sc.next();
		
		System.out.println("Enter buyer mobile");
		String mobile = sc.next();
		
		System.out.println("Do you have any Problem?");
		String problem = sc.next();
		
		sc.close();
		
		BuyerDao dao = new BuyerDaoImpl();
		
		try {
			String result = dao.registerBuyer(new Buyer(id, aid, name, address, mobile, problem));
			System.out.println(result);
		} catch (BuyerException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}
}
