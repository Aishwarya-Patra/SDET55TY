package typractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {
	public static void main(String[] args)  
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
        List<WebElement> links=driver.findElements(By.xpath("//a"));
        int count =links.size();
        System.out.println(count);
        for(int i=0;i<(count-1);i++)
        {
        	WebElement ele=links.get(i);
        	String txt=ele.getText();
        	System.out.println(txt);
        	
        }
}
}
