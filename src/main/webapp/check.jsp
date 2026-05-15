<%@ page session="true" %>
<html>
<head>
    <title>Session Check</title>
</head>
<body>

<%
    String user = (String) session.getAttribute("user");

    if (user != null) {
%>
        <h2>Session Active</h2>
        <p>Hello <%= user %>!</p>
        <p>Your session is still valid.</p>
<%
    } else {
%>
        <h2>Session Expired</h2>
        <p>Your session has expired after 1 minute.</p>
        <a href="index.jsp">Start Again</a>
<%
    }
%>

</body>
</html>