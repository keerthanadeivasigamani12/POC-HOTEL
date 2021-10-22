<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*"%>



<html>
<head>
<title>Welcome</title>
<style>
body {
background-image:
url('https://th.bing.com/th/id/OIP.6Ol42GgPFuJCyePdzMRKQgHaEo?pid=ImgDet&rs=1');
background-repeat: no-repeat;
background-size: cover;
}
</style>



</head>
<body>



<table>
<tr><td>
<a>Room Details</a></td></tr>
</table>

<%
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","Keerthi@123");
Statement statement = connection.createStatement() ;
ResultSet resultset = statement.executeQuery("select * from hotelroom ") ;
%>
<table BORDER="1">
<tr>
<th>Room number</th>
<th>Room type</th>
<th>Room status</th>
</tr>
<% while(resultset.next()){ %>
<tr>
<td> <%= resultset.getString(1) %></td>
<td> <%= resultset.getString(2) %></td>
<td> <%= resultset.getString(3) %></td>
</tr>
<% } %>
</table>

<table>
<tr></td><a href="Home.html"><b>Logout</b></a></td></tr><br>

<a href="booking.jsp">Book Room</a>
</table>
</body>
</html>