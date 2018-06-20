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
                <a href="/city/all">Cities</a>
            </li>
            <li class="myLi">
                <a href="/user/all">Users</a>
            </li>
            <li class="myLi">
                <a href="/run/all">Runs</a>
            </li>
            <li class="myLi">
                <a href="/region/all">Regions</a>
            </li>

            <li class="myLi">
                <a href="/admin">Admin panel</a>
            </li>
            <li class="myLi">
                <a href="/about">About</a>
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

            <p class="myBody">In this section you can be an admin. If you log in correctly! :)

            </p>
            <img src="../../images/admin.png" alt="admin mode" class="center">
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