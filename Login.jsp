<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<h1>Login Page</h1>

	<form method="post" action="loginServlet">

		<span>${errorMsg }</span> <label for="userId">User ID:</label> <input
			type="text" id="userId" name="userId" required><br>
		<br> <label for="password">Password:</label> <input
			type="password" id="password" name="password" required><br>
		<br>

		<button type="submit">login</button>

	</form>
	
</body>



</html>



