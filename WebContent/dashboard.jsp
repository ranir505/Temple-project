<html>
<head>
<script type="text/javascript" src="bower_components/jquery/dist/jquery.js"></script>
<script type="text/javascript" src="bower_components/bootstrap/dist/js/bootstrap.js"></script>
<link rel="stylesheet" href="bower_components/bootstrap/dist/css/bootstrap.css"/>
</head>
<body>
<%= "Welcome " + request.getParameter("username") + ". You are signed in.!" %></br>

<a href="usersList.jsp">List of Users</a>
<a href="LogoutController">Log Out</a>
</body>

</html>