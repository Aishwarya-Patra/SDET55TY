package typractice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Script1 {
	public static void main(String[] args)  
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	
		WebElement ele=driver.findElement(By.cssSelector("#name"));
		String txt=ele.getAttribute("placeholder");
		if(txt.equalsIgnoreCase("Enter your name"))
			System.out.println("placeholder is present");
		else
			System.out.println("placeholder is not present");
		System.out.println(txt);
		
	}

}
