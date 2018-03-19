<%--
  Created by IntelliJ IDEA.
  User: Aurélien Blot
  Date: 16/03/2018
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Championnat de babyfoot</title>

    <link rel="stylesheet" type="text/css" href="/inc/style.css" />
</head>
<body>
<header>
    <div class="wrap">
        <c:import url="/inc/banniere.jsp"/>

    </div>
</header>

<div id="content">
    <div class="wrap">
        <nav>

            <c:import url="/inc/navJoueurs.jsp"/>
        </nav>

    </div>
</div>
<footer>
    <div class="wrap">
        <c:import url="/inc/footer.jsp"/>
    </div>

</footer>
</body>
</html>

