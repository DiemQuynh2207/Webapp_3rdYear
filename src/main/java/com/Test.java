package com;

import java.util.List;

import com.webapp3rdyear.dao.AccountsDAO;
import com.webapp3rdyear.dao.UsersDAO;
import com.webapp3rdyear.dao.VouchersDAO;
import com.webapp3rdyear.enity.Accounts;
import com.webapp3rdyear.enity.Users;
import com.webapp3rdyear.enity.Voucher;


public class Test {
	public static void main(String[] args) {
		VouchersDAO dao =  new VouchersDAO();
		List<Voucher> list = dao.getAllVouchers();
		for (Voucher u : list) {
			System.out.println(u);
		}
			
	}
}

