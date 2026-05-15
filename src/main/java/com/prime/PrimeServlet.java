package com.prime;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/prime")
public class PrimeServlet extends HttpServlet {

    // ✅ Handles direct URL access (fix for 405 error)
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.sendRedirect("prime.html");
    }

    // ✅ Handles form submission
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int num = Integer.parseInt(request.getParameter("number"));

            // Validation
            if (num < 2) {
                throw new IllegalArgumentException("Number must be greater than 1");
            }

            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            out.println("<html><body>");

            if (isPrime) {
                out.println("<h2 style='color:green;'>" + num + " is a Prime Number</h2>");
            } else {
                out.println("<h2 style='color:red;'>" + num + " is NOT a Prime Number</h2>");
            }

            out.println("<br><a href='prime.html'>Try Again</a>");
            out.println("</body></html>");

        } catch (NumberFormatException e) {
            out.println("<html><body>");
            out.println("<h2 style='color:red;'>Error: Please enter a valid number</h2>");
            out.println("<a href='prime.html'>Try Again</a>");
            out.println("</body></html>");
        } catch (IllegalArgumentException e) {
            out.println("<html><body>");
            out.println("<h2 style='color:red;'>Error: " + e.getMessage() + "</h2>");
            out.println("<a href='prime.html'>Try Again</a>");
            out.println("</body></html>");
        }
    }
}