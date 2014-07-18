<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ultradux
  Date: 14-Jul-14
  Time: 01:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/style.css" type="text/css">
    <title>Parsing page</title>
</head>
<body>

<jsp:include page="index.jsp"></jsp:include>
<h2>Parsed with ${type}</h2>
<table border="0">
    <thead>
    <tr>
        <th>ID</th>
        <th>Stone</th>
        <th>Preciousness</th>
        <th>Origin</th>
        <th>Color</th>
        <th>Transparency</th>
        <th>Faces</th>
        <th>Value</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${stone}" var="stone" >
        <tr>
            <td><c:out value="${stone.id}"/></td>
            <td><c:out value="${stone.stone}"/></td>
            <td><c:out value="${stone.preciousness}"/></td>
            <td><c:out value="${stone.origin}"/></td>
            <td><c:out value="${stone.color}"/></td>
            <td><c:out value="${stone.transparency}"/></td>
            <td><c:out value="${stone.faces}%"/></td>
            <td><c:out value="${stone.value}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
