package typractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script42 {
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com");
		
		
	}


}
