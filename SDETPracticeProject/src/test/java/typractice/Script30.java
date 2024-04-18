package typractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericUtils.WebdriverUtilities;

public class Script30 {
	public static void main(String[] args) throws InterruptedException  
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
		Thread.sleep(3000);
		WebdriverUtilities wd=new WebdriverUtilities();
		driver.findElement(By.id("browserButton3")).click();
		wd.switchWindow(driver, "SignUp");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("Admin@gmail.com");

}
}
