package typractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script8 {
	public static void main(String[] args)  
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		driver.manage().window().maximize();
		WebElement dd1=driver.findElement(By.xpath("//select[@id='select3']"));
		Select sel=new Select(dd1);
		sel.selectByVisibleText("India");

		WebElement dd2=driver.findElement(By.xpath("//select[@id='select5']"));
		Select s=new Select(dd2);
		s.selectByValue("Odisha");
		WebElement dd3=driver.findElement(By.xpath("//label[text()='City']/following-sibling::select"));
		Select s1=new Select(dd3);
		s1.selectByIndex(3);
		

}}
