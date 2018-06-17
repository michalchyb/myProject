<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">
<body>
<h1>Admin login page</h1>
<form th:action="@{/login}" method="post">
    <div><label class="myBody"> User Name : <input type="text" name="username"/> </label></div>
    <div><label class="myBody"> Password: <input type="password" name="password"/> </label></div>
    <div class="myBody"><input type="submit" value="Sign	In"/></div>
</form>
</body>
</html>