package Calenderpopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Redbus {
	public static void main(String[] args) throws InterruptedException 
	{

		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//span[@class='ng-tns-c58-10 ui-calendar']")).click();
	
	
	

}
}
