package com.administrationusecases;

import java.util.Scanner;

import com.administrationdao.AdministrationDao;
import com.administrationdao.AdminstrationDaoImpl;
import com.exceptions.AdminstratorException;

public class LogInAdministrator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter email");
		String email = sc.next();
		
		System.out.println("Enter password");
		String password = sc.next();
		
		sc.close();
		
		AdministrationDao dao = new AdminstrationDaoImpl();
		
		try {
			String result = dao.loginAdministrator(email, password);
			System.out.println(result);
		} catch (AdminstratorException e) {
			System.out.println(e.getMessage());
		} 
		
		
	}

}
