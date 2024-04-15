package booking.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import booking.entity.registration;
import booking.repo.registrationdao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/rst")
public class registrationservlet extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
			PrintWriter out=resp.getWriter();
			String name=req.getParameter("name");
			String age=req.getParameter("age");
			String moviename=req.getParameter("moviename");
			String price=req.getParameter("price");
			String password=req.getParameter("password");
			String seatnumber=req.getParameter("seatnumber");
			registration r=new registration(name,age,moviename,price,password,seatnumber);
			try {
			int row=registrationdao.insert(r);
				if(row>0)
				{
					out.println("<html>"
							+ "<body>"
							+ "<h1 style=text-align:center>"+
							"<i style=background-color:green;color:white>"
							+ "Booking Successfull"
							+ "</i>"
							+ "</h1>"
							+ "</body>"
							+ "</html>");
				}
				else
				{
					out.println("<html>"
							+ "<body>"
							+ "<h1>"
							+ "please try again"
							+ "</h1>"
							+ "</body>"
							+ "</html>");
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}
