<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:import url="header.jsp"></c:import>
<div style="color:red;">${error}</div>
<form:form action="/bookManagementcrud_spring/addbook" method="post" modelAttribute="bean">
<table>
<tr>
<td>
Book Code
</td>
<td>
<form:input type="text" path="bookCode" />
</td>

</tr>
<tr>
<td>
Book Title
</td>
<td>
<form:input type="text" path="bookTitle" />
</td>
</tr>
<tr>
<td>
Book Author
</td>
<td>
<form:input type="text" path="bookAuthor" />
</td>
</tr>
<tr>
<td>
Book Price
</td>
<td>
<form:input type="text" path="bookPrice" />
</td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Add"></td>
</tr>
</table>
</form:form>
</body>
</html>