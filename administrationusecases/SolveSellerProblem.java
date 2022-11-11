package com.administrationusecases;

import java.util.Scanner;

import com.administrationdao.AdministrationDao;
import com.administrationdao.AdminstrationDaoImpl;
import com.exceptions.AdminstratorException;

public class SolveSellerProblem {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Seller Id");
		int id = sc.nextInt();
		
		sc.close();
		
		AdministrationDao dao = new AdminstrationDaoImpl();
		
		try {
			String result = dao.solveSellerProblem(id);
			System.out.println(result);
		} catch (AdminstratorException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
