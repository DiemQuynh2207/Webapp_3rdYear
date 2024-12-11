package com.webapp3rdyear.controller.voucher;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.webapp3rdyear.dao.AccountsDAO;
import com.webapp3rdyear.dao.VouchersDAO;
import com.webapp3rdyear.enity.Accounts;
import com.webapp3rdyear.enity.Voucher;

/**
 * Servlet implementation class UpdateVoucherController
 */
@WebServlet(urlPatterns = {"/vouchers/update"})
public class UpdateVoucherController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	VouchersDAO dao = new VouchersDAO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateVoucherController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("sid");
		VouchersDAO dao = new VouchersDAO();
		Voucher a = dao.getVoucherByID(id);
		request.setAttribute("vc", a);
		request.getRequestDispatcher("/view/voucher/update.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String vid = request.getParameter("vid");
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
		dao.updateVouchers(vid, des, discount, price, quantity, mfg, exp);
		response.sendRedirect("/Webapp_3rdYear/vouchers");
	}

}
