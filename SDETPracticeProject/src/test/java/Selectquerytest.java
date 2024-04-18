import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Selectquerytest {
public static void main(String[] args) throws SQLException 
	{
	//step 1:register the driver
	Driver driver=new Driver();
	DriverManager.registerDriver(driver);
	
	//step 2:get connection to the database
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet55 ", "root","root");
	
	//step 3:create statement
	Statement state = con.createStatement();
	String query=" select * from rmg;";
	
	//step 4:Execute query
	ResultSet result = state.executeQuery(query);
	while(result.next())
	{
		System.out.println(result.getString(1)+""+result.getString(2)+""+result.getString(3));
	}
	
	//step 5 :close the database
	con.close();

	}

}
