

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SumTestServlet
 */
@WebServlet("/SumTestServlet")
public class SumTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SumTestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		int n1 = Integer.parseInt(request.getParameter("a"));
		int n2 = Integer.parseInt(request.getParameter("b"));
		
		int nSum = n1 + n2;
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<h1><font color=\"blue\"> get 방식 [덧셈결과] : " + nSum + "</font>");
		out.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int n1 = Integer.parseInt(request.getParameter("a"));
		int n2 = Integer.parseInt(request.getParameter("b"));
		
		int nSub = n1 - n2;
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<h1><font color=\"red\"> post 방식 [뺄셈결과] : " + nSub + "</font>");
		out.close();
	}

}
