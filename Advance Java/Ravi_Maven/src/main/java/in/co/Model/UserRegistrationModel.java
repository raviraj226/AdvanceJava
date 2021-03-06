package in.co.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import in.co.Bean.UserRregistrationBean;

public class UserRegistrationModel {

	public void add(UserRregistrationBean bean) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.RB.app");

		Class.forName(rb.getString("driver"));

		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("username"),
				rb.getString("password"));

		conn.setAutoCommit(false);

		PreparedStatement ps = conn.prepareStatement("INSERT INTO USERREGISTRATION VALUES(?,?,?,?,?,?,?)");

		ps.setString(1, bean.getFname());
		ps.setString(2, bean.getLname());
		ps.setString(3, bean.getGender());
		ps.setString(4, bean.getEmail());
		ps.setString(5, bean.getContact());
		ps.setString(6, bean.getAdd());
		ps.setString(7, bean.getDob());

		int i = ps.executeUpdate();

		System.out.println(i + "added");

		conn.commit();

		ps.close();
		conn.close();
	}
	
	

}
