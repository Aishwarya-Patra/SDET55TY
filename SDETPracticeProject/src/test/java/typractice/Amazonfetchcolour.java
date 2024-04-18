package typractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonfetchcolour 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement ele1=driver.findElement(By.xpath("//img[@alt='Apple iPhone 14 (128 GB) - Blue' and @class='_bXVsd_image_1pfbQ']"));
	    ele1.click();
	   // List<WebElement> eles=driver.findElements(By.)
	
}

}
