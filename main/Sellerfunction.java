package com.main;

import java.util.Scanner;

import com.sellerusecases.RegisterSeller;
import com.sellerusecases.RemoveItemFromList;
import com.sellerusecases.UpdateItemPriceQuantity;
import com.sellerusecases.ViewSoldItem;

public class Sellerfunction {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.) Register seller & add items\n"
				+ "2.) Update item price & quantity \n"
				+ "3.) Delete item from list \n"
				+ "4.) View sold item \n"
				+ "5.) Logout \n"
				+ "================================");
		
		
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1 :
				RegisterSeller registerSeller = new RegisterSeller();
				registerSeller.main(args);
				break;
			case 2: 
				UpdateItemPriceQuantity itemPriceQuantity = new UpdateItemPriceQuantity();
				itemPriceQuantity.main(args);
				break;
			case 3:
				RemoveItemFromList fromList = new RemoveItemFromList();
				fromList.main(args);
				break;
			case 4:
				ViewSoldItem soldItem = new ViewSoldItem();
				soldItem.main(args);
				
				main(args);
				break;
			case 5:
				Main main = new Main();
				main.main(args);
				break;
			}
		
		
		
	}

}
