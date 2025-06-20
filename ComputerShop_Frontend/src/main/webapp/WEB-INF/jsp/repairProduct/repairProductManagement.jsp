<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
  body {
        font-family: Arial, sans-serif;
        background-color: #eef2f3;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }

    form {
        background-color: #ffffff;
        padding: 30px 40px;
        border-radius: 10px;
        box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2);
        width: 350px;
    }

    label {
        display: block;
        margin-top: 15px;
        font-weight: bold;
    }

    input[type="text"] {
        width: 100%;
        padding: 10px;
        margin-top: 5px;
        border: 1px solid #ccc;
        border-radius: 5px;
        box-sizing: border-box;
    }

    input[type="submit"] {
        margin-top: 20px;
        width: 100%;
        padding: 10px;
        background-color: #28a745;
        color: white;
        font-weight: bold;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        transition: background-color 0.3s ease;
    }

    input[type="submit"]:hover {
        background-color: #218838;
    }
    </style>
</head>
<body>
<form action="">
<label>Sale-id</label>
<input type="text" placeholder="Enter Sale-id" name="sale-id">
<label>Product-id</label>
<input type="text" placeholder="Enter Product-id" name="product-id"><br>
<label>Product-Name</label>
<input type="text" placeholder="Enter Product-Name" name="product-name"><br>
<label>Rate</label>
<input type="text" placeholder="Enter Rate" name="rate"><br>
<label>Quantity</label>
<input type="text" placeholder="Enter quantity" name="quantity"><br>
<label>Total-amount</label>
<input type="text" placeholder="Enter total-amount" name="total-amount"><br>
<label>Sale-date</label>
<input type="text" placeholder="Enter sale-date" name="sale-date">
<label>Customer-name</label>
<input type="text" placeholder="Enter customer-name" name="customer-name">
<input type="submit">
</form>
</body>
</html>