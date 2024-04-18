import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.jdbc.Driver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Createprojecttest {
	public static WebDriver driver;
		
	
	public static void main(String[] args) throws IOException, SQLException, InterruptedException
	{
		Random ran=new Random();
		int random=ran.nextInt(500);
		String exp_data="Roter_01"+random;
		
			FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Commondata1.properties");
			Properties pobj=new Properties();
			pobj.load(fis);
			
			String browser=pobj.getProperty("browser");
			String url1=pobj.getProperty("url_1");
			String url2=pobj.getProperty("url_2");
			String Username=pobj.getProperty("username");
			String password=pobj.getProperty("password");
			
			System.out.println(browser);
			System.out.println(url1);
			System.out.println(url2);
			System.out.println(Username);
			System.out.println(password);
		
			if(browser.equalsIgnoreCase("Chrome"))
			{
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
			}
			
			driver.manage().window().maximize();
			driver.get(url1);
			driver.get(url2);
			driver.findElement(By.id("usernmae")).sendKeys(Username);
			driver.findElement(By.id("inputPassword")).sendKeys(password);
			driver.findElement(By.xpath("//button[text()='Sign in']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Projects']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[text()='Create Project']")).click();
			driver.findElement(By.name("projectName")).sendKeys(exp_data);
			driver.findElement(By.name("createdBy")).sendKeys("Bhargavi");
			driver.findElement(By.xpath("//option[text()='Select Value']/following-sibling::option[.='On Gogin']")).click();
			driver.findElement(By.xpath("//input[@value='Add Project']")).click();
			Driver d = new Driver();
			DriverManager.registerDriver(d);
	        Connection con=DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects","root@%","root");
	        Statement state = con.createStatement();
	        String query="select * from project where(project_name)='"+exp_data+"';";
	        ResultSet result = state.executeQuery(query);
	        System.out.println(result.getMetaData());
	        while(result.next())
	        {
	        	String actualResult=result.getString(4);
	        	if(actualResult.equalsIgnoreCase(exp_data))
	        	{
	        		System.out.println("Data is present");
	        	}
	        	else
	        	{
	        		System.out.println("Data is not present");
	        	}
	        }
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
			
	}

}
