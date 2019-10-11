package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

	public static void main(String[] args) throws SQLException {
		
		//create connection
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","hr","hr");
	    
		//create a query/statement
		Statement st = con.createStatement();
		String s= "insert into student values(105, 'JOHN')";
		
		//execute query
		st.executeQuery(s);
		
		//close connection
		con.close();
		
	}

}
