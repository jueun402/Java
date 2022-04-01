<%@page import="java.net.URLEncoder"%>
<%@page import="java.util.List"%>
<%@page import="com.enc.biz.board.BoardVO"%>
<%@page import="com.enc.biz.board.BoardService"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.support.AbstractApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
	AbstractApplicationContext container 
	= new GenericXmlApplicationContext("applicationContextJDBC.xml");

	BoardService boardService = (BoardService) container.getBean("boardServiceJDBC");
	BoardVO vo = new BoardVO();
	List<BoardVO> boardList = boardService.getBoardList(vo);

/* 	BoardVO vo = new BoardVO();
	BoardDAO boardDAO = new BoardDAO();
	List<BoardVO> boardList = boardDAO.getBoardList(vo); 
	*/
%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
if(session.getAttribute("sessionID")==null){
	response.sendRedirect("login2.jsp");
}else{
%>
<%=session.getAttribute("sessionID")%>님 안녕하세요!<br>
저희 홈페이지에 방문해 주셔서 감사합니다.<br>
<form method="post" action="logout_proc2.jsp">
<input type=submit value="로그아웃">
</form>
<%
}
%>
 <h2>게시판 글</h2>
 <form method ="post" action="getBoard2.jsp">
      <div class="table-responsive">
        <table class="table table-striped table-sm">
          <thead>
            <tr>
			  <th scope="col">seq</th>
              <th scope="col">title</th>
              <th scope="col">writer</th>
              <th scope="col">content</th>
              <th scope="col">regdate</th>              
              <th scope="col">cnt</th>
            </tr>
          </thead>
          <tbody>
     		<% for(BoardVO board : boardList) { %>              
                <tr>
              		<td><%=board.getSeq()%></td>
	                <td><a href="getBoard2.jsp?seq=<%=Integer.toString(board.getSeq())%>"><%=board.getTitle()%></td>
	                <td><%=board.getWriter()%></td>
	                <td><%=board.getContent()%></td>
	                <td><%=board.getRegDate()%></td>
               		<td><%=board.getCnt()%></td> 
               <tr>
			   <%}%>		 	
			
			<% container.close();%>
          </tbody>
     	</div>

     </form>  
     
    <div>
    	<a href="insertBoard2.jsp" class="btn btn-primary pull-right">새 글 등록</a>
    
	</div>
</body>
</html>