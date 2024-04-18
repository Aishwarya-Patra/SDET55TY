package typractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script46 {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("email")).sendKeys("Hello@gmail.com",Keys.CONTROL,"AC");
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys(Keys.CONTROL,"V");
		WebElement cpass=driver.findElement(By.id("confirmPassword"));
		cpass.sendKeys(Keys.CONTROL,"V");
	    WebElement btn=driver.findElement(By.xpath("//button[@type='submit']"));
	    btn.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
	}

}
