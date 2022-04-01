<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.support.AbstractApplicationContext"%>
<%@page import="com.enc.biz.user.UserService"%>
<%@page import="com.enc.biz.user.UserVO"%>
<%@page import="com.enc.biz.user.impl.UserDAO"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="com.enc.biz.board.impl.BoardDAO"%>
<%@page import="com.enc.biz.board.BoardVO"%>
<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="com.enc.biz.user.impl.UserDAO" %>

<html>
<head>
    <title>로그인 처리 JSP</title>
</head>
<body>


<%	
	request.setCharacterEncoding("UTF-8");

	String id = request.getParameter("id");
	String pw = request.getParameter("password");

	System.out.println(id);
	System.out.println(pw);
	
	AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContextUser11.xml"); 
	
	UserService userService = (UserService) container.getBean("userService");
	
	UserDAO dao = new UserDAO();
	UserVO vo = new UserVO();
	
	// User 조회 
	vo.setId(id);
	vo.setPassword(pw);
	UserVO user = userService.getUser(vo);

	// URL 및 로그인 전달 메시지 
	String msg = "";
	
	if(user !=null) {
		session.setAttribute("sessionID", id);
		msg = "getBoardList2.jsp";
		System.out.println(user.getName()+" 님 환영합니다.");			
	}
	else {
		msg = "login2.jsp?msg=-1"; 
		System.out.println("아이디 또는 비밀번호가 틀렸습니다.");				
	 }
	
	response.sendRedirect(msg);
%>
	
	
</body>
</html>
	