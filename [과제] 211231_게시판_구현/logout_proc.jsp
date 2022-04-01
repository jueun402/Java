<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>세션 정보 : <%=session.getAttribute("sessionID")%>);
</title>
</head>
<body>

<%
session.invalidate(); // session 종료 
%>
<script>
alert("로그 아웃 되었습니다.");
location.href="login2.jsp";
</script>
</body>
</html>