package typractice;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script7 {
	private static final String[] List = null;

	public static void main(String[] args)  
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		driver.manage().window().maximize();
		WebElement country=driver.findElement(By.xpath("//select[@id='select3']"));
		Select sel=new Select(country);
		List<WebElement> options =sel.getOptions();
		for(WebElement ele:options)
		{
			if(ele.getText().equals("India"))
			{
				System.out.println("india is present in dropdown");
			}
		}
		
		

}}
