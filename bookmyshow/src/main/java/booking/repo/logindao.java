package booking.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Result;

import booking.entity.loginpojo;

public class logindao
{
	public static ResultSet search(String name,String password) throws ClassNotFoundException, SQLException
	{
		Connection con=registrationdao.plate();
		PreparedStatement pst=con.prepareStatement("select * from booking where name=? and password=? ");
		pst.setString(1, name);
		pst.setString(2, password);
		return pst.executeQuery();
	}
}
