<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3> get 방식에서 한글 깨짐 방지 </h3>
<form method="get" action="InfoServlet">
이름 : <input type="text" name="name"><br>
주소 : <input type="text" name="addr"><br>
<input type="submit" value="전송" >
</form>
<br>
<h3> post 방식에서 한글 깨짐 방지 </h3>
<form method="post" action="InfoServlet">
이름 : <input type="text" name="name"><br>
주소 : <input type="text" name="addr"><br>
<input type="submit" value="전송" >
</form>
</body>
</html>