
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		//
		out.println("<html>");
		out.println(" <head>");	
		out.println("	<title> Hello Servlet </title>");
		out.println("  </head>");
		out.println(" <body>");
		out.println("	<center>");
		out.println("	<h1>");
		out.println("		<font color=\"red\" > 헬로우 Servlet 4 </font> "); 
		out.println("	</h1>");
		out.println("	</center> ");
		out.println("  </body> ");
		out.println("</html>"); 
	}

}

