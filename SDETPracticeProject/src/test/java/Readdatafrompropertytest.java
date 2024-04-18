import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Readdatafrompropertytest {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Commondata.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		
		String browser=pobj.getProperty("Browser");
		String url=pobj.getProperty("url");
		String Username=pobj.getProperty("username");
		String password=pobj.getProperty("password");
		
		System.out.println(browser);
		System.out.println(url);
		System.out.println(Username);
		System.out.println(password);
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		else if(browser.equalsIgnoreCase("Edge"))
			{
			driver=new EdgeDriver();
			}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys(Username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		driver.manage().window().maximize();
		
		
	}

}
