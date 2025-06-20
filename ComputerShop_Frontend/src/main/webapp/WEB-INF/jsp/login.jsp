
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Login Form</title>
<style>
body {
	font-family: Arial, sans-serif;
	background: #f4f4f4;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

form {
	background-color: #ffffff;
	padding: 30px 40px;
	border-radius: 10px;
	box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2);
	width: 300px;
}

label {
	display: block;
	margin-top: 15px;
	font-weight: bold;
}

input[type="text"] {
	width: 100%;
	padding: 10px;
	margin-top: 5px;
	border: 1px solid #ccc;
	border-radius: 5px;
}

input[type="submit"] {
	margin-top: 20px;
	width: 100%;
	padding: 10px;
	background-color: #007bff;
	color: white;
	font-weight: bold;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	transition: background-color 0.3s ease;
}

input[type="submit"]:hover {
	background-color: #0056b3;
}
</style>
</head>
<body>

	<form action="loginForm" method="post">

		<label>Enter UserName</label> 
		<input type="text" placeholder="Enter username" name="username">
		
			 <label>Enter Password</label>
			 <input type="text" placeholder="Enter password" name="password">
			 <input type="submit" value="Login">

		


		<a href="sign_Up">Sign-Up</a>
	</form>

</body>
</html>
