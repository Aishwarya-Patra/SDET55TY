package typractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Script27 {
	public static void main(String[] args) throws InterruptedException {
		
	
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/browserNot");
	Thread.sleep(5000);
	driver.findElement(By.id("browNotButton")).click();
	
	

}
}
