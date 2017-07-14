<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> JSP Servlet Example</title>
</head>
<body>
 
    <div align="center" style="margin-top: 50px;">
        <h1> Login Page  </h1>
        <form action="login" method="post">
            Please enter your Username:  <input type="text" name="username" size="20px"> <br>
            Please enter your Password:  <input type="password" name="password" size="20px"> <br><br>
        <input type="submit" value="submit">
        </form>
    
        <c:if test="${not empty message}">
            <h1>${message}</h1>
        </c:if>
        
 
    </div>
 
</body>