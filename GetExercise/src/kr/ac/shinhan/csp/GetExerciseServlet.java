package kr.ac.shinhan.csp;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class GetExerciseServlet extends HttpServlet {
	public void doPost (HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		String name = req.getParameter("name");
		String id = req.getParameter("id");
		String num = req.getParameter("num");
		String email =req.getParameter("email");
		String kakaoid =req.getParameter("kakaoid");
		String gitid =req.getParameter("gitid");
		String checked = req.getParameter("chk_info");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");
		resp.getWriter().println("<html>");
		resp.getWriter().println("<body>");
		resp.getWriter().println("<style> mark{background-color:blue;} </style>");
		resp.getWriter().println("<mark>");
		resp.getWriter().println("�̸� : "+name +"<br>");
		resp.getWriter().println("�й� : "+id +"<br>");
		resp.getWriter().println("��ȭ��ȣ : "+name +"<br>");
		resp.getWriter().println("�����ּ� : "+email +"<br>");
		resp.getWriter().println("īī������̵� : "+name +"<br>");
			if(checked == null)
			resp.getWriter().println("���忩�� : "+ "���夤��" +"<br>");
			else
			resp.getWriter().println("���忩�� : "+ "���夷��"  +"<br>");
			
		resp.getWriter().println("Git ID : "+gitid +"<br>");
		resp.getWriter().println("</mark>");
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
	}
}
