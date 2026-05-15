<%@ page session="true" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>

<%
    String name = request.getParameter("username");

    if (name != null) {
        session.setAttribute("user", name);

        // Set session timeout to 1 minute (60 seconds)
        session.setMaxInactiveInterval(60);
    }

    String user = (String) session.getAttribute("user");

    if (user != null) {
%>
        <h2>Hello <%= user %>!</h2>
        <p>Your session will expire in 1 minute.</p>
        <a href="check.jsp">Check Session Status</a>
<%
    } else {
%>
        <h2>Session expired!</h2>
        <a href="index.jsp">Go back</a>
<%
    }
%>

</body>
</html>