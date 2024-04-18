package typractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script17 {
	public static void main(String[] args)  
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(ele);
        WebElement ele1=driver.findElement(By.id("username"));
        ele1.sendKeys("Aishwarya");
	}}
