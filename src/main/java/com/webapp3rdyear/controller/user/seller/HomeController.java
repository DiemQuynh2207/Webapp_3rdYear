package com.webapp3rdyear.controller.user.seller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.webapp3rdyear.dao.UsersDAO;
import com.webapp3rdyear.enity.Users;
@WebServlet(urlPatterns = {"/sellers"})
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    UsersDAO dao = new UsersDAO();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Users> list = dao.getAllSeller();
		request.setAttribute("listS", list);
		request.getRequestDispatcher("/view/seller/home.jsp").
				forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
