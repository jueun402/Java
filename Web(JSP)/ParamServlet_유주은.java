import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ParamServlet")
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ParamServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		int age = Integer.parseInt(request.getParameter("age"));
		
		response.setContentType("text/html; charset =UTF-8");
		PrintWriter out = response.getWriter(); 
		
		out.println("<html>");
		out.println("	<head>");	
		out.println("	</head>");
		out.println("	<body>");
		out.println("	 당신이 입력한 정보입니다.");
		out.println("<br/>");
		out.println("	 ID : "+id);
		out.println("<br/>");
		out.println("	 Age : "+age );
		out.println("	</body>");
		out.println("</html>");
		out.close();

	
	}


}
