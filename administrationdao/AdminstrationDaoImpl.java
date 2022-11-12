package com.administrationdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.DTOClasses.RegisteredBuyer;
import com.DTOClasses.RegisteredSeller;
import com.DTOClasses.SellingReport;
import com.exceptions.AdminstratorException;
import com.utility.DBUtil;

public class AdminstrationDaoImpl implements AdministrationDao {

	@Override
	public List<RegisteredBuyer> viewRegisterdBuyerList() throws AdminstratorException {
		
		List<RegisteredBuyer> buyers = new ArrayList<>();
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select a.id, b.id, b.name, b.address, b.mobile, b.problem from buyer b INNER JOIN administrator a ON a.id = b.aid group by b.id");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int aid = rs.getInt("Id");
				int bid = rs.getInt("b.Id");
				String name = rs.getString("Name");
				String address = rs.getString("Address");
				String mobile = rs.getString("Mobile");
				String Problem = rs.getString("Problem");
				
				
				RegisteredBuyer buyer = new RegisteredBuyer(aid, bid, name, address, mobile, Problem);
				
				buyers.add(buyer);
				
			}
			
			if(buyers.size() == 0) {
				throw new AdminstratorException("Empty set");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new AdminstratorException(e.getMessage());
		}
		
		return buyers;
		
	}

	@Override
	public List<RegisteredSeller> viewRegisterdSellerList() throws AdminstratorException {
		
		List<RegisteredSeller> sellers = new ArrayList<>();
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select a.id , s.id, s.name, s.address, s.mobile, s.problem from seller s INNER JOIN administrator a ON a.id = s.aid group by s.id");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int aid = rs.getInt("Id");
				int bid = rs.getInt("s.Id");
				String name = rs.getString("Name");
				String address = rs.getString("Address");
				String mobile = rs.getString("Mobile");
				String Problem = rs.getString("Problem");
				
				
				RegisteredSeller seller = new RegisteredSeller(aid, bid, name, address, mobile, Problem);
				
				sellers.add(seller);
				
			}
			
			if(sellers.size() == 0) {
				throw new AdminstratorException("Empty set");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new AdminstratorException(e.getMessage());
		}
		
		return sellers;
		
		
		
	}

	@Override
	public List<SellingReport> viewDailySellingReport() throws AdminstratorException {
		
		List<SellingReport> reports = new ArrayList<>();
		
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select s.id, s.name, s.Item_Category, s.Item_Name, s.Item_Price, s.Item_Quantity, s.sold from administrator a INNER JOIN seller s ON a.id = s.aid AND s.sold = 'Yes'");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int id = rs.getInt("Id");
				String name = rs.getString("Name");
				String category= rs.getString("Item_Category");
				String iname = rs.getString("Item_Name");
				int iqty = rs.getInt("item_Quantity");
				String sold = rs.getString("Sold");
				
				SellingReport report = new SellingReport(id, name, category, iname, iqty, sold);
				
				reports.add(report);
				
			}
			
			if(reports.size() == 0) {
				throw new AdminstratorException("Empty Set");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new AdminstratorException(e.getMessage());
		}
		
		
		
		return reports;
		
		
	}

	@Override
	public String solveSellerProblem(int id) throws AdminstratorException {
		
		String message = "Not Solved....";
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("update seller set problem = 'Solved' where id = ?");
			
			ps.setInt(1, id);
			
			int x = ps.executeUpdate();
			
			if(x > 0) 
				message = "Problem Solved & Updated";
			 else 
				 throw new AdminstratorException("invalid id");
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new AdminstratorException(e.getMessage());
		}
		
		return message;
		
	}

	@Override
	public String solveBuyerProblem(int id) throws AdminstratorException {
		
		String message = "Not Solved....";
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("update buyer set problem = 'Solved' where id = ?");
			
			ps.setInt(1, id);
			
			int x = ps.executeUpdate();
			
			if(x > 0) 
				message = "Problem Solved & Updated";
			 else 
				 throw new AdminstratorException("invalid id");
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new AdminstratorException(e.getMessage());
		}
		
		return message;
		
	}

	@Override
	public String loginAdministrator(String email, String password) throws AdminstratorException {
		
		
		String message = "Not updated...";
		
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select name from administrator where email = ? AND password = ?");
			
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				message = "Sign-in successful";
			} else {
				throw new AdminstratorException("Invalid email or password");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new AdminstratorException(e.getMessage());
		}
		
		return message;
		
	}
	
	

}
