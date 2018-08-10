<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>Shopping Web App</h1>
		</br>
		<div>
			<h3>Books Catalogue</h3>
			<h3 align="right"><a href="viewCart.webApp">Cart &nbsp; ${sessionScope.cartItems}</a></h3>
		</div>
		<table border="10">
			<tr>
				<th align="left">Book ID</th>
				<th align="left">Book Name</th>
				<th align="left">Book Price</th>
			</tr>
			<jstl:forEach var="book" items="${requestScope.books }">
				<tr>
					<td>${book.bookId}</td>
					<td>${book.bookName}</td>
					<td>${book.bookPrice}</td>
					<td><a href="addToCart.webApp?bookId=${book.bookId}">Add To Cart</a></td>
				</tr>
			</jstl:forEach>

		</table>
	</div>
</body>
</html>