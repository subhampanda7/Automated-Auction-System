package com.administrationdao;

import java.util.List;

import com.DTOClasses.RegisteredBuyer;
import com.DTOClasses.RegisteredSeller;
import com.DTOClasses.SellingReport;
import com.exceptions.AdminstratorException;

public interface AdministrationDao {
	
	public List<RegisteredBuyer> viewRegisterdBuyerList() throws AdminstratorException;
	
	public List<RegisteredSeller> viewRegisterdSellerList() throws AdminstratorException;
	
	//
	
	public List<SellingReport> viewDailySellingReport() throws AdminstratorException;
	
	public String solveSellerProblem(int id) throws AdminstratorException;
	
	public String solveBuyerProblem(int id) throws AdminstratorException; 

}
