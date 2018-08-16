<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Banking App</title>
</head>
<body>
<div align="center">
	<h1>Transfer Funds</h1>
	<form action="saveFundTransfer" method="get">
		<div align="left">
			<h3>From-></h3>
			Account Number: <input type="number" name="fromAccNo">
			Amount:<input type="number" name="amount"></br>

			<h3>To -></h3>
			Account Number: <input type="number" name="toAccNo"></br> <input
				type="submit" value="submit"></br>
		</div>
	</form>
	</div>
</body>
</html>