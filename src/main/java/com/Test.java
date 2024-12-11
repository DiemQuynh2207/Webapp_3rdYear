package com;

import java.util.List;

import com.webapp3rdyear.dao.AccountsDAO;
import com.webapp3rdyear.dao.UsersDAO;
import com.webapp3rdyear.enity.Accounts;
import com.webapp3rdyear.enity.Users;


public class Test {
	public static void main(String[] args) {
		UsersDAO dao =  new UsersDAO();
		List<Users> list = dao.getAllUsers();
		for (Users u : list) {
			System.out.println(u);
		}
			
	}
}

