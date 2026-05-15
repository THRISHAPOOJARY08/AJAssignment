package com.cookieservlet; 

import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 
import javax.servlet.annotation.WebServlet; 

@WebServlet("/CookieServlet") 
public class CookieServlet extends HttpServlet { 

    private static final long serialVersionUID = 1L; 

    int count = 0; // visit count 

    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException { 

        response.setContentType("text/html"); 
        PrintWriter out = response.getWriter(); 

        String userName = request.getParameter("userName"); 

        // Create cookie when user enters name
        if (userName != null && !userName.isEmpty()) { 
            Cookie userCookie = new Cookie("user", userName); 
            userCookie.setMaxAge(30); // expires in 30 seconds
            response.addCookie(userCookie); 
        } 

        Cookie[] cookies = request.getCookies(); 
        String existingUser = null; 

        if (cookies != null) { 
            for (Cookie cookie : cookies) { 
                if (cookie.getName().equals("user")) { 
                    existingUser = cookie.getValue(); 
                    break; 
                } 
            } 
        } 

        out.println("<html><body>"); 

        if (existingUser != null) { 
            count++; 
            out.println("<h2 style='color:blue;'>Welcome back, " + existingUser + "!</h2>"); 
            out.println("<h2 style='color:magenta;'>You have visited this page " + count + " times!</h2>"); 
        } else { 
            out.println("<h2 style='color:red;'>Welcome Guest! Please login</h2>"); 
            out.println("<form action='CookieServlet' method='get'>");   // ✅ FIXED
            out.println("Enter your name: <input type='text' name='userName'>"); 
            out.println("<input type='submit' value='Submit'>"); 
            out.println("</form>"); 
        } 

        out.println("</body></html>"); 
    } 

    // Optional logout (not required for this question but kept)
    public void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException { 

        Cookie cookie = new Cookie("user", ""); 
        cookie.setMaxAge(0); 
        response.addCookie(cookie); 

        response.sendRedirect("CookieServlet"); 
    } 
}