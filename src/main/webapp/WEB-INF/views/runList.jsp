<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


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
                <a href="#">Run</a>
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
            <h1 class="myBody">On the list below you will find all runs added by runers</h1>
            </h1><sec:authorize access="isAuthenticated()">
            <b class="myBody">If you are in admin mode you can delete and edit them</b>
        </sec:authorize>

            <table class="blueTable">

                <tr class="table">
                    <th>Name run</th>
                    <th>distance</th>
                    <th>date</th>
                    <th>time h:m:s</th>
                    <th>user name</th>

                </tr>
                <c:forEach items="${runs}" var="run">
                    <tr class="table">
                        <td>${run.nameRun}</td>
                        <td>${run.distance}</td>
                        <td>${run.date}</td>
                        <td>${run.time}</td>
                        <td>${run.user.name}</td>
                        <sec:authorize access="isAuthenticated()">
                            <%--<td><a href="delete/${run.id}">Delete</a> <a href="update/${run.id}">Edit</a></td>--%>
                            <td><a href="delete/${run.id}">
                                <span class="glyphicon glyphicon-trash"></span>
                            </a>
                            </td>
                            <td><a href="update/${run.id}">
                                <span class="glyphicon glyphicon-edit"></span>
                            </a></td>
                            </td>
                        </sec:authorize>
                    </tr>
                </c:forEach>
            </table>
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