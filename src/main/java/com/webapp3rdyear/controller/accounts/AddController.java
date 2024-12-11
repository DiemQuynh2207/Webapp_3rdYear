package com.webapp3rdyear.controller.accounts;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.webapp3rdyear.dao.AccountsDAO;
import com.webapp3rdyear.enity.Accounts;

/**
 * Servlet implementation class AddController
 */
@WebServlet(urlPatterns = {"/admin/add", "/insert"})

public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	AccountsDAO dao = new AccountsDAO();

    public AddController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/view/admin/add.jsp").
		forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sname = request.getParameter("name");
		String spwd = request.getParameter("pwd");
		Accounts acc = new Accounts();
		acc.setName(sname);
		acc.setPwd(spwd);
		System.out.println(sname);
		System.out.println(1);
		dao.insertAccount(acc);
		System.out.println(2);
		response.sendRedirect("account");
	}

}
