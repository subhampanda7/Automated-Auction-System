package com.administrationusecases;

import java.util.List;

import com.DTOClasses.RegisteredBuyer;
import com.administrationdao.AdministrationDao;
import com.administrationdao.AdminstrationDaoImpl;
import com.exceptions.AdminstratorException;

public class ViewRegisterdBuyerList {
	
	public static void main(String[] args) {
		
		AdministrationDao dao = new AdminstrationDaoImpl();
		
		try {
			List<RegisteredBuyer> buyers = dao.viewRegisterdBuyerList();
			buyers.forEach(System.out::println);
		} catch (AdminstratorException e) {
			System.out.println(e.getMessage());
		}		
		
	}

}
