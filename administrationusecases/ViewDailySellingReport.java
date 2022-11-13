package com.administrationusecases;

import java.util.List;

import com.DTOClasses.SellingReport;
import com.administrationdao.AdministrationDao;
import com.administrationdao.AdminstrationDaoImpl;
import com.exceptions.AdminstratorException;

public class ViewDailySellingReport {
	
	public static void main(String[] args) {
		
		AdministrationDao dao = new AdminstrationDaoImpl();
		
		try {
			List<SellingReport> reports = dao.viewDailySellingReport();
			reports.forEach(r -> {
				System.out.println("Seller id : "+r.getSeller_id());
				System.out.println("Seller name : "+r.getItem_Name());
				System.out.println("Item category : "+r.getItem_Category());
				System.out.println("Item name : "+r.getItem_Name());
				System.out.println("Item quantity : "+r.getItem_Quantity());
				System.out.println("Item sold status : "+r.getSold());
				System.out.println("----------------------------------------");
			});
			
			System.out.println("=====================================");
			
		} catch (AdminstratorException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
