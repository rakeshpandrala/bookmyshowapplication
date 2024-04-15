package booking.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import booking.entity.loginpojo;
import booking.repo.logindao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/l")
public class loginservlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		try {
			ResultSet rs=logindao.search(name,password);
			if(rs.next())
			{	
		
				out.println("<html>"
						+ "<body>"
						+ "<h1 style=text-align:center>"+
						"<i style=background-color:green;color:white>"
						+ rs.getString(1)
						+ "</i>"
						+ "</h1>"
						+ "</body>"
						+ "</html>");
				out.println("<html>"
						+ "<body>"
						+ "<h1 style=text-align:center>"+
						"<i style=background-color:green;color:white>"
						+ rs.getString(2)
						+ "</i>"
						+ "</h1>"
						+ "</body>"
						+ "</html>");
				out.println("<html>"
						+ "<body>"
						+ "<h1 style=text-align:center>"+
						"<i style=background-color:green;color:white>"
						+ rs.getString(3)
						+ "</i>"
						+ "</h1>"
						+ "</body>"
						+ "</html>");
				out.println("<html>"
						+ "<body>"
						+ "<h1 style=text-align:center>"+
						"<i style=background-color:green;color:white>"
						+ rs.getString(4)
						+ "</i>"
						+ "</h1>"
						+ "</body>"
						+ "</html>");
				out.println("<html>"
						+ "<body>"
						+ "<h1 style=text-align:center>"+
						"<i style=background-color:green;color:white>"
						+ rs.getString(5)
						+ "</i>"
						+ "</h1>"
						+ "</body>"
						+ "</html>");
				out.println("<html>"
						+ "<body>"
						+ "<h1 style=text-align:center>"+
						"<i style=background-color:green;color:white>"
						+ rs.getString(6)
						+ "</i>"
						+ "</h1>"
						+ "</body>"
						+ "</html>");
			}
			else
			{
				out.println("jjjj");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
