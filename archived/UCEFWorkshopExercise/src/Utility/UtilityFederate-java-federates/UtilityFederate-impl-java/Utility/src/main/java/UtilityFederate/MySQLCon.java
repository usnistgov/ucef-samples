package UtilityFederate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MySQLCon {
	private final static Logger log = LogManager.getLogger(Utility.class);
	private Connection con = null;

	// performs a query and returns a resultset
	public ResultSet DoQuery(String qry){
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(qry);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	// performs a command such as an INSERT
	public boolean DoCmd(String cmd){
		Statement stmt=null;
		boolean rs=false;
		
		try {
			stmt = con.createStatement();
			rs = stmt.execute(cmd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

	public MySQLCon() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucef", "root", "c2wt");
			// here ucef is database name, root is username and c2wt is
			// password
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp");
			while (rs.next())
				log.info(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void finalize() throws SQLException {
		con.close();
	}

}
