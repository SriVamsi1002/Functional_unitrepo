<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New functional unit creation</title>
<style>
  body {
    font-family: Arial, sans-serif;
    margin: 20px;
  }

  form {
    width: 300px;
    margin: 0 auto;
  }

  input[type="number"] {
    width: 100%;
    padding: 10px;
    margin-bottom: 10px;
    box-sizing: border-box;
    border: 1px solid #ccc;
    border-radius: 4px;
  }

  button[type="submit"] {
    width: 100%;
    padding: 10px;
    background-color: #4CAF50;
    color: white;
    border: none;
    border-radius: 4px;
    cursor: pointer;
  }

  button[type="submit"]:hover {
    background-color: #45a049;
  }
</style>
</head>
<body>
<center>
<h1>New Functional unit creation</h1></center>
  <form action="newfunit" method="post">
   Modl_id: <input type="number" name="modl_id" placeholder="Enter Module Id">
   Funit_id<input type="number" name="f_unit_id" placeholder="Enter Functional unit id">
    <button type="submit">Create</button>
  </form>
</body>
</html>