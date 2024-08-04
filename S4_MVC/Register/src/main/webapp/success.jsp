<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Data inserted successfully</h1>
<h2>
<%
String name=(String)session.getAttribute("name");
%>
The user have been registered
<%= name %>
</h2>

</body>
</html>