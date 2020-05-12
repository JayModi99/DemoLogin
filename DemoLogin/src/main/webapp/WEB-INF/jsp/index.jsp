<!DOCTYPE html>
<html>
<head>
<title>Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>

<%
HttpSession session1=request.getSession(false);  
String uname=(String)session.getAttribute("uname"); 
%>
<p>Welcome, <%=uname %></p>
<br><br>
<a href="/ViewAllController">View All</a>

</body>
</html>