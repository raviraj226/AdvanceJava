<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="grey">
	<form action="LoginCtl" method="post">
		<table align="center">


			<h1 align="center">LogIn</h1>
			<%
				String error = (String) request.getAttribute("error");
				if (error != null) {
			%>
			<center>
				<font color="maroon"><%=error%></font>
			</center>
			<%
				}
			%>

			<tr>
				<th>UserId*</th>
				<td><input type="text" name="user"></td>
				<td>
					<%
						String errorlogin = (String) request.getAttribute("errorlogin");
						if (errorlogin != null) {
					%>
					<center>
						<font color="maroon"><%=errorlogin%></font>
					</center> <%
 	}
 %>
				</td>
			</tr>


			<th>Password*</th>
			<td><input type="password" name="pwd"></td>
			<td>
				<%
					String s2 = (String) request.getAttribute("errorpass");
					if (s2 != null) {
				%>
				<center>
					<font color="maroon"><%=s2%></font>
				</center> <%
 	}
 %>
			</td>


			<tr>
				<th></th>
				<td><input type="Submit" name="op" value="Submit"></input></td>
			</tr>


			<tr>
				<th></th>
				<td><input type="submit" value="Forgot Password"></td>
			</tr>
			
			<tr>
				<th></th>
				<td><a style="color: maroon" href="RegistrationForm.jsp">Create New Account</a></td>
			</tr>
			
			
		</table>
	</form>
</body>
</html>