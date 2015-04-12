package com.shinhan.csp;

import java.io.IOException;

import java.util.Date;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class SimpleDynamicPage1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		//resp.setContentType("text/plain");
		
		Date name = new Date();
		resp.getWriter().println("<html>"+"<body>"+
		" current time "+name+"</body>"+"</html>");
		
	}
}
