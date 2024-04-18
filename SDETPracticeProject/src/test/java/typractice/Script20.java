package typractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script20 {
	public static void main(String[] args)  
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		driver.manage().window().maximize();
	    WebElement frame1=driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
	    driver.switchTo().frame(0);
	    driver.findElement(By.id("email")).sendKeys("ABC@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("ABC!@#");
	    driver.findElement(By.id("confirm-password")).sendKeys("ABC!@#");
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(1);
	    driver.findElement(By.id("username")).sendKeys("YGJGJHKJHI");
	    driver.findElement(By.id("password")).sendKeys("67(%^%&");
	    
	    

}
}
