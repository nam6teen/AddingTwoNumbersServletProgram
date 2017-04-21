package com.example.add;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

@SuppressWarnings("serial")

public class AddingTwoNumbersServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		int firstNumber = Integer.parseInt(req.getParameter("t1"));
		int secondNumber = Integer.parseInt(req.getParameter("t2"));

		int sum = firstNumber + secondNumber;

		PrintWriter out = resp.getWriter();

		out.println("<html><b>The sum of " + firstNumber + " and " + secondNumber + " is " + sum+"</b></html>");

	}
}
