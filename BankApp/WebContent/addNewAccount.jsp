<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bank App</title>
</head>
<body>
	<div>
		Account Holder Name: <input type="text" name="customerName"/></br></br>
		Email-Id:  <input type="email" name="emailId"/></br></br>
		Date Of Birth: <input type="date" name="dob"/></br></br>
		Phone No: <input type="tel" name="telephone"/></br></br>
		Account Type: <select>
					<option value="Savings Account" name="savingsAccount">Savings Account</option>
					<option value="Current Account" name="currentAccount">Current Account</option>
		
				</select> </br></br>
		Salaried Account: <input type="radio" name="salaried" value="yes">Yes
							<input type="radio" name="salaried" value="no">No  </br></br>
		Balance: <input type="number" name="balance"/></br></br>
		
		<button type="reset">Clear</button>
		<button type="submit">Submit</button> 
	
	</div>
</body>
</html>