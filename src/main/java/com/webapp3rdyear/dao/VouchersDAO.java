package com.webapp3rdyear.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.webapp3rdyear.config.DBConnectSQL;
import com.webapp3rdyear.enity.Accounts;
import com.webapp3rdyear.enity.Voucher;


public class VouchersDAO {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public List<Voucher> getAllVouchers() {
		List<Voucher> list = new ArrayList<Voucher>();
		String query = "SELECT * FROM gardencentre.voucher;";
		try {
			conn = DBConnectSQL.getDatabaseConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				Voucher v = new Voucher();
				v.setVid(rs.getInt("VoucherID"));
				v.setDes(rs.getString("VoucherDescription"));
				v.setDiscount(rs.getInt("Discount"));
				v.setPrice(rs.getInt("MinimumPrice"));
				v.setQuantity(rs.getInt("Quantity"));
				v.setMfg(rs.getString("Mfg"));
				v.setExp(rs.getString("Exp"));
				list.add(v);
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
	
	public void insertVoucher (Voucher v)
	{

		String query="INSERT INTO VOUCHER (VoucherDescription, Discount, MinimumPrice, Quantity, Mfg, Exp) VALUES\r\n"
				+ "(?, ?, ?, ?, ?, ?)";
		System.out.println(query);
		try {
			conn = DBConnectSQL.getDatabaseConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, v.getDes());
			ps.setInt(2, v.getDiscount());
			ps.setInt(3, v.getPrice());
			ps.setInt(4, v.getQuantity());
			ps.setString(5, v.getMfg());
			ps.setString(6, v.getExp());
			ps.executeUpdate();
			conn.close();
			ps.close();
		System.out.println(query);
		} catch (Exception e)
		{
			
		}
	}
	
	public void deleteVoucher (String id)
	{
		String query="DELETE FROM gardencentre.voucher WHERE VoucherID = ?";
		try {
			conn = DBConnectSQL.getDatabaseConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, id);
			ps.executeUpdate();
			
		} catch (Exception e)
		{
			
		}
	}
	
	public Voucher getVoucherByID (String id){
		
		String query = "SELECT * FROM gardencentre.voucher WHERE VoucherID = ?;";
		try {
			conn = DBConnectSQL.getDatabaseConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				return new Voucher(rs.getInt(1),
						rs.getString(2),
						rs.getInt(3),
						rs.getInt(4),
						rs.getInt(5),
						rs.getString(6),
						rs.getString(7));
			}
		} catch  (Exception e){
			
		}
		return null;
	}

	public void updateVouchers (String vid, String des, int discount, int price, int quantity, String mfg, String exp)
	{
		String query = "UPDATE gardencentre.voucher SET VoucherDescription= ?, Discount = ?, MinimumPrice = ?, Quantity = ?, Mfg = ?, Exp =?\r\n"
				+ "WHERE VoucherID = ?";
		try {
			conn = DBConnectSQL.getDatabaseConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1,des );
			ps.setInt(2, discount);
			ps.setInt(3, price);
			ps.setInt(4, quantity);
			ps.setString(5, mfg);
			ps.setString(6, exp);
			ps.setString(7,vid);
			ps.executeUpdate();
			conn.close();
			ps.close();
		} catch  (Exception e){
			
		}
	}
}
