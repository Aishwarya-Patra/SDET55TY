package Calenderpopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Goibibotest 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String dateandmonth1="May 2024";
		int date1=28;
		String dateandmonth2="July 2024";
		int date2=10;
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']")).click();
		
		//WebElement dd1=driver.findElement(By.xpath("//span[text()='From']"));
		//Select s=new Select(dd1);
		//s.selectByVisibleText("Bengaluru");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		for(;;)
		{
			try {
		
		driver.findElement(By.xpath("//div[text()='"+dateandmonth1+"']/../..//p[text()='"+date1+"']")).click();
		break;
			}
			catch(Exception e)
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
			
			}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Return']")).click();
		for(;;)
		{
			
		try
		{
		driver.findElement(By.xpath("//div[text()='"+dateandmonth2+"']/../..//p[text()='"+date2+"']")).click();
		break;
		}
		
		catch(Exception e)
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
		
		
		
	}

}
}