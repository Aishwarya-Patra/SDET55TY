package typractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script19 {
	public static void main(String[] args)  
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		driver.manage().window().maximize();
		WebElement frame1=driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(frame1);
		WebElement ele=driver.findElement(By.xpath("//p[text()='Admin@gmail.com']"));
		String email=ele.getText();
		WebElement childframe=driver.findElement(By.xpath("//div[@class='form_container']//iframe"));
		driver.switchTo().frame(childframe);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.switchTo().parentFrame();
		WebElement ele2=driver.findElement(By.xpath("//p[text()='Admin@1234']"));
		String pass=ele2.getText();
		driver.switchTo().frame(childframe);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.switchTo().parentFrame();
		WebElement ele3=driver.findElement(By.xpath("(//p[text()='Admin@1234'])[2]"));
		String cnfrmpass=ele3.getText();
		driver.switchTo().frame(childframe);
		driver.findElement(By.id("confirm-password")).sendKeys(cnfrmpass);
		
		

}
}
