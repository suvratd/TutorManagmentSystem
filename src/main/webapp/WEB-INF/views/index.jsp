<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4 MVC - HelloWorld Index Page</title>
<style type="text/css">
	.error{ color: red;}

</style>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
 
	<center>
		<h2>Tutor Managment System</h2><br><br>
	</center>
	
	<center>
	<form action="login" method="post">
		<div class="error">${errorMessage}</div>
		Username : <input name="username" type="text"> <br><br>
		Password : <input name="password" type="Password"><br><br>
		<input type="submit">
		
	</form>
	
		<h3>
			<a href="registrationform">Not a member ? Register Now!</a>
		</h3>
	</center>
</body>
</html>