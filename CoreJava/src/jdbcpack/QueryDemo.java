package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class QueryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OracleDriver od = new OracleDriver();
		Connection con = null;
		 Statement stmt = null;
		 ResultSet rs= null;
		try {
			DriverManager.registerDriver(od);
			System.out.println("Driver Loaded");
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@dolnxprodvm184.hq.emirates.com:6516:prsmscod", 
					"TNG_USER01",
					"Training01");
			System.out.println("Connection is received to oracle server");
			
		    stmt = con.createStatement();
		    System.out.println("Statement is ready to pass SQL statements to Oracle server");
		    
		    
      	    String str = "select * from internship_dept";
		     rs = stmt.executeQuery(str);
		     while (rs.next()){
		    	 System.out.println(rs.getString(1)+"  "+ rs.getString(2)+ "  "+ rs.getString(3));
		     }

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
