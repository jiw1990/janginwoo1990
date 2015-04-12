package kr.ac.shinhan.csp;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class PostExerciseServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		String name = req.getParameter("name");
		String id = req.getParameter("id");
		String tel = req.getParameter("tel");
		String mail = req.getParameter("mail");
		String katok = req.getParameter("katok");
		String gitid = req.getParameter("gitid");		
		String check = req.getParameter("leader");
		
		//database insert
		TeamMember tm = new TeamMember(name,id);
		PersistenceManager pm = MyPersistenceManger.getManger();
		pm.makePersistent(tm);
		
		
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain");
	
		resp.getWriter().println("<html>");
		resp.getWriter().println("<body>");
		resp.getWriter().println("이름 : " + name +"</br> ");
		resp.getWriter().println("학번 : " + id +"</br>");
		resp.getWriter().println("전화번호 : " + tel +"</br>");
		resp.getWriter().println("메일주소 : " + mail +"</br>");
		resp.getWriter().println("카카오톡 아이디 : " + katok +"</br>");
		if(check == null)
			resp.getWriter().println("팀장ㄴㄴ" +"<br>");
		else
			resp.getWriter().println("팀장ㅇㅇ"  +"<br>");
		resp.getWriter().println("GitHub ID : " + gitid +"</br>");
		
		resp.getWriter().println("\n이 등록되었습니다.");
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
	}
}
