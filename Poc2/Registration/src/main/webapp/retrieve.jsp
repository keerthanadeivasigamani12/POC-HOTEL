
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<%
String roomnumber=request.getParameter("Roomnumber");
String roomtype=request.getParameter("RoomType");
String roomstatus=request.getParameter("Roomstatus");

try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "Keerthi@123");
Statement st=conn.createStatement();int i=st.executeUpdate("INSERT INTO hotelroom values('"+roomnumber+"','"+roomtype+"')");
out.println("Room Booked!");
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>
<body background="https://th.bing.com/th/id/R.a2372f6deacf24c9da826ddc6d0e7ff0?rik=o3vptlLwNI6Mtw&riu=http%3a%2f%2fwallpapersdsc.net%2fwp-content%2fuploads%2f2016%2f10%2fSunset-HD.jpg&ehk=ZlF9W%2bVKWFaiCid0LPPaJ9OzNVtmJCz25aLwSiX%2fGZo%3d&risl=&pid=ImgRaw&r=0" link="#000" alink="#017bf5" vlink="#000">
<div align ="center"><br><br><br><br><br><br><br><br>
<h2>To view the room booking status</h2>

<a href="welcome.jsp">Click here</a>