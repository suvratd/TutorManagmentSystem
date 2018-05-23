<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
		<h2>Student Registration </h2><br><br>
	</center>
	<center>
	<form:form action="ProcessUserRegistration" modelAttribute="user">
	
	User Name <form:input path="userName"/> <form:errors path="userName" cssClass="error"/><br> <br>
	Email Name <form:input path="email"/><form:errors path="email" cssClass="error"/> <br> <br>
	First Name <form:input path="firstName"/><form:errors path="firstName" cssClass="error"/> <br> <br>
	Last Name <form:input path="lastname"/><form:errors path="lastname" cssClass="error"/> <br> <br>
	Password <form:input type="password" path="password"/> <form:errors path="password" cssClass="error"/> <br> <br>
	
	<input type="submit" value="Submit">
	</form:form>
	</center>
</body>
</html>