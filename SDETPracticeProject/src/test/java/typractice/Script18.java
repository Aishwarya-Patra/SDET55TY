package typractice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Script18 
{
      public static void main(String[] args)  
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
			driver.manage().window().maximize();
			WebElement mainframe=driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
			driver.switchTo().frame(mainframe);
			WebElement childframe=driver.findElement(By.xpath("//div[@class='form_container']//iframe"));
			driver.switchTo().frame(childframe);
			
			driver.findElement(By.id("email")).sendKeys("ABC@gmail.com");
		


}}
