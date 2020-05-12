<!DOCTYPE html>
<html>
<head>
<title>Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style type="text/css">
		.b{
			background-color: #333;
			margin: auto;
			text-align: center;

		}
		table	{
			border: 10px solid #ebebeb;
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
	<form action="LoginController" method="post">
			<br>
			<h1>Login</h1>
			Username:   
			<input type="text" name="username" placeholder="Enter Username"><br><br>
			Password:
			<input type="password" name="password" placeholder="Enter Password" required><br><br>
			<input type="submit" class="button"><br><br>
			<a href="SignUp">Sign Up</a><br><br><br>
	</form>
</td>
</tr>
</table>
<p style="color: red">${msg }</p>
</body>
</html>