<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String appPath = application.getContextPath();
String filePath = application.getRealPath("Application.jsp");
String serverInfo = application.getServerInfo();
%>
웹 애플리케이션의 컨텍스트 패스명<br>
<b><%=appPath%></b><hr>
웹 애플리케이션의 파일 경로명<br>
<b><%=filePath%></b><br>
컨테이너의 이름과 버전 번환<br>
<b><%=serverInfo%></b><br>
</body>
</html>