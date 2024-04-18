package typractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script3 {
	public static void main(String[] args)  
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		WebElement dd=driver.findElement(By.xpath("//select[@id='select3']"));
		Select sel=new Select(dd);
		sel.selectByVisibleText("India");

}}
