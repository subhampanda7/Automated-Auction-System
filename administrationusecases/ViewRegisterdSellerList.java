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
			sellers.forEach(s -> {
				System.out.println("Adminstration id : "+s.getAdministration_Id());
				System.out.println("Name : "+s.getName());
				System.out.println("Seller Id : "+s.getSeller_Id());
				System.out.println("Address : "+s.getAddress());
				System.out.println("Mobile : "+s.getMobile());
				System.out.println("Do you have any problem ? : "+s.getAny_Problem());
				System.out.println("----------------------------------------");
			});
			
			System.out.println("=====================================");
		} catch (AdminstratorException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
