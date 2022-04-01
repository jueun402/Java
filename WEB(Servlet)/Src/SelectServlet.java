

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SelectServlet
 */
@WebServlet("/SelectServlet")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SelectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String job = request.getParameter("job");
		String[] interests = request.getParameterValues("interest");
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<head><title> 로그린 Servlet Test </title></head>");
		out.print("<body>");
		out.print("당신이 입력한 정보입니다.<br><br>");
		out.print("job : " + job + "<br>");
		
		if(interests == null) {
			out.print("당신이 선택한 관심분야가 없어요.<br>");
		}
		else {
			out.print("<ul>");
			for(String interest : interests) {
				out.print("<li>" + interest + "</li>");
			}
			out.print("</ul>");
		}
		
		out.println("<br><a href='javascript:history.go(-1)'>다시</a>");
		out.print("</body>");
		out.print("</html>");
		
		out.close();
	}

}
