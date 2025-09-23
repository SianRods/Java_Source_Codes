package com.rods;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


public class HelloServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("Hello this is Service ");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("This is response");
        out.println("<h1>This is HTML response</h1>");

    }
}
