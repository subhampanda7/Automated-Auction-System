package com.buyerusecases;

import java.util.Scanner;

import com.buyerdao.BuyerDao;
import com.buyerdao.BuyerDaoImpl;
import com.exceptions.BuyerException;

public class SelectItemsToBuy {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Item Name You Wants To Buy");
		String item = sc.next();
		
		sc.close();
		
		BuyerDao dao = new BuyerDaoImpl();
		
		try {
			String res = dao.SelectItemsToBuy(item);
			System.out.println(res);
		} catch (BuyerException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
