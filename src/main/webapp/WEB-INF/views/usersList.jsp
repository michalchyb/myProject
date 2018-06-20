<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
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
            <h1 class="myBody">Here you can delete and edit list of runners who are stored in our amazing database</h1>
            <p size="20">

            <h3 class="myBody">Runners:</h3>
            <table class="blueTable">
                <tr class="table">
                    <th>Name</th>
                    <th>Last name</th>
                </tr>
                <c:forEach items="${users}" var="user">
                    <tr class="table">
                        <td>${user.name}</td>
                        <td>${user.lastName}</td>
                        <sec:authorize access="isAuthenticated()">
                            <td><a href="delete/${user.id}">
                                <span class="glyphicon glyphicon-trash"></span>
                            </a>
                            </td>
                            <td><a href="update/${user.id}">
                                <span class="glyphicon glyphicon-edit"></span>
                            </a></td>
                            </td>

                            <%--<td><a href="delete/${user.id}">Delete</a> <a href="update/${user.id}">Edit</a></td>--%>
                        </sec:authorize>
                    </tr>
                    <br>
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