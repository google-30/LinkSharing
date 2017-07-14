<%--
  Created by IntelliJ IDEA.
  User: SHUBHAM JAIN
  Date: 7/9/2017
  Time: 3:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Blog World</title>
</head>
<body>

  <div align="center" style="margin-top: 50px;">
    <h1>
        Welcome ${username}
    </h1>
   
    <h3>ADD BLOG</h3>

    <form action="addblog" method="post">
         BLOG ID :  <input type="text" name="blogid" size="20px"> <br>
         BLOG CONTENT :  <textarea name="blogcontent"></textarea> <br>
        <input type="submit" value="save">
        
    </form>
   
    <c:if test="${not empty error}">
        <h1 style="color : red ;">${error}</h1>
    </c:if>

    <c:if test="${not empty success}">
        <h1 style="color : green ;">${success}</h1>
    </c:if>

    
  </div>


    
</body>
</html>
