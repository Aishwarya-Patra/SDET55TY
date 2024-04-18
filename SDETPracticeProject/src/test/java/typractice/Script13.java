package typractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script13 {
	public static void main(String[] args)  
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui/mouseHover?sublist=0");
		driver.manage().window().maximize();
		
		WebElement ele= driver.findElement(By.xpath("//div[@class='flex']/img[2]"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		List<WebElement> elements=driver.findElements(By.xpath("//ul[@class='p-4']/li"));
		for(WebElement t:elements)
		{
			System.out.println(t.getText());
		}
	

}}
