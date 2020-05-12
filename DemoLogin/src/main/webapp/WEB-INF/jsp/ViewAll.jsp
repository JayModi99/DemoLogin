<%@page import="org.springframework.beans.factory.annotation.Autowired"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
   <%@ page import="java.util.List" %>
   <%@ page import="com.practice.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View All</title>
</head>
<body>

<h1>View All</h1>


<table border="2">
		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>Username</td>
			<td>Password</td>
		</tr>
<%
	List<User> us = (List<User>) request.getAttribute("users");
	for(User u: us)
	{
%>		
		<tr>
			<td><%=u.getId() %></td>
			<td><%=u.getFirstName() %> <%=u.getLastName() %></td>
			<td><%=u.getUsername() %></td>
			<td><%=u.getPassword() %></td>
		</tr>
<% } %>



	</table>
	<table border="2">
		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>Username</td>
			<td>Password</td>
		</tr>
		
		
<c:forEach var="listValue" items="${userList }">
	
		<tr>
			<td>${listValue.id }</td>
			<td>${listValue.firstName } ${listValue.lastName }</td>
			<td>${listValue.username }</td>
			<td>${listValue.password }</td>
		</tr>
</c:forEach>
	</table>

</body>
</html>