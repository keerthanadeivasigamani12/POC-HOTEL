<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login here</title>
</head>
<body background="https://th.bing.com/th/id/R.a2372f6deacf24c9da826ddc6d0e7ff0?rik=o3vptlLwNI6Mtw&riu=http%3a%2f%2fwallpapersdsc.net%2fwp-content%2fuploads%2f2016%2f10%2fSunset-HD.jpg&ehk=ZlF9W%2bVKWFaiCid0LPPaJ9OzNVtmJCz25aLwSiX%2fGZo%3d&risl=&pid=ImgRaw&r=0" link="#000" alink="#017bf5" vlink="#000">
<div align ="center"><br><br><br><br><br>
<h1> Login Form</h1><br><br>
<form action ="login" method="post">
<table>

<tr><td>User Name: </td><td><input type="text" name="username" required></td></tr>
<tr><td>Password: </td><td><input type="password" name="password" required></td></tr>
<select name = "dropdown">
            <option value = "Admin" selected>Admin</option>
            <option value = "Non Admin">Non Admin</option>
         </select>
<tr><td></td><td><input type="submit" value="Submit"></td></tr>
</table>


</form>

</div>
</body>
</html>