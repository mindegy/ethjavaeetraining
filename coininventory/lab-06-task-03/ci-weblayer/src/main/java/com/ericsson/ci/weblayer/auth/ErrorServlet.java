package com.ericsson.ci.weblayer.auth;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Error")
public class ErrorServlet extends HttpServlet {

	private static final long serialVersionUID = 1599166100486735562L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final RequestDispatcher view = request.getRequestDispatcher("error.jsp");
		view.forward(request, response);
	}

}
