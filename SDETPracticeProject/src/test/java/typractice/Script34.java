package typractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script34 {

	public static void main(String[] args) throws InterruptedException  
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/download?sublist=0");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("writeArea")).sendKeys("Aishwarya");
		WebElement ele=driver.findElement(By.id("downloadButton"));
		ele.click();
		
		
	}
}
