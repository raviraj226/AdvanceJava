<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String fname=request.getParameter("fname");
String lname=request.getParameter("lname");
String gender=request.getParameter("gender");
String email=request.getParameter("email");
String contact=request.getParameter("contact");
String add=request.getParameter("add");
String dob=request.getParameter("dob");
%>
<%=fname%>
<%=lname%>
<%=gender%>
<%=email%>
<%=contact%>
<%=add%>
<%=dob%>

</body>
</html>