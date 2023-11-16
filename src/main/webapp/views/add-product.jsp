<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create Product</h1>
<%--@elvariable id="product" type=""--%>
<form:form action="save-product" method="post" modelAttribute="product">
    <form:label path="productName">ProductName</form:label>
    <form:input path="productName" /><br>
    <form:label path="productPrice">ProductPrice</form:label>
    <form:input path="productPrice" /><br>
    <form:button type="submit">Thêm mới</form:button>
</form:form>
</body>
</html>
