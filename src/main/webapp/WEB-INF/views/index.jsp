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
                <a href="/user/add">Runner</a><br>
            </li>
            <li class="myLi">
                <a href="/run/menu">Run</a><br>
            </li>
            <li class="myLi">
                <a href="/city/all">City</a><br>
            </li>
            <li class="myLi">
                <%--<a href="#">Cities in your region</a><br>--%>
            </li>
            <li class="myLi">
                <a href="/about">About</a><br>
            </li>
            <li class="myLi">
                <a href="/admin">Admin panel</a><br>
            </li>
            <li class="myLi">
                <a href="/contact">Contact us</a><br>
            </li>
            <li class="myLi">
                <a href="/">Back to main page</a><br>
            </li>
        </ul>
    </div>
    <!-- /#sidebar-wrapper -->

    <!-- Page Content -->
    <div id="page-content-wrapper">
        <div class="container-fluid">

            <p class="myBody">Welcome to myProject. This website is for runners. In next few weeks myProject will be
                improving. For students
                project only...</code>.</p>
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