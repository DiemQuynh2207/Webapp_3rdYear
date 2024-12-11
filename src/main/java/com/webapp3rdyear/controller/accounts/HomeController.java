package com.webapp3rdyear.controller.accounts;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.webapp3rdyear.dao.AccountsDAO;
import com.webapp3rdyear.enity.Accounts;
@WebServlet(urlPatterns = {"/account"})
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }
	AccountsDAO dao =  new AccountsDAO();

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Accounts> list = dao.getAllAccounts();
		request.setAttribute("listS", list);
		request.getRequestDispatcher("/view/admin/home.jsp").
				forward(request, response);
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
