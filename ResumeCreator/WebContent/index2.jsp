<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.cg.resume.Resume"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <%=skills %>
 --%>
 <%  
 Resume resume=(Resume) request.getAttribute("ServletResume");
 String name = resume.getFirstName();
%>
<h1><marquee>Resume</marquee></h1></br>
 	First Name: <%= name %></br>
 	Last Name:	<%= resume.getLastName() %></br>
 	Address:	<%= resume.getAddress() %></br>
 
 </body>
</html>