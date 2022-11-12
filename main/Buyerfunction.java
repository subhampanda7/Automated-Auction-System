package com.main;

import java.util.Scanner;

import com.buyerusecases.RegisterBuyer;
import com.buyerusecases.SelectItemsToBuy;
import com.buyerusecases.ViewAllBuyerAndItems;
import com.buyerusecases.ViewItemsByCategory;

public class Buyerfunction {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.) Register buyer & add details\n"
				+ "2.) View all buyer and items\n"
				+ "3.) View items by category\n"
				+ "4.) Select items to buy\n"
				+ "5.) Logout \n"
				+ "================================");
		int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1 :
				RegisterBuyer buyer = new RegisterBuyer();
				buyer.main(args);
				break;
			case 2: 
				ViewAllBuyerAndItems allBuyerAndItems = new ViewAllBuyerAndItems();
				allBuyerAndItems.main(args);
				
				main(args);
				break;
			case 3:
				ViewItemsByCategory byCategory = new ViewItemsByCategory();
				byCategory.main(args);
				break;
			case 4:
				SelectItemsToBuy itemsToBuy = new SelectItemsToBuy();
				itemsToBuy.main(args);
				break;
			case 5:
				Main main = new Main();
				main.main(args);
				break;
			}
			
			
			
		
	}

}
