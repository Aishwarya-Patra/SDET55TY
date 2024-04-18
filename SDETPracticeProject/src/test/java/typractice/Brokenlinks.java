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

public class Brokenlinks {
	public static void main(String[] args)throws IOException
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.karnataka.gov.in/english");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
	    List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
	    System.out.println(allLinks.size());
	    for(WebElement eachlink:allLinks)
	    {
	    	String link=eachlink.getAttribute("href");
	    	try
	    	{
	    		URL url= new URL(link);
	    		HttpURLConnection con=(HttpURLConnection)url.openConnection();
	    		int sts=con.getResponseCode();
	    		if(sts>=400)
	    		{
	    			System.out.println(link +" "+ sts );
	    		}
	    		
	    	}
	    	catch(Exception e)
	    	{
	    		
	    	}
	    
	    	
	    
	    	
	    }
	}
	}

	    	
	    
	    	
	    	
	    
	    
		
		
		
	


