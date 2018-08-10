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
				<a href="viewCart.webApp">Cart &nbsp; ${sessionScope.cartItems}</a>
			</h3>
		</div>
		<table border="10" >
			<tr>
				<th align="left">Book ID</th>
				<th align="left">Book Name</th>
				<th align="left">Book Price</th>
			</tr>

			<jstl:forEach var="cartBook" items="${requestScope.cartBooks}">
				<tr>
					<td>${cartBook.bookId}</td>
					<td>${cartBook.bookName}</td>
					<td>${cartBook.bookPrice}</td>
					<td><a href="removeBook.webApp?cartBookId=${cartBook.bookId}">Remove
							From Cart</a></td>

				</tr>
			</jstl:forEach>

		</table>
			<div align="right">Total Price: Rs. ${sessionScope.totalPrice}
			</div>
	</div>
</body>
</html>