<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>dđffgg</h1>
<form:form action="/account/store" method="post" modelAttribute="account" >
    Name: <form:input type="text" path="userName" />
    Password: <form:input type="text" path="password" />
    <button type="submit">Gửi</button>
</form:form>
</body>
</html>
