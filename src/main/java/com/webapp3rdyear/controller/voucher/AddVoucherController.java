package com.webapp3rdyear.controller.voucher;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.webapp3rdyear.dao.UsersDAO;
import com.webapp3rdyear.dao.VouchersDAO;
import com.webapp3rdyear.enity.Accounts;
import com.webapp3rdyear.enity.Voucher;

/**
 * Servlet implementation class AddVoucherController
 */
@WebServlet(urlPatterns = {"/vouchers/add","/insertvoucher"})

public class AddVoucherController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    VouchersDAO dao = new VouchersDAO();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddVoucherController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/view/voucher/add.jsp").
		forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
		System.out.println(1);
		String des = request.getParameter("des");
		int discount = Integer.parseInt(request.getParameter("discount"));
		int price = Integer.parseInt(request.getParameter("price"));
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		String mfg = request.getParameter("mfg");
		String exp = request.getParameter("exp");
		Voucher v = new Voucher();
		v.setDes(des);
		v.setDiscount(discount);
		v.setPrice(price);
		v.setQuantity(quantity);
		v.setMfg(mfg);
		v.setExp(exp);
		dao.insertVoucher(v);
		System.out.println(2);
		response.sendRedirect("vouchers");
	}

}
