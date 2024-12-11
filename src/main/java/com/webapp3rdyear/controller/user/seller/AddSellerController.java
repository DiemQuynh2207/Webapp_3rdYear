package com.webapp3rdyear.controller.user.seller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.webapp3rdyear.dao.UsersDAO;
import com.webapp3rdyear.enity.Accounts;
import com.webapp3rdyear.enity.Users;

/**
 * Servlet implementation class AddSellerController
 */

@WebServlet(urlPatterns = {"/sellers/add"})

public class AddSellerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UsersDAO ud = new UsersDAO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSellerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/view/seller/add.jsp").
		forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("uaname");
		Accounts acc = new Accounts();
		acc.setName(username);
		String fullname = request.getParameter("fullname");
		String address = request.getParameter("address");
		boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
		String phone = request.getParameter("phone");
		String Dob =  request.getParameter("Dob");
		String cid = request.getParameter("cid");
		String avatar = request.getParameter("avatar");
		int userType = 1;
		int kpi = Integer.parseInt(request.getParameter("kpi"));
		String area = "NULL";
		String email = request.getParameter("email");
		System.out.println(2);
		Users user = new Users();
		user.setFullname(fullname);
		user.setAddress(address);
		user.setGender(gender); 
		user.setPhone(phone);
		user.setDob(Dob);
		user.setCid(cid);
		user.setAvatar(avatar);
		user.setUserType(1);
		user.setKpi(kpi); 
		user.setArea(area);
		user.setEmail(email);
		ud.insertSeller(user, acc);
		response.sendRedirect("/Webapp_3rdYear/sellers");
	
	}

}
