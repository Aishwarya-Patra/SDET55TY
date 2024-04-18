package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(By.id("name"));
		Thread.sleep(2000);
		ele1.sendKeys("Shanti");
		WebElement ele2=driver.findElement(By.id("email"));
		Thread.sleep(3000);
		ele2.sendKeys("Shanti@gmail.com");
		Thread.sleep(3000);
		WebElement ele3=driver.findElement(By.id("password"));
		ele3.sendKeys("123ABC!@#");
		WebElement ele4=driver.findElement(By.xpath("//button[text()='Register']"));
		ele4.click();
		
	}

}
