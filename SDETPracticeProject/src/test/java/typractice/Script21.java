package typractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script21 {
	public static void main(String[] args)  
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		driver.manage().window().maximize();
		WebElement f1=driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(f1);
		WebElement ele=driver.findElement(By.xpath("//p[text()='Admin@gmail.com']"));
		String s1=ele.getText();
		WebElement ele1=driver.findElement(By.xpath("//p[text()='Admin@1234']"));
		String s2=ele1.getText();
		WebElement ele3=driver.findElement(By.xpath("(//p[text()='Admin@1234'])[2]"));
		String s3=ele3.getText();
		WebElement f2=driver.findElement(By.xpath("//div[@class='form_container']//iframe"));
		driver.switchTo().frame(f2);
		WebElement f3=driver.findElement(By.xpath("//div[@class='form-group']//iframe"));
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys(s1);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.findElement(By.id("password")).sendKeys(s2);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(2);
		driver.findElement(By.id("confirm")).sendKeys(s3);
		

}
}