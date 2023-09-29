package com.simplilearn.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class AdminControllerServlet
 */
@WebServlet("/AdminControllerServlet")
public class AdminControllerServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Resource(name = "jdbc_database")
	private DataSource datasource;

	private ServletRequest req;

	private String email;

	private String password;

	private PrintWriter ps;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Check if the user is authenticated as an admin, e.g., by session or token
        boolean isAdmin = checkAdminAuthentication(request);

        if (isAdmin) {
            // Handle admin-specific tasks based on request parameters or paths
            String action = request.getParameter("action");

            if ("manageClasses".equals(action)) {
                // Redirect to a class management page or perform related tasks
                response.sendRedirect("class.jsp");
            } else if ("manageTeachers".equals(action)) {
                // Redirect to a teacher management page or perform related tasks
                response.sendRedirect("teacher.jsp");
            } else if ("manageStudents".equals(action)) {
                // Redirect to a student management page or perform related tasks
                response.sendRedirect("student.jsp");
            } else if ("manageSubjects".equals(action)) {
                // Redirect to a subject management page or perform related tasks
                response.sendRedirect("subject.jsp");
            
        } else {
            
            response.sendRedirect("login.jsp");
        }
      }
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	email = req.getParameter("email");
    	password = req.getParameter("password");
    	System.out.println(email + " " + password);
    	ps = ((ServletResponse) req).getWriter();
    	ps.print("email=" + email);
    	ps.print("password=" + password);
    	
        
    }

    private boolean checkAdminAuthentication(HttpServletRequest request) {
        
        return true;
    }

	public ServletRequest getReq() {
		return req;
	}

	public void setReq(ServletRequest req) {
		this.req = req;
	}
}