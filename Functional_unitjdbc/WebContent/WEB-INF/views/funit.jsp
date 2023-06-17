
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ page import="com.spring.model.FunitModel" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Funit Form</title>
<style>
  body {
    font-family: Arial, sans-serif;
    margin: 20px;
  }

  form {
    width: 500px;
    margin: 0 auto;
  }

  table {
    width: 100%;
    border-collapse: collapse;
  }

  th, td {
    padding: 8px;
    text-align: left;
    border-bottom: 1px solid #ddd;
  }

  th {
    background-color: #f2f2f2;
  }

  input[type="submit"] {
    padding: 10px;
    background-color: #4CAF50;
    color: white;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    float: right;
  }

  input[type="submit"]:hover {
    background-color: #45a049;
  }
</style>
</head>
<body>
  <form action="create">
    <table>
      <thead>
        <tr>
          <th>ID</th>
          <th>Funid</th>
        </tr>
      </thead>
      <tbody>
        <% ArrayList<FunitModel> pr = (ArrayList<FunitModel>) request.getAttribute("f1"); %>
        <% for (FunitModel pf : pr) { %>
          <tr>
            <td><%= pf.getModl_id() %></td>
            <td><%= pf.getFun_id() %></td>
          </tr>
        <% } %>
      </tbody>
    </table>
    <input type="submit" value="Create-New-Functional-Unit">
  </form>
</body>
</html>
