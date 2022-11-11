package com.administrationusecases;

import java.util.Scanner;

import com.administrationdao.AdministrationDao;
import com.administrationdao.AdminstrationDaoImpl;
import com.exceptions.AdminstratorException;

public class SolveBuyerProblem {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Buyer Id");
		int id = sc.nextInt();
		
		sc.close();
		
		AdministrationDao dao = new AdminstrationDaoImpl();
		
		try {
			String result = dao.solveBuyerProblem(id);
			System.out.println(result);
		} catch (AdminstratorException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
