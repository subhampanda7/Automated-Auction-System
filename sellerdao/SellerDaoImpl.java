package com.sellerdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exceptions.SellerException;
import com.model.Seller;
import com.utility.DBUtil;

public class SellerDaoImpl implements SellerDao {

	@Override
	public String registerSeller(Seller seller) throws SellerException {
		String message = "Not inserted...";
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("insert into seller values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			
//			Id int primary key,
			ps.setInt(1, seller.getId());
//			Aid int,
			ps.setInt(2, seller.getAid());
//			Name varchar(30),
			ps.setString(3, seller.getName());
//			Address varchar(30),
			ps.setString(4, seller.getAddress());
//			Mobile varchar(10) unique,
			ps.setString(5, seller.getMobile());
//			Item_Category varchar(70),
			ps.setString(6, seller.getIcategory());
//			Item_Name varchar(50),
			ps.setString(7, seller.getIname());
//			Item_Price int,
			ps.setInt(8, seller.getIprice());
//			Item_Quantity int,
			ps.setInt(9, seller.getIquantity());
//			Sold varchar(10),
			ps.setString(10, seller.getSold());
//			Problem varchar(100),
			ps.setString(11, seller.getProblem());
			
			int x = ps.executeUpdate();
			
			if(x > 0) {
				message = "Inserted Successfully...";
			} else {
				throw new SellerException("Input Mismatch or Incorrect Administration Id");
			}
			
			
		} catch (SQLException e) {
			//e.printStackTrace();
			throw new SellerException(e.getMessage());
		}
		
		return message;
	}

	@Override
	public String updateItemPriceQuantity(Seller seller) throws SellerException {
		
		String message = "Not Updated....";
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("update seller set item_price = ?, item_quantity = ? where id = ?");
			
			ps.setInt(1, seller.getIprice());
			ps.setInt(2, seller.getIquantity());
			ps.setInt(3, seller.getId());
			
			int x = ps.executeUpdate();
			
			if(x > 0)
				message = "Updated Successfully";
			else 
				throw new SellerException("Invalid seller id");
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SellerException(e.getMessage());
		}
		
		return message;
	}

	@Override
	public String removeItemFromList(int id) throws SellerException {
		
String message = "Not Deleted....";
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("delete from seller where id = ?;");
			
			ps.setInt(1, id);
			
			int x = ps.executeUpdate();
			
			if(x > 0)
				message = "Deleted Successfully";
			else 
				throw new SellerException("Invalid seller id");
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SellerException(e.getMessage());
		}
		
		return message;
		
		
	}

	@Override
	public List<Seller> viewSoldItem() throws SellerException {
		
		List<Seller> sellers = new ArrayList<>();
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from seller where sold = 'Yes'");
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				
				int id = rs.getInt("Id");
				int aid = rs.getInt("Aid");
				String name = rs.getString("Name");
				String address = rs.getString("Address");
				String mobile = rs.getString("Mobile");
				String itemc = rs.getString("Item_Category");
				String iname = rs.getString("Item_Name");
				int iprice = rs.getInt("Item_Price");
				int iqty = rs.getInt("Item_Quantity");
				String sold = rs.getString("Sold");
				String problem = rs.getString("problem");
				
				Seller seller = new Seller(id, aid, name, address, mobile, itemc, iname, iprice, iqty, sold, problem);
								
				sellers.add(seller);
			}
			
			if(sellers.size() == 0) 
				throw new SellerException("No Item Sold or Empty set");
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SellerException(e.getMessage());
		}
		
		return sellers;
	}

}
