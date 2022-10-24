<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 16/10/2022
  Time: 12:16 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date" %>
<%
    String nombreAlumno = (String) request.getAttribute("nombreAlumno");

%>
<html>
<head>
    <title>Title</title>
    <h1>My nombre es <%=nombreAlumno%></h1>
</head>
<body>

</body>
</html>
