package com.webapp3rdyear.controller.user.seller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.webapp3rdyear.dao.UsersDAO;
import com.webapp3rdyear.enity.Users;

/**
 * Servlet implementation class UpdateSellerController
 */

@WebServlet(urlPatterns = {"/sellers/update"})
public class UpdateSellerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateSellerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String id = request.getParameter("sid");
			UsersDAO dao = new UsersDAO();
			Users a = dao.getSellerByID(id);
			request.setAttribute("cus", a);
			request.getRequestDispatcher("/view/seller/update.jsp").forward(request, response);
		} catch  (Exception e){
			System.out.println(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String  userId =  request.getParameter("cusid");
		String fullname =  request.getParameter("cusname");
		String address =  request.getParameter("cusaddress");
		String email = request.getParameter("cusemail");
		String phone = request.getParameter("cusphone");
		String Dob = request.getParameter("cusdob");
		String cid = request.getParameter("cuscid");
		String avatar = request.getParameter("cusavt");
		int kpi = Integer.parseInt(request.getParameter("cuskpi"));
		int gender = Integer.parseInt(request.getParameter("gender"));
		
		UsersDAO dao = new UsersDAO();
		dao.updateSeller( fullname, address, email, phone, Dob,
				cid, avatar, kpi, gender, userId );
		response.sendRedirect("/Webapp_3rdYear/sellers");
	}

}
