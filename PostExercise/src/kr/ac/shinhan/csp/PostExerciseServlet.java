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
		resp.getWriter().println("�̸� : " + name +"</br> ");
		resp.getWriter().println("�й� : " + id +"</br>");
		resp.getWriter().println("��ȭ��ȣ : " + tel +"</br>");
		resp.getWriter().println("�����ּ� : " + mail +"</br>");
		resp.getWriter().println("īī���� ���̵� : " + katok +"</br>");
		if(check == null)
			resp.getWriter().println("���夤��" +"<br>");
		else
			resp.getWriter().println("���夷��"  +"<br>");
		resp.getWriter().println("GitHub ID : " + gitid +"</br>");
		
		resp.getWriter().println("\n�� ��ϵǾ����ϴ�.");
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
	}
}
