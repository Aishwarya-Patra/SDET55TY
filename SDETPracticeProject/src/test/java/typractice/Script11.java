package typractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script11 {
	public static void main(String[] args)  
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("//button[@id='btn20']"));
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();
		

}}
