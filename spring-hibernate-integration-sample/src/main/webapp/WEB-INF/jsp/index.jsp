<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
    <meta charset="utf-8"/>
    <style>
        table, th, td, tr {
            border: 1px solid black;
        }
    </style>
</head>
<body>
<h1>主页</h1>

<h2>添加用户</h2>
<form action="${pageContext.request.contextPath}/add" method="post">
    <label for="username">用户名</label>
    <input type="text" id="username" name="username">
    <br>
    <label for="password">密码</label>
    <input type="password" id="password" name="password">
    <br>
    <label for="birthday">生日</label>
    <input type="date" id="birthday" name="birthday">
    <br>
    <input type="submit" value="提交">

</form>
<h2>所有用户</h2>
<table>
    <thead>
    <tr>
        <th>用户编号</th>
        <th>用户名</th>
        <th>密码</th>
        <th>生日</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td>${user.birthday}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
