package kr.ac.shinhan.csp;

import java.io.IOException;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RetriveTeamMemberServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
	 throws IOException
	 {
		
		PersistenceManager pm = MyPersistenceManger.getManger();
		Query qry = pm.newQuery(TeamMember.class);
		List<TeamMember> memberList = (List<TeamMember>) qry.execute();
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain");
	
		resp.getWriter().println("<html>");
		resp.getWriter().println("<body>");
		resp.getWriter().println("<table>");
		for(TeamMember tm:memberList)
		{
			resp.getWriter().println("<tr>");
			resp.getWriter().println("<td>"+tm.getName()+"</td><td>" + tm.getSocialNum() + "</td>");
			
			resp.getWriter().println("</tr>");
		}
		resp.getWriter().println("</table>");
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
	 }
	
	
	
	
}
