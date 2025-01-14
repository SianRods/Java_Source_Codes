package com.rods;

import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) {
        try {
            int i = Integer.parseInt(request.getParameter("number1"));
            int j = Integer.parseInt(request.getParameter("number2"));

            int k = i + j;

            // Write the output to the response
            PrintWriter out = response.getWriter();
            out.println("Hello, the answer for the addition of two numbers is: " + k);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
