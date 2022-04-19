package in.co.rays.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.co.rays.bean.MarksheetBean;
import in.co.rays.bean.UserBean;

public class UserModel {

	public int nextPk() throws Exception {

		int pk = 0;
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		PreparedStatement ps = conn.prepareStatement("select max(id) from user");

		conn.setAutoCommit(false);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			pk = rs.getInt(1);

		}
		return pk + 1;

	}

	public void add(UserBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		PreparedStatement ps = conn.prepareStatement("insert into user values (?, ?, ?, ?, ?, ?, ?)");

		conn.setAutoCommit(false);

		ps.setInt(1, nextPk());
		ps.setString(2, bean.getName());
		ps.setString(3, bean.getLogin());
		ps.setString(4, bean.getPassword());
		ps.setString(5, bean.getConfirmPassword());
		ps.setDate(6, new java.sql.Date(bean.getDob().getTime()));
		ps.setString(7, bean.getMobileNo());

		int r = ps.executeUpdate();

		System.out.println(r + " " + "inserted");

		conn.commit();
		ps.close();
		conn.close();
	}

	public UserBean authenticate(UserBean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		PreparedStatement ps = conn.prepareStatement("select * from user where login = ? and password = ?");

		ps.setString(1, bean.getLogin());
		ps.setString(2, bean.getPassword());

		ResultSet rs = ps.executeQuery();

		UserBean bean1 = null;

		while (rs.next()) {
			bean1 = new UserBean();

			bean1.setId(rs.getInt(1));
			bean1.setName(rs.getString(2));
			bean1.setLogin(rs.getString(3));
			bean1.setPassword(rs.getString(4));
			bean1.setConfirmPassword(rs.getString(5));
			bean1.setDob(rs.getDate(6));
			bean1.setMobileNo(rs.getString(7));

		}
		return bean1;

	}

	public UserBean forgetPassword(UserBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		PreparedStatement ps = conn.prepareStatement("select * from user where login = ?");

		ps.setString(1, bean.getLogin());

		ResultSet rs = ps.executeQuery();

		UserBean bean1 = null;
		while (rs.next()) {
			bean1 = new UserBean();

			bean1.setId(rs.getInt(1));
			bean1.setName(rs.getString(2));
			bean1.setLogin(rs.getString(3));
			bean1.setPassword(rs.getString(4));
			bean1.setConfirmPassword(rs.getString(5));
			bean1.setDob(rs.getDate(6));
			bean1.setMobileNo(rs.getString(7));

		}
		return bean1;
	}

	public UserBean findByLogin(UserBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		PreparedStatement ps = conn.prepareStatement("select * from user where login = ?");

		ps.setString(1, bean.getLogin());

		ResultSet rs = ps.executeQuery();

		UserBean bean1 = null;
		while (rs.next()) {
			bean1 = new UserBean();

			bean1.setId(rs.getInt(1));
			bean1.setName(rs.getString(2));
			bean1.setLogin(rs.getString(3));
			bean1.setPassword(rs.getString(4));
			bean1.setConfirmPassword(rs.getString(5));
			bean1.setDob(rs.getDate(6));
			bean1.setMobileNo(rs.getString(7));

		}
		return bean1;
	}

	public List<MarksheetBean> Search() throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		PreparedStatement ps = conn.prepareStatement("select * from marksheet");

		ResultSet rs = ps.executeQuery();

		ArrayList<MarksheetBean> list = new ArrayList<MarksheetBean>();

		MarksheetBean bean1 = null;
		while (rs.next()) {
			bean1 = new MarksheetBean();
			bean1.setId(rs.getInt(1));
			bean1.setName(rs.getString(2));
			bean1.setRollNo(rs.getInt(3));
			bean1.setPhy(rs.getInt(4));
			bean1.setChem(rs.getInt(5));
			bean1.setMaths(rs.getInt(6));
			list.add(bean1);

		}
		return list;
	}
	public List<MarksheetBean> getMarksheetByRollNo() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		PreparedStatement ps = conn.prepareStatement("select * from marksheet where login = ?");

		//ps.setString(1, bean.get());
		
	//	ps.setString(1, bean.getLogin());

		ResultSet rs = ps.executeQuery();
		
		ArrayList<MarksheetBean> list1 = new ArrayList<MarksheetBean>();


		MarksheetBean bean1 = null;
		while (rs.next()) {
			bean1 = new MarksheetBean();

			/*
			 * bean1.setId(rs.getInt(1)); bean1.setName(rs.getString(2));
			 * bean1.setLogin(rs.getString(3)); bean1.setPassword(rs.getString(4));
			 * bean1.setConfirmPassword(rs.getString(5)); bean1.setDob(rs.getDate(6));
			 * bean1.setMobileNo(rs.getString(7));
			 */
			
			bean1.setId(rs.getInt(1));
			bean1.setName(rs.getString(2));
			bean1.setRollNo(rs.getInt(3));
			bean1.setPhy(rs.getInt(4));
			bean1.setChem(rs.getInt(5));
			bean1.setMaths(rs.getInt(6));
			list1.add(bean1);

		}
		return list1;
	}


}
