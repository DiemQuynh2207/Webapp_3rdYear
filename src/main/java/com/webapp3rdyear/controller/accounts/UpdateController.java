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
 * Servlet implementation class UpdateController
 */

@WebServlet(urlPatterns = {"/admin/update"})

public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("sid");
		AccountsDAO dao = new AccountsDAO();
		Accounts a = dao.getAccountByID(id);
		request.setAttribute("acc", a);
		request.getRequestDispatcher("/view/admin/update.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sid = request.getParameter("id");
		String sname = request.getParameter("name");
		String spwd = request.getParameter("pwd");
		
		AccountsDAO dao = new AccountsDAO();
		dao.updateAccounts(sid, sname, spwd);
		response.sendRedirect("account");
	}

}
