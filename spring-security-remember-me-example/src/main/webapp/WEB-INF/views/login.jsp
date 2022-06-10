<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Security</title>
<style>
table#sample tr:nth-child(odd) {
  background-color: #0074ab ;
  color: yellow ;
}
table#sample tr:nth-child(even) {
  background-color: #e6f7ff ;
}
table#sample {
  border-collapse: collapse ;
}
table#sample td {
  padding: 5px ;
}
table#sample caption {
  font-style: italic ;
  background-color: black ;
  color: white ;
}
</style>
</head>
<body background="#FFFFFF">
	<center>
	<h1>Spring Security - Remember Me Example</h1>
	<h4>Sample Login Form</h4>
	
	<form action='<spring:url value="/loginAction"/>' method="post">
    <table id = "sample">
      <tr>
        <td>Username</td>
        <td><input type="text" name="username"></td>
      </tr>
      <tr>
        <td>Password</td>
        <td><input type="password" name="password"></td>
      </tr>
      <tr>
        <td><input type="checkbox" name="remember-me"></td>
        <td>Remember me on this Computer</td>
      </tr>
      <tr>
        <td align="center" colspan="2"><button type="submit">Login</button></td>
      </tr>
    </table>
  </form>
  <br/>
  </center>
</body>
</html>