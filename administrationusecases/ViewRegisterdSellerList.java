package com.administrationusecases;

import java.util.List;

import com.DTOClasses.RegisteredSeller;
import com.administrationdao.AdministrationDao;
import com.administrationdao.AdminstrationDaoImpl;
import com.exceptions.AdminstratorException;

public class ViewRegisterdSellerList {
	
	public static void main(String[] args) {
		
		
		AdministrationDao dao = new AdminstrationDaoImpl();
		
		try {
			List<RegisteredSeller> sellers = dao.viewRegisterdSellerList();
			sellers.forEach(System.out::println);
		} catch (AdminstratorException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
