import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Updatequerytest 
{
	public static void main(String[] args) throws SQLException 
	{
	//step 1:register the driver
	Driver driver=new Driver();
	DriverManager.registerDriver(driver);
	
	//step 2:get connection to the database
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet55 ", "root","root");
	
	//step 3:create statement
	Statement state = con.createStatement();
	String query="insert into rmg values('Preet','API',10),('Suraj','API',15);";
	
	//step 4: Execute Query
	state.executeUpdate(query);
	state.executeUpdate("delete from rmg where Name='Preet';");
	state.executeUpdate("update rmg set subject='Java' where name='suraj';");
     String query1="select * from rmg";
     ResultSet result = state.executeQuery(query1);
     while(result.next())
 	{
 		System.out.println(result.getString(1)+"  "+result.getString(2)+"  "+result.getString(3));
 	}
	
	//close database
   con.close();

}
}
