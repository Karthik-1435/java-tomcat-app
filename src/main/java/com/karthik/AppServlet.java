package com.karthik;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class AppServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        response.getWriter().println(
            "<html>" +
            "<head><title>Karthik Java Application</title></head>" +
            "<body>" +
            "<h1>Hello Karthik!</h1>" +
            "<p>Java application is running on Tomcat.</p>" +
            "</body>" +
            "</html>"
        );
    }
}