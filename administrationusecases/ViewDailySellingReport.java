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
			reports.forEach(r -> System.out.println(r));
		} catch (AdminstratorException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
