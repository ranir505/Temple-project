${status}</br>
<%@ page language="java" pageEncoding="UTF-8" session="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Hello JSP</title>

<link rel="stylesheet"
	href="bower_components/bootstrap/dist/css/bootstrap.css" />
<script type="text/javascript"
	src="bower_components/jquery/dist/jquery.js"></script>
<script type="text/javascript"
	src="bower_components/bootstrap/dist/js/bootstrap.js"></script>
<style>
.border {
	border: 1px solid black;
}
</style>
</head>
<body>
	<div class="container">
		<div class="row">
			
			<div class="col-lg-4 col-lg-offset-4 col-sm-12">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<h4>Login</h4>
					</div>
					<div class="panel-body">
						<form action="LoginController" method="post">
							<div class="form-group">
								<label> User Name:</label>
								<input class="form-control" type="text" name="username" />
							</div>
							<div class="form-group">
								<label>Password:</label>
								<input class="form-control" type="password" name="password" />
							</div>
							
					 <input class="btn btn-success" type="submit" value="submit" />
				</form>
					</div>
					<div class="panel-footer">
					<a href="register.jsp">Register New User</a>
					</div>
				</div>
								
			</div>

		</div>
	</div>



</body>
</html>