<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <%@ include file="parts/meta.jsp" %>

</head>

<body>

<div id="wrapper">

    <!-- Sidebar -->
    <div id="sidebar-wrapper">
        <ul class="sidebar-nav">
            <li class="sidebar-brand">
                <a href="https://www.coderslab.pl/pl">
                    My Project for Coderslab
                </a>
            </li>
            <li class="myLi">
                <a href="#">City</a>
            </li>
            <li class="myLi">
                <a href="/admin">Admin panel</a>
            </li>
            <li class="myLi">
                <a href="/index1">Back to main page</a>
            </li>
        </ul>
    </div>
    <!-- /#sidebar-wrapper -->

    <!-- Page Content -->
    <div id="page-content-wrapper">
        <div class="container-fluid">
            <form:form method="POST" modelAttribute="run" action="/run/update">
                Put new info about the race:<br><br>
                <h1>Name of the race:</h1> <br>
                <form:input path="nameRun" size="50"/><br>
                <form:errors path="nameRun" cssClass="error"/> <br>
                <h1>distance </h1></h1> <br>
                <form:checkbox path="distance" class="largerCheckbox" size="50" value="5"/><font size="6"> 5 km</font>
                <form:checkbox path="distance" class="largerCheckbox" size="50" value="10"/><font size="6">10km</font>
                <form:checkbox path="distance" class="largerCheckbox" size="50" value="21.097"/><font size="6">half
                marathon</font>
                <form:checkbox path="distance" class="largerCheckbox" size="50" value="42.195"/> <font
                    size="6">marathon </font><br>
                <form:errors path="distance" cssClass="error"/> <br>
                <h1>time in minutes :</h1><br>
                <form:input path="time" id="time"/><br>

                <h1>date:</h1> <br>
                <form:input path="date" id="datepicker"/><br>
                <form:errors path="date" cssClass="error"/> <br>
                <form:select path="city">
                    <%--<form:option value="-" label="city" disabled="true" selected="selected"/>--%>
                    <form:options items="${cities}" itemValue="id" itemLabel="name"/>
                </form:select><font size="40"> or add new city<a href="/city/add"> Add City</font><br></a>
                <form:errors path="city" cssClass="error"/>
                <form:hidden path="id"/>
                <input type="submit" value="Edit Run"/>
            </form:form>
            </p>
            <a href="/"> <span class="glyphicon glyphicon-home" size="100"></span></a><br>

            <a href="#menu-toggle" class="btn btn-secondary" id="menu-toggle">Toggle Menu</a>
        </div>
    </div>

</div>
<!-- /#wrapper -->


<!-- /#page-content-wrapper -->

</div>

<%@ include file="parts/footer.jsp" %>

</body>

</html>