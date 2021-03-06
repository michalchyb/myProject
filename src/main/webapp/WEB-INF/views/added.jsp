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
            <li>
                <a href="#">Run</a>
            </li>
            <li>
                <a href="/admin">Admin panel</a>
            </li>
            <li>
                <a href="/index1">Back to main page</a>
            </li>
        </ul>
    </div>
    <!-- /#sidebar-wrapper -->

    <!-- Page Content -->
    <div id="page-content-wrapper">
        <div class="container-fluid">
            <p>
            <h1 class="myBody">Your data are successfully added to database!</h1><br>
            <img src="../../images/database.png" alt="add to database" class="center">
            <font size=""> Go <a href="/index1">back to main page</a> or use Toggle Menu</font>

            </p>
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