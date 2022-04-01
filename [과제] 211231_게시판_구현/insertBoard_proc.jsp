<%@page import="java.util.List"%>
<%@page import="com.enc.biz.board.BoardVO"%>
<%@page import="com.enc.biz.board.BoardService"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.support.AbstractApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
	// DB 연동 처리
	AbstractApplicationContext container 
	= new GenericXmlApplicationContext("applicationContextJDBC.xml");
	
	BoardService boardService = (BoardService) container.getBean("boardServiceJDBC");
	BoardVO vo = new BoardVO();
	List<BoardVO> boardList = boardService.getBoardList(vo);

	// 1. 사용자 입력 정보 추출
	request.setCharacterEncoding("UTF-8");
	String title = request.getParameter("title");
	String writer = request.getParameter("writer");
	String content = request.getParameter("content");

	
	vo.setTitle(title);
	vo.setWriter(writer);
	vo.setContent(content);
	boardService.insertBoard(vo);
	
	// 3. 화면 네비게이션
	response.sendRedirect("getBoardList2.jsp");
%>