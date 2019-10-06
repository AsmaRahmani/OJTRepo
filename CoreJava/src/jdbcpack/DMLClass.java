package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class DMLClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OracleDriver od = new OracleDriver();
		try {
			DriverManager.registerDriver(od);
			System.out.println("Driver Loaded");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@dolnxprodvm184.hq.emirates.com:6516:prsmscod", 
					"TNG_USER01",
					"Training01");
			System.out.println("Connection is received to oracle server");
			
		    Statement stmt = con.createStatement();
		    System.out.println("Statement is ready to pass SQL statements to Oracle server");
		    
		    String str ="insert into internship_dept values (8,'Asma', 'Dubai')";
		    int result_row = stmt.executeUpdate(str);
			System.out.println(result_row);


		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}