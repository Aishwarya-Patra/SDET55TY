package typractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script29 {
	public static void main(String[] args) throws InterruptedException  
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("browserLink1")).click();
		Set<String> widd=driver.getWindowHandles();
		System.out.println(widd);
		for(String str:widd)
		{
			driver.switchTo().window(str);
			String title=driver.getCurrentUrl();
			if(title.contains("SignUpPage"))
			{   
				break;
				
			}
			Thread.sleep(5000);
			
				
			
		}
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		
	}
	

}
