package com.webapp3rdyear.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.webapp3rdyear.config.DBConnectSQL;
import com.webapp3rdyear.enity.Accounts;

public class AccountsDAO {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public List<Accounts> getAllAccounts() {
		List<Accounts> list = new ArrayList<Accounts>();
		String query = "SELECT * FROM gardencentre.useraccount";
		try {
			conn = DBConnectSQL.getDatabaseConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				Accounts acc = new Accounts();
				acc.setId(rs.getInt("UserID"));
				acc.setName(rs.getString("UserName"));
				acc.setPwd(rs.getString("AccountPassword"));
				list.add(acc);
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
	
	public void deleteAccount (String id)
	{
		String query="DELETE FROM gardencentre.useraccount \r\n"
				+ "WHERE UserID = ?";
		try {
			conn = DBConnectSQL.getDatabaseConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, id);
			ps.executeUpdate();
			
		} catch (Exception e)
		{
			
		}
	}
	
	public void insertAccount (Accounts acc)
	{
		System.out.println(4);
		String query="INSERT INTO gardencentre.useraccount  (UserName, AccountPassword) VALUES (?, ?)";
		try {
			conn = DBConnectSQL.getDatabaseConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, acc.getName());
			ps.setString(2, acc.getPwd());
			ps.executeUpdate();
			conn.close();
			ps.close();
			
		} catch (Exception e)
		{
			
		}
	}
	
	public Accounts getAccountByID (String id){
		
		String query = "SELECT * FROM gardencentre.useraccount WHERE UserID = ?";
		try {
			conn = DBConnectSQL.getDatabaseConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				return new Accounts(rs.getInt(1),
						rs.getString(2),
						rs.getString(3));
			}
		} catch  (Exception e){
			
		}
		return null;
	}
	
	public void updateAccounts (String id, String name, String pwd)
	{
		String query = "UPDATE gardencentre.useraccount SET UserName = ?, AccountPassword = ?\r\n"
				+ "WHERE UserID = ?";
		try {
			conn = DBConnectSQL.getDatabaseConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, pwd);
			ps.setString(3,id);
			ps.executeUpdate();
			conn.close();
			ps.close();
		} catch  (Exception e){
			
		}
	}
}

