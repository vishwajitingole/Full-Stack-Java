<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>
JSP Web App to Generate Dynamic Response
</h1>

<%
//Here JSP is nothing but servlet only where Server side rendering as well as client side rendering takes place
String name=request.getParameter("name");
//String name=request.getParameters("name");
out.print("Hello "+name);
//Unlike in servelet where we had to create 
//PrintWriter wr=response.getWriter;
//Here we won't need that out would get thise done for us
%>

<%!
//If we want declare anything
//We can use <%! for declaring anything
String city="Pune";
%>

<%@ page import="java.util.Date" %>
<%
		Date d=new Date();
		out.print(d);
		//Also alternatively we could print variable values too directly by using the below tag
		//It is called as expression tag
%>
<h1><%= d  %></h1>

</body>
</html>