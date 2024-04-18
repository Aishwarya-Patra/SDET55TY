package typractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script44 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.bus.irctc.co.in/home");
		driver.findElement(By.id("departFrom")).sendKeys("Mumbai");
		
	}

}
