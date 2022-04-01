<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="com.enc.biz.board.BoardVO"%>
<%@page import="com.enc.biz.board.BoardService"%>
<%@page import="org.springframework.context.support.AbstractApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

	request.setCharacterEncoding("UTF-8");
	int seq = Integer.parseInt(request.getParameter("seq"));

	AbstractApplicationContext container 
	= new GenericXmlApplicationContext("applicationContextJDBC.xml");

	BoardService boardService = (BoardService) container.getBean("boardServiceJDBC");
	BoardVO vo = new BoardVO();
	
	vo.setSeq(seq);
	boardService.deleteBoard(vo);
	
	// 3. 화면 네비게이션
	response.sendRedirect("getBoardList2.jsp");
/* 	BoardVO vo = new BoardVO();
	BoardDAO boardDAO = new BoardDAO();
	List<BoardVO> boardList = boardDAO.getBoardList(vo); 
	*/
%>