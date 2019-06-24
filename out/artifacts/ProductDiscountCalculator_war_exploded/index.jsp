<%--
  Created by IntelliJ IDEA.
  User: thuan
  Date: 6/24/19
  Time: 3:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Currency Converter</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<style>
label{
  font-size: large;
  color: blueviolet;
}
#kamte{
  border:20px solid yellowgreen;
  width: 500px;
  margin: 1px;
  padding: 0px 20px 20px;
  background-color: beige;
  font-size: larger;
  color: burlywood;
}
</style>
<body>
<p align="middle">
<div id="kamte">
<h2>Currency Converter</h2>
<form action="/convert" method="post">
  <label>Product Description: </label><br/>
  <input type="text" name="description"/><br/>
  <label>List Price: </label><br/>
  <input type="text" name="listPrice" /><br/>
  <label>Discount Percent </label><br/>
  <input type="text" name="discountPercent"/><br/>


  <input type = "submit" id = "submit" value = "Calculate Discount"/>
</form>
</div>
</p>
</body>
</html>
