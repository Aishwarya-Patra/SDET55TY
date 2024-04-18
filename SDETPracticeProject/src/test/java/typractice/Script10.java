package typractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script10 {
	public static void main(String[] args)  
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("//button[@id='btn30']"));
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
		WebElement ele1=driver.findElement(By.xpath("//div[text()='Yes']"));
		ele1.click();
		WebElement ele2=driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']"));
		boolean b=ele2.isDisplayed();
		System.out.println(b);
		String s=ele2.getText();	
		System.out.println(s);

}
}
