<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="white">
	<h1 align="center" style="color: maroon;">Registration Form</h1>
	<h1 align="center">
		<img src="D:\Learning Java\UI\download.png" width="250px"
			height="100px">
	</h1>
	<form action="RegistrationSubmit.jsp" method="post">
		<table align="center">
			<tr>
				<th><label for="fName" style="color: maroon;">First
						Name</label></th>
				<td><input id="fname" type="text" name="fname"></td>
			</tr>
			<tr>
				<th><label for="fName" style="color: maroon;">Last Name</label></th>
				<td><input id="fname" type="text" name="lname"></td>
			</tr>
			<tr>
				<th><label for="gender" style="color: maroon;">Gender</label> </th>
				<td><input type="radio" name="gender" value="male">Male
					<input type="radio" name="gender" value="female">Female</td>
			</tr>
			<tr>
				<th><label for="email" style="color: maroon;">Email</label></th>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
				<th><label for="fName" style="color: maroon;">Contact</label></th>
				<td><input type="number" name="contact"></td>
			</tr>
			<tr>
				<th><label for="fName" style="color: maroon;">Address</label></th>
				<td><input type="text" placeholder="Line 1" name="add"></td>
			</tr>
			<tr>
				<th><label for="fName" style="color: maroon;">DOB</label></th>
				<td><input type="date" name="dob"></td>
			</tr>
			<tr>
				<th><label for="fName" style="color: maroon;">Language</label>
				</th>
				<td><input type="radio" name="java">Java <input
					type="radio" name="java">Python <input type="radio"
					name="html">html</td>
			</tr>
			<tr>
				<th></th>
				<td><input type="SUBMIT" name="USER" value="Submit"></input></td>
			</tr>
		</table>
	</form>
</body>
</html>