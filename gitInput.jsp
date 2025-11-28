<!--gitInput.jsp-->
<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page import = "java.util.*" %>
<%@ page import ="java.text.*" %>

<!DOCTYPE html>
<html>
<head><title>Git Input</title></head>
<body>
    <form action = "GitInputServlet" method = "post">
        姓:<input type ="text" name = "sei"><br>
        名：<input type = "text" name = "mei"><br>
        <input type = "submit" value=" 送信">
        </form>
</body>
</html>