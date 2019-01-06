<%@ page import = "java.sql.Connection" %>
<%@ page import = "java.sql.Statement" %>
<%@ page import = "java.sql.ResultSet" %>
<%@ page import = "com.temple.login.Util" %>
<%@ page import = "java.io.PrintWriter" %>
<%@ page import = "java.sql.Timestamp" %>
<link rel="stylesheet"
	href="bower_components/bootstrap/dist/css/bootstrap.css" />
<script type="text/javascript"
	src="bower_components/jquery/dist/jquery.js"></script>
<script type="text/javascript"
	src="bower_components/bootstrap/dist/js/bootstrap.js"></script>
<form>

<center><table border=1>
	<tr>
		<th>IsActive</th>
		<th>Username</th>
		<th>Created by</th>
		<th>Created Date</th>
		<th>Modified by</th>
		<th>Modified Date</th>
	</tr>
	
<%
	PrintWriter pout = response.getWriter();
	try(Connection con = Util.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM LOGIN"))
	{
		while(rs.next())
		{
%>

			<tr><td><input type = 'radio' class='radio' name="radio" value=""/></td>
 			<td><%=rs.getString("USERNAME") %></td>
         <td><%=rs.getString("CREATED_BY") %></td>
           <td><%=rs.getString("CREATED_DATE") %></td>
          <td><%=rs.getString("MODIFIED_BY") %></td>
          <%-- <td><%=rs.getString("MODIFIED_DATE")=="0000-00-00 00:00:00"?"":rs.getString("MODIFIED_DATE")%></td> --%>
		
		
<%
		}
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
	}
%>

</table>

<button type="submit" class="btn btn-success" formaction="AddUser.jsp">Add</button>
<button type="submit" class="btn btn-warning" formaction="EditUser.jsp">Edit</button>
<button type="submit" class="btn btn-danger" formaction="DeleteUser.jsp">Delete</button>
</center>
</form>
${status}