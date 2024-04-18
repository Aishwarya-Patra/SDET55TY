package typractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks1 
{
	public static void main(String[] args)throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://upsc.gov.in");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		System.out.println(alllinks.size());
		for(WebElement eachlink:alllinks)
		{
			String link=eachlink.getAttribute("href");
			URL url=null;
			try 
			{
				url=new URL(link);
				HttpURLConnection httpconn=(HttpURLConnection)url.openConnection();
				int statuscode=httpconn.getResponseCode();
				
	            if(statuscode>=400)
				{
					System.out.println(link+"---->"+"link is broken");
				}
				
			}
			catch(Exception e)
			{
		}
		
		
	}

}
}
