package com.simplilearn.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Resource(name="jdbc_database")
	private DataSource dataSource;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set the content type of the response
        response.setContentType("text/html");
        
        // Get a PrintWriter to write the response
        PrintWriter out = response.getWriter();

        // Generate an HTML response
        out.println("<html>");
        out.println("<head><title>Test Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Welcome to the Learners Academy Test Servlet</h1>");
        out.println("<p>This is a test servlet for demonstration purposes.</p>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Handle POST requests if needed
    }
}