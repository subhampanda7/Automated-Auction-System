package com.main;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to louis management system");
		
		System.out.println("Enter your choice \n===================== \n"
				+ "1.) Login As Adminstrator \n"
				+ "2.) Register as Seller \n"
				+ "3.) Register as Buyer ");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.println("Welcome to adminstrator portal \n------------------------------");
			
			Adminfunction adminfunction = new Adminfunction();
			adminfunction.main(args);
			
			break;
		case 2:
			System.out.println("Welcome to seller portal \n------------------------------");
			
			Sellerfunction sellerfunction = new Sellerfunction();
			sellerfunction.main(args);
			
			break;
		case 3:
			System.out.println("Welcome to buyer portal \n------------------------------");
			
			Buyerfunction buyerfunction = new Buyerfunction();
			buyerfunction.main(args);
			
			break;
		}
		
	}

}
