<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Edit Product</title>
</head>
<body>
<h1>Edit Product</h1>
<%--@elvariable id="product" type=""--%>
<form:form action="/product/update" method="post" modelAttribute="product">
    <input type="hidden" id="productCode" name="productCode" value="${product.productCode}" readonly><br>
    <label for="productName">Tên sản phẩm</label>
    <input type="text" id="productName" name="productName" value="${product.productName}"><br>
    <label for="productPrice">Giá sản phẩm</label>
    <input type="number" id="productPrice" name="productPrice" value="${product.productPrice}"> <br>
    <input type="submit" value="CẬP NHẬT" name="action"/>
</form:form>


</body>
</html>
