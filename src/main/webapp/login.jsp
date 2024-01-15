<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="jspone">
Email<input type="text" name="mail"><br>
Password<input type="text" name="password"><br>
<input type="submit">
</form>

<%  String message=(String)request.getAttribute("message");%>
<% if(message!=null){ %>
<h1><%=message %></h1>
<%} %>


</body>
</html>