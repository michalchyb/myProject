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
                <a href="#">Runners</a>
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
            <form:form method="POST" modelAttribute="user">
                <form:select path="runs">
                    <form:options items="${runs}" itemValue="id" itemLabel="nameRun"/>
                </form:select> <font size="6"> add your run </font> <a href="/run/add"><font size="6"> Add
                Run</font><br></a>
                <form:errors path="runs" cssClass="error"/>
                Your details:<br>
                Name<br>
                <form:input path="name"/><br>
                <form:errors path="name" cssClass="error"/><br>
                Surname: <br>
                <form:input path="lastName"/><br>
                <form:errors path="lastName" cssClass="error"/><br>
                email: <br>
                <form:input path="email"/><br>
                <form:errors path="email" cssClass="error"/><br>

                <form:hidden path="id"/>
                <input type="submit" value="Add Runner"/>
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