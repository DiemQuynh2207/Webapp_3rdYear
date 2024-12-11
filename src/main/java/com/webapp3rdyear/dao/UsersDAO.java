package com.webapp3rdyear.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.webapp3rdyear.config.DBConnectSQL;
import com.webapp3rdyear.enity.Accounts;
import com.webapp3rdyear.enity.Users;

public class UsersDAO {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public List<Users> getAllUsers() {
		List<Users> list = new ArrayList<Users>();
		String query = "SELECT * FROM gardencentre.users WHERE UserType = 3; ;";
		try {
			conn = DBConnectSQL.getDatabaseConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				Users user = new Users();
		        user.setUserId(rs.getInt("UserID"));
		        user.setFullname(rs.getString("Fullname"));
		        user.setAddress(rs.getString("Address"));
		        user.setGender(rs.getBoolean("Gender"));
		        user.setPhone(rs.getString("Phone"));
		        user.setDob(rs.getString("DoB")); // java.sql.Date
		        user.setCid(rs.getString("CID"));
		        user.setAvatar(rs.getString("Avatar"));
		        user.setUserType(rs.getInt("UserType"));
		        user.setKpi(rs.getObject("KPI") != null ? rs.getInt("KPI") : null); // Xử lý null cho KPI
		        user.setArea(rs.getString("Area")); // Area có thể null
		        user.setEmail(rs.getString("Email"));
		        
		        list.add(user);
			}
			if (list.size()!=0)
				return list;
			
			conn.close();
			ps.close();
			rs.close();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return list;
	}
	
	public List<Users> getAllSeller() {
		List<Users> list = new ArrayList<Users>();
		String query = "SELECT * FROM gardencentre.users WHERE UserType = 1;";
		try {
			conn = DBConnectSQL.getDatabaseConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				Users user = new Users();
		        user.setUserId(rs.getInt("UserID"));
		        user.setFullname(rs.getString("Fullname"));
		        user.setAddress(rs.getString("Address"));
		        user.setGender(rs.getBoolean("Gender"));
		        user.setPhone(rs.getString("Phone"));
		        user.setDob(rs.getString("DoB")); // java.sql.Date
		        user.setCid(rs.getString("CID"));
		        user.setAvatar(rs.getString("Avatar"));
		        user.setUserType(rs.getInt("UserType"));
		        user.setKpi(rs.getObject("KPI") != null ? rs.getInt("KPI") : null); // Xử lý null cho KPI
		        user.setArea(rs.getString("Area")); // Area có thể null
		        user.setEmail(rs.getString("Email"));
		        
		        list.add(user);
			}
			if (list.size()!=0)
				return list;
			
			conn.close();
			ps.close();
			rs.close();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return list;
	}
	
	public List<Users> getAllShipper() {
		List<Users> list = new ArrayList<Users>();
		String query = "SELECT * FROM gardencentre.users WHERE UserType = 2;";
		try {
			conn = DBConnectSQL.getDatabaseConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				Users user = new Users();
		        user.setUserId(rs.getInt("UserID"));
		        user.setFullname(rs.getString("Fullname"));
		        user.setAddress(rs.getString("Address"));
		        user.setGender(rs.getBoolean("Gender"));
		        user.setPhone(rs.getString("Phone"));
		        user.setDob(rs.getString("DoB")); 
		        user.setCid(rs.getString("CID"));
		        user.setAvatar(rs.getString("Avatar"));
		        user.setUserType(rs.getInt("UserType"));
		        user.setKpi(rs.getObject("KPI") != null ? rs.getInt("KPI") : null); // Xử lý null cho KPI
		        user.setArea(rs.getString("Area")); // Area có thể null
		        user.setEmail(rs.getString("Email"));
		        
		        list.add(user);
			}
			if (list.size()!=0)
				return list;
			
			conn.close();
			ps.close();
			rs.close();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return list;
	}
	
	public void deleteUser (String userId)
	{
		String query="DELETE FROM Users\r\n"
				+ "WHERE UserID = ?;";
		try {
			conn = DBConnectSQL.getDatabaseConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, userId);
			ps.executeUpdate();
			
		} catch (Exception e)
		{
			
		}
	}
	
	public void insertUser (Users user, Accounts acc)
	{
		System.out.println(5);
		String query="INSERT INTO USERS SELECT UA.UserID,?, ?, ?, ?, ?, ?, ?, 3, NULL,NULL, ? FROM UserAccount UA WHERE UA.UserName = ?";
		try {
			conn = DBConnectSQL.getDatabaseConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, user.getFullname());
			ps.setString(2, user.getAddress());
			ps.setBoolean(3, user.isGender());
			ps.setString(4, user.getPhone());
			ps.setString(5, user.getDob());
			ps.setString(6, user.getCid());
			ps.setString(7, user.getAvatar());
			ps.setString(8, user.getEmail());
			ps.setString(9, acc.getName());
			System.out.println(ps.toString());
			ps.executeUpdate();
			conn.close();
			ps.close();
			
		} catch (Exception e)
		{
			
		}
	}
	
	public void insertSeller (Users user, Accounts acc)
	{
		String query="INSERT INTO USERS SELECT UA.UserID,?, ?, ?, ?, ?, ?, ?, 1, ?,NULL, ? FROM UserAccount UA WHERE UA.UserName = ?";
		try {
			conn = DBConnectSQL.getDatabaseConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, user.getFullname());
			ps.setString(2, user.getAddress());
			ps.setBoolean(3, user.isGender());
			ps.setString(4, user.getPhone());
			ps.setString(5, user.getDob());
			ps.setString(6, user.getCid());
			ps.setString(7, user.getAvatar());
			ps.setInt(8, user.getKpi());
			ps.setString(9, user.getEmail());
			
			ps.setString(10, acc.getName());
			System.out.println(ps.toString());
			ps.executeUpdate();
			conn.close();
			ps.close();
			
		} catch (Exception e)
		{
			
		}
	}
	
	public void insertShipper (Users user, Accounts acc)
	{
		String query="INSERT INTO USERS SELECT UA.UserID,?, ?, ?, ?, ?, ?, ?, 2, NULL,?, ? FROM UserAccount UA WHERE UA.UserName = ?";
		try {
			conn = DBConnectSQL.getDatabaseConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, user.getFullname());
			ps.setString(2, user.getAddress());
			ps.setBoolean(3, user.isGender());
			ps.setString(4, user.getPhone());
			ps.setString(5, user.getDob());
			ps.setString(6, user.getCid());
			ps.setString(7, user.getAvatar());
			ps.setString(8, user.getArea());
			ps.setString(9, user.getEmail());
			
			ps.setString(10, acc.getName());
			System.out.println(ps.toString());
			ps.executeUpdate();
			conn.close();
			ps.close();
			
		} catch (Exception e)
		{
			
		}
	}
	
//	public Users getUserByID (String id){
//			
//			String query = "SELECT * FROM USERS WHERE UserID = ?";
//			try {
//				conn = DBConnectSQL.getDatabaseConnection();
//				ps = conn.prepareStatement(query);
//				ps.setString(1, id);
//				rs = ps.executeQuery();
//				while(rs.next()) {
//					return new Users(rs.getInt(1),
//							rs.getString(2),
//							rs.getString(3),
//							rs.getBoolean(4),
//							rs.getString(5),
//							rs.getString(6),
//							rs.getString(7),
//							rs.getString(8),
//							rs.getInt(9),
//							rs.getInt(10),
//							rs.getString(11),
//							rs.getString(12));
//				}
//			
//			} catch  (Exception e){
//				
//			}
//			return null;
//		}
	
	public Users getCustomerByID (String id){
		
		String query = "SELECT userid, fullname, address, email, phone, dob, cid, avatar, gender FROM USERS WHERE UserID = ?";
		try {
			conn = DBConnectSQL.getDatabaseConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				return new Users(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6),
						rs.getString(7),
						rs.getString(8),
						rs.getBoolean(9));
			}
		
		} catch  (Exception e){
			
		}
		return null;
	}
}
