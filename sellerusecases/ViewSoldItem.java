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
			sellers.forEach(s -> System.out.println(s));
		} catch (SellerException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
