<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body align="center">
	<h1>My Docs Application</h1>
	<div>
		<div>
			<jsp:include page="header.jsp"></jsp:include></div>
		<form action="ServletLogin" method="post">
		<h3>Login</h3></br>
		User Name: <input type="text" name="userName" required="required"/></br></br>
		Password : <input type="password" name="password" required="required"/></br> </br>
		<button type="submit">Submit</button></br>
		<div>
			<jsp:include page="footer.jsp"></jsp:include></div>
		</form>
	</div>
</body>
</html>