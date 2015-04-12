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
		resp.getWriter().println("이름 : "+name +"<br>");
		resp.getWriter().println("학번 : "+id +"<br>");
		resp.getWriter().println("전화번호 : "+name +"<br>");
		resp.getWriter().println("메일주소 : "+email +"<br>");
		resp.getWriter().println("카카오톡아이디 : "+name +"<br>");
			if(checked == null)
			resp.getWriter().println("팀장여부 : "+ "팀장ㄴㄴ" +"<br>");
			else
			resp.getWriter().println("팀장여부 : "+ "팀장ㅇㅇ"  +"<br>");
			
		resp.getWriter().println("Git ID : "+gitid +"<br>");
		resp.getWriter().println("</mark>");
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
	}
}
