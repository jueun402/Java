<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인</title>
</head>
<body>
	<center>
		<h1>로그인</h1>
		<hr>
		<form action="login_proc2.jsp" method="post">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange">아이디</td>
					<td><input type="text" name="id" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">비밀번호</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="로그인" /></td>
				</tr>
			</table>
		</form>
		<hr>
	</center>
	
		
	 <% 
           // 아이디, 비밀번호가 틀릴경우 화면에 메시지 표시
           // login_proc.jsp에서 로그인 처리 결과에 따른 메시지를 보낸다.
           String msg=request.getParameter("msg");
           
            if(msg!=null && msg.equals("-1"))
           {    
               out.println("");
               out.println("<font color='red' size='1'>아이디 또는 비밀번호가 틀렸습니다.</font>");
           }
     %>
</body>
</html>