import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Passparameterthroughcmdtest 
{
	public static WebDriver driver;
	@Test
 public void passparameter()
 {
	 
	 String Browser = System.getProperty("browser");
	 String URL = System.getProperty("url");
	 String USERNAME=System.getProperty("username");
	 String PASSWORD=System.getProperty("password");
	 
	 System.out.println(Browser);
	 System.out.println(URL);
	 System.out.println(USERNAME);
	 System.out.println(PASSWORD);
	 if(Browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
			
		}
		else if(Browser.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		else if(Browser.equalsIgnoreCase("Edge"))
			{
			driver=new EdgeDriver();
			}
	 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		driver.manage().window().maximize();
		
 }

}
