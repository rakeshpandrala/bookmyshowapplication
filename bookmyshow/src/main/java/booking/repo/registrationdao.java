package booking.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import booking.entity.registration;

public class registrationdao 
{
	public static Connection plate() throws ClassNotFoundException, SQLException
	{
		String url="jdbc:mysql://localhost:3306/ch15";
		String u="root";
		String p="rakesh";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,u,p);
		return con;
	}
	public static int insert(registration r) throws ClassNotFoundException, SQLException
	{
		Connection con=plate();
		PreparedStatement pst=con.prepareStatement("insert into booking values(?,?,?,?,?,?)");
		pst.setString(1, r.getName());
		pst.setString(2, r.getAge());
		pst.setString(3, r.getMoviename());
		pst.setString(4, r.getPrice());
		pst.setString(5, r.getPassword());
		pst.setString(6, r.getSeatnumber());
		return pst.executeUpdate();
	}
	
}

