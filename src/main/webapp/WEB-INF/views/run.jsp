<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>myProject</title>

    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="/resources/demos/style.css">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script>
        $(function () {
            $("#datepicker").datepicker();
        });
    </script>


    <!-- Bootstrap core CSS -->
    <link href="../../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="../../css/simple-sidebar.css" rel="stylesheet">
    <link href="../../css/table.css" rel="stylesheet">
    <link href="../../css/myCss.css" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

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
                <a href="#">Run</a>
                <ul>
                    <li class="myLi">
                        <a href="/run/add">Add Run</a>
                    </li>
                    <li class="myLi">
                        <a href="/run/all">See all runs</a>
                    </li>
                    <li class="myLi">
                        <a href="/city/cityAndRuns">See all runs according to city</a>
                    </li>
                </ul>

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
            <center><h1 class="myBody">Here you can add runner details. In next steps you will be pleased to enter all
                informations about your
                race... Or you can go deeper in toggle menu</h1></center>
            <img src="../../images/goDeeper.jpg" alt="Go deeper" class="center">
            <form:form method="POST" modelAttribute="run">
                <br>
                <h1>Name of the race:</h1> <br>
                <form:input path="nameRun" size="50"/><br>
                <form:errors path="nameRun" cssClass="error"/> <br>
                <h1>distance </h1></h1> <br>
                <form:checkbox path="distance" class="largerCheckbox" value="5"/><font size="6">5 km</font>
                <form:checkbox path="distance" class="largerCheckbox" value="10"/><font size="6">10km</font>
                <form:checkbox path="distance" class="largerCheckbox" value="21.097"/><font size="6">half
                marathon</font>
                <form:checkbox path="distance" class="largerCheckbox" value="42.195"/><font size="6">marathon</font><br>
                <form:errors path="distance" cssClass="error"/> <br>
                time in minutes :<br>
                <%--<form:input path="time" id="timepicker" size="50"/><br>--%>
                <input style="font-size: 16px;" type="text" size="1" value="0" name="ahour">h
                <input style="font-size: 16px;" type="text" size="1" value="0" name="aminutes">min
                <input style="font-size: 16px;" type="text" size="1" value="0" name="aseconds">sek
                <br>
                date: <br>
                <form:input path="date" id="datepicker"/> <br>
                <form:errors path="date" cssClass="error"/> <br>
                <form:select path="city">
                    <%--<form:option value="-" label="city" disabled="true" selected="selected"/>--%>
                    <form:options items="${cities}" itemValue="id" itemLabel="name"/>
                </form:select> <font size="6"> if you can not find your city on the list please add it</font>
                <a href="/city/add">
                    <font size="6"> Add City</font><br></a>
                <form:errors path="city" cssClass="error"/>
                <form:hidden path="id"/>
                <input type="submit" value="Add run"/>
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