package typractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script26 {
	public static void main(String[] args) throws InterruptedException  
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("buttonAlert1")).click();
		Alert alt=driver.switchTo().alert();
		alt.sendKeys("yes");
		alt.accept();
		WebElement ele=driver.findElement(By.xpath("//p[@class='pt-2 text-center']"));
		String s=ele.getText();
		
		if(s.contains("yes"))
			System.out.println("You selected yes");
		else
			System.out.println("you selected no");
		
			
		
	}

}
