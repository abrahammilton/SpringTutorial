package com.aby;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	
	private UserValiationService svc = new UserValiationService();

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setAttribute("name", req.getParameter("name"));
		req.setAttribute("password", req.getParameter("password"));
		req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		boolean isUserValid = svc.isUserValid(name, password);
		
		if(isUserValid) {
			
			req.setAttribute("name", name);
			req.setAttribute("password", password);
			req.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(req, resp);
		} else {
			req.setAttribute("errorMessage", "Invalid Credentials!");
			req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
		}
		
	}

}
