<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Edit Employee</h1>
	<form:form method="POST" action="/SpringMVCCRUD1/editsave">
		<table>
			<tr>
				<td></td>
				<td><form:hidden path="eid" /></td>
			</tr>
			<tr>
				<td>Name :</td>
				<td><form:input path="ename" /></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><form:input path="eemail" /></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><form:input path="epassword" /></td>
			</tr>
			<tr>
				<td>Salary :</td>
				<td><form:input path="esalary" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Edit Save" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>