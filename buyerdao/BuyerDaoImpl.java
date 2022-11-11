package com.buyerdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.DTOClasses.BuyerAndItems;
import com.exceptions.BuyerException;
import com.model.Buyer;
import com.model.SellerSpecific;
import com.utility.DBUtil;

public class BuyerDaoImpl implements BuyerDao{

	@Override
	public String registerBuyer(Buyer buyer) throws BuyerException {
		
		String message = "Not Inserted....";
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("insert into buyer values(?, ?, ?, ?, ?, ?)");
			
//			Id int primary key,
			ps.setInt(1, buyer.getId());
//			Aid int,
			ps.setInt(2, buyer.getAid());
//			Name varchar(30),
			ps.setString(3, buyer.getName());
//			Address varchar(30),
			ps.setString(4, buyer.getAddress());
//			Mobile varchar(10) unique,
			ps.setString(5, buyer.getMobile());
//			Problem varchar(100),
			ps.setString(6, buyer.getProblem());
			
			int x = ps.executeUpdate();
			
			if(x > 0) {
				message = "Inserted Successfully";
			} else {
				throw new BuyerException("Input Mismatch or Incorrect Administration Id");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BuyerException(e.getMessage());
		}
		
		return message;
		
	}

	@Override
	public List<SellerSpecific> viewItemsByCategory(String category) throws BuyerException {
		
		List<SellerSpecific> sellers = new ArrayList<>();
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select DISTINCT s.Item_Category, s.Item_Name from buyer b INNER JOIN seller s ON s.aid = b.aid AND s.Item_Category = ?");
			
			ps.setString(1, category);
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				
				String cate = rs.getString("Item_Category");
				String name = rs.getString("Item_Name");
				
				SellerSpecific seller = new SellerSpecific();
				seller.setItem_category(category);
				seller.setItem_name(name);
				
				sellers.add(seller);
				
			}
			
			if(sellers.size() == 0)
				throw new BuyerException("Empty Set");
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BuyerException(e.getMessage());
		}
		
		return sellers;
	}

	@Override
	public List<BuyerAndItems> viewAllBuyerAndItems() throws BuyerException {
		
		
		List<BuyerAndItems> andItems = new ArrayList<>();
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select b.name, b.address, s.Item_Category, s.Item_Name, s.Item_Price, s.Item_Quantity from buyer b INNER JOIN seller s ON s.aid = b.aid GROUP BY b.name, s.Item_Name");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				String bname = rs.getString("name");
				String address = rs.getString("address");
				String category = rs.getString("Item_Category");
				String  iname = rs.getString("Item_Name");
				int price = rs.getInt("Item_Price");
				int qty = rs.getInt("Item_Quantity");
				
				BuyerAndItems buyerAndItems = new BuyerAndItems(bname, address, category, iname, price, qty);
				
				andItems.add(buyerAndItems);
				
			}
			
			if(andItems.size() == 0) {
				throw new BuyerException("Empty Set");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BuyerException(e.getMessage());
		}
		
		return andItems;
		
	}

	@Override
	public String SelectItemsToBuy(String item) throws BuyerException {
		
		
		String message = "Not Inserted....";
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("update seller set sold = 'Yes' where Item_Name = ?");
			
			ps.setString(1, item);
			
			int x = ps.executeUpdate();
			
			if(x > 0)
				message = "Purchase Successful"; 
			else
				throw new BuyerException("Item Name Invalid or Empty Set");
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BuyerException(e.getMessage());
		}
		
		return message;
		
	}
}
