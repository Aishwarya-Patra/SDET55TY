package typractice;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script16 {
	public static void main(String[] args)  
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.in");
		WebElement ele=driver.findElement(By.xpath("//span[text()='Prime']"));
		Point location=ele.getLocation();
		int x=location.getX();
		int y=location.getY();	
		System.out.println(x);
		System.out.println(y);
	
		Actions act=new Actions(driver);
		act.scrollByAmount(x,y).perform();
		
}
}
	
