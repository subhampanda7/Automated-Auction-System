package com.sellerusecases;

import java.util.List;

import com.exceptions.SellerException;
import com.model.Seller;
import com.sellerdao.SellerDao;
import com.sellerdao.SellerDaoImpl;

public class ViewSoldItem {
	
	public static void main(String[] args) {
		
		SellerDao dao = new SellerDaoImpl();
		
		try {
			List<Seller> sellers = dao.viewSoldItem();
			System.out.println("Sold Item Deatils Below");
			sellers.forEach(s -> {
				System.out.println("Seller id : "+s.getId());
				System.out.println("Seller name : "+s.getName());
				System.out.println("Seller address : "+s.getAddress());
				System.out.println("Seller mobile : "+s.getMobile());
				System.out.println("Item category : "+s.getIcategory());
				System.out.println("Item name : "+s.getIname());
				System.out.println("Item price : "+s.getIprice());
				System.out.println("Item quantity : "+s.getIquantity());
				System.out.println("Item sold status : "+s.getSold());
				System.out.println("----------------------------------------");
			});
			
			System.out.println("=====================================");
			
		} catch (SellerException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
