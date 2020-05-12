<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
<style type="text/css">
.b{
			background-color: #333;
			margin: auto;
			text-align: center;

		}
		table	{
			border: 10px solid white;
            margin-left: auto;
            margin-right: auto;
            margin-top: auto;
            margin-bottom: auto;
            width: 400px;
			border-radius: 10px;
		}
		form{
			background-color: #4CbF50;
			color: white;
			font-size: 20px;
			width: 100%;
		}
		.button{
			background-color: green;
  			border: none;
  			color: white;
  			cursor: pointer;
  			padding: 10px 25px;
  			font-size: 16px;
		}
		h1{
			color: black;
		}
</style>
</head>
<body class="b">
<table>
<tr>
<td>
	<form action="SignUpController" method="post">
			<br>
			<h1>Sign Up</h1>
			First Name:   
			<input type="text" name="firstName" placeholder="Enter First Name"><br><br>
			Last Name:   
			<input type="text" name="lastName" placeholder="Enter Last Name"><br><br>
			Username:   
			<input type="text" name="username" placeholder="Enter Username"><br><br>
			Password:
			<input type="password" name="password" placeholder="Enter Password" required><br><br>
			<input type="submit" class="button"><br><br>
			<a href="Login">SignIn</a><br><br><br>
	</form>
</td></tr>
</table>
</body>
</html>