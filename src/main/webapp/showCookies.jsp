<%@ page import="javax.servlet.http.Cookie" %>

<html>
<head>
    <title>Active Cookies</title>
</head>
<body>

<h2>Active Cookie List</h2>

<%
    Cookie cookies[] = request.getCookies();

    if(cookies != null)
    {
%>

<table border="1" cellpadding="10">
    <tr>
        <th>Cookie Name</th>
        <th>Cookie Value</th>
        <th>Max Age</th>
    </tr>

<%
        for(Cookie c : cookies)
        {
%>

    <tr>
        <td><%= c.getName() %></td>
        <td><%= c.getValue() %></td>
        <td><%= c.getMaxAge() %></td>
    </tr>

<%
        }
%>

</table>

<%
    }
    else
    {
%>

<p>No Active Cookies Found</p>

<%
    }
%>

</body>
</html>