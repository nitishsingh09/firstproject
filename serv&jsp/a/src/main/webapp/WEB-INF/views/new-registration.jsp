<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>NEW REGISTRATION</h1>
	<form action="new" method="post">
	<pre>
		name<input type="text" name="name">
		city<input type="text" name="city">
		email<input type = "text" name="email">
		mobile<input type="text" name = "mobile">	
		<input type="submit" value="save">
	</pre>
	</form>



	<%
		if(request.getAttribute("message")!= null){
			out.println(request.getAttribute("message"));
			
		}
	
	%>

</body>
</html>