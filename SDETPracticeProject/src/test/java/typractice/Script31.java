package typractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericUtils.WebdriverUtilities;

public class Script31 {
	public static void main(String[] args) throws InterruptedException  
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		Thread.sleep(3000);
		WebdriverUtilities wd=new WebdriverUtilities();
		driver.findElement(By.id("browserButton2")).click();
		wd.switchWindow(driver, "SignUp");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("Admin@gmail.com");
		wd.switchWindow(driver, "SignUpPage");
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");

}
}
