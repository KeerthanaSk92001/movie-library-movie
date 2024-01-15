<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% int a=(int)request.getAttribute("a"); %>
<% int b=(int)request.getAttribute("b"); %>




<br>Addition <%=a+b %><br>
Subraction<%=a-b %><br>
Multiplication<%=a*b %><br>
Division<%=a/b %><br>

<% while(a>=b) {%>
<%=a-- %>
<%} %>

<% while(a<=b) {%>
<%=a++ %>
<%} %>


</body>
</html>