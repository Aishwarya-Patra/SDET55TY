package XpathPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeTest 
{
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com");
	
	

}
}
