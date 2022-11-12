package com.main;

import java.util.Scanner;

import com.administrationusecases.SolveBuyerProblem;
import com.administrationusecases.SolveSellerProblem;
import com.administrationusecases.ViewDailySellingReport;
import com.administrationusecases.ViewRegisterdBuyerList;
import com.administrationusecases.ViewRegisterdSellerList;

public class Adminfunction {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("1.) View registerd buyerlist \n"
				+ "2.) View registerd seller list \n"
				+ "3.) View selling report \n"
				+ "4.) Solve buyer problems \n"
				+ "5.) Solve seller problems \n"
				+ "6.) Logout \n"
				+ "================================");
		
		int choice = sc.nextInt();	
			
			switch(choice) {
			
			case 1 :
				ViewRegisterdBuyerList buyerList = new ViewRegisterdBuyerList();
				buyerList.main(args);
				
				main(args);
				break;
			case 2: 
				ViewRegisterdSellerList sellerList = new ViewRegisterdSellerList();
				sellerList.main(args);
				
				main(args);
				break;
			case 3:
				ViewDailySellingReport dailySellingReport = new ViewDailySellingReport();
				dailySellingReport.main(args);
				
				main(args);
				break;
			case 4:
				SolveBuyerProblem buyerProblem = new SolveBuyerProblem();
				buyerProblem.main(args);
				break;
			case 5:
				SolveSellerProblem solveSellerProblem = new SolveSellerProblem();
				solveSellerProblem.main(args); 
				break;
			case 6:
				Main main = new Main();
				main.main(args);
				break;
			} 
			
		
		
		
		
		
		
	}

}
