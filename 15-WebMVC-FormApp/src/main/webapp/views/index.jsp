<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home Page</title>
</head>
<body>
	<font color="green">${msg}</font>
    <h1>User Form </h1>
	<form action="user" method="POST">
		<table>
			<tr>
				<td>Name :</td>
				<td><input type="text" name="name"/></td>
			</tr>
			
						<tr>
								<td>Email :</td>
								<td><input type="email" name="email"/></td>
						</tr>
								
							<tr>
										<td>PhNo :</td>
										<td><input type="number" name="phno"/></td>
									
							</tr>
									<tr>
													<td></td>
													<td><input type="submit" value="Submit"/></td>
									</tr>
			
		</table>
		
	</form>
	
</body>
</html>
