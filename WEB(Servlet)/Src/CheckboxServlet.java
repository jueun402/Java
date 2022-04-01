

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckboxServlet
 */
@WebServlet("/CheckboxServlet")
public class CheckboxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public CheckboxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		
		String[] items = request.getParameterValues("item");
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<head><title> 로그린 Servlet Test </title></head>");
		out.print("<body>");
		out.print("당신이 선택한 목록 입니다.<br>");
		//out.print("아이디 : " + items + "<br>");
		
		if(items == null) {
			out.print("당신이 선택한 목록이 없어요.<br>");
		}
		else {
			out.print("<ul>");
			for(String item : items) {
				out.print("<li>" + item + "</li>");
			}
			out.print("</ul>");
		}
		out.println("<br><a href='javascript:history.go(-1)'>다시</a>");
		out.print("</body>");
		out.print("</html>");
		
		out.close();
		
		
		
	}


}
