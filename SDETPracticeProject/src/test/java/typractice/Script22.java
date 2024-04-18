package typractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script22 {
	public static void main(String[] args)  
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Single Iframe ']")).click();
		WebElement f1=driver.findElement(By.xpath("//div[@id='Single']//iframe"));
		driver.switchTo().frame(f1);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("QWERTY");

}
}