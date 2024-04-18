package typractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script25 {
	public static void main(String[] args) throws InterruptedException  
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");
		Thread.sleep(2000);
		driver.findElement(By.id("buttonAlert5")).click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}

}
