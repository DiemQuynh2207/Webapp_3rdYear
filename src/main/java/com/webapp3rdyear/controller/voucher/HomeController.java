package com.webapp3rdyear.controller.voucher;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.webapp3rdyear.dao.UsersDAO;
import com.webapp3rdyear.dao.VouchersDAO;
import com.webapp3rdyear.enity.Users;
import com.webapp3rdyear.enity.Voucher;

/**
 * Servlet implementation class HomeController
 */
@WebServlet(urlPatterns = {"/vouchers"})
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }
    VouchersDAO dao = new VouchersDAO();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Voucher> list = dao.getAllVouchers();
		request.setAttribute("listS", list);
		request.getRequestDispatcher("/view/voucher/home.jsp").
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
