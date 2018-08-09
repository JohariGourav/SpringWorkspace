<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shopping App</title>
</head>
<body>
	<div align="center">
		<h1>Shopping Cart</h1>
		</br>
		<div>

			<h3 align="right">
				<a href="viewCart.webApp">Cart &nbsp;</a>
			</h3>
		</div>
		<table>
			<tr>
				<th>Book ID</th>
				<th>Book Name</th>
				<th>Book Price</th>
			</tr>

			<jstl:forEach var="cartbook" items="${requestScope.cartBooks}">
				<tr>
					<td>${cartbook.bookId}</td>
					<td>${cartbook.bookName}</td>
					<td>${cartbook.bookPrice}</td>
					<td><a href="removeBook.webApp?cartBookId=${cartBook.bookId}">Remove
							From Cart</a></td>

				</tr>
			</jstl:forEach>

		</table>
	</div>
</body>
</html>