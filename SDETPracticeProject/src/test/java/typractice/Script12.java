package typractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script12 {
	public static void main(String[] args)  
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
		driver.manage().window().maximize();
		WebElement src1=driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement src2=driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement dst1=driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(src1, dst1).perform();
		act.dragAndDrop(src2, dst1).perform();
		WebElement src3=driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
	    WebElement src4=driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		

}}

