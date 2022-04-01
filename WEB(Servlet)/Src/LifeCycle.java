

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycle
 */
@WebServlet("/LifeCycle")
public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	int initCount = 1;
	int doGetCount = 1;
	int destroyCount = 1;
   
    public LifeCycle() {
        super();
        System.out.println("LifeCycle() 생성자 호출");    }
    
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 호출 : "+ initCount++);	}

	public void destroy() {
		System.out.println("destroy 호출 : "+ destroyCount++);	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("LifeCycle Servlet Test").append(request.getContextPath());
		System.out.println("doGet 호출 : "+ doGetCount++);
	}

}
