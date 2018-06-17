<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>myProject</title>
</head>
<body>
<form:select path="region">
    <form:option value="-" label="region" disabled="true" selected="selected"/>
    <form:options items="${regions}" itemValue="id" itemLabel="name"/>
</form:select><br></a>
<form:errors path="city" cssClass="error"/>
<input type="submit" value="Wyszukaj najbliższe biegi!"/>
</body>
</html>
