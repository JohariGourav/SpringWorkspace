<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h1 align="center">My Docs Application</h1>
		<div>
			<jsp:include page="header.jsp"></jsp:include></div>
		<div align="center">
			<h3>Hello ${sessionScope.userName}</h3>
		</div>
		<div>
			<jsp:include page="footer.jsp"></jsp:include></div>

</body>
</html>