package XpathPractice;


import org.openqa.selenium.WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartTest 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("tv & appliances",Keys.ENTER);
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//span[contains(.,'TVs & Appliances')]"));
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Samsung']")).click();
	}
	}


