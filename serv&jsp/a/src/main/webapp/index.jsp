<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login" method ="post">
	<pre>
		EMAIL<input type="text" name ="email">
		PASSWORD<input type="password" name="password">
		<input type="submit" value="save">
	</pre>
	</form>
	
	<%
		if(request.getAttribute("msg")!= null){
			System.out.println(request.getAttribute("msg"));
			
		}	
	%>
</body>
</html>