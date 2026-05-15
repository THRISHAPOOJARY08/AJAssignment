<%@ page import="javax.servlet.http.Cookie" %>

<html>
<head>
    <title>Add Cookie</title>
</head>
<body>

<%
    String name = request.getParameter("name");
    String domain = request.getParameter("domain");
    int age = Integer.parseInt(request.getParameter("age"));

    // Create Cookie
    Cookie ck = new Cookie(name, domain);

    // Set expiry age
    ck.setMaxAge(age);

    // Add cookie to response
    response.addCookie(ck);
%>

<h2>Cookie Added Successfully</h2>

<p><b>Cookie Name:</b> <%= ck.getName() %></p>

<p><b>Cookie Domain(Value):</b> <%= ck.getValue() %></p>

<p><b>Max Expiry Age:</b> <%= ck.getMaxAge() %> seconds</p>

<br>

<a href="showCookies.jsp">
    Go to the Active Cookie List
</a>

</body>
</html>