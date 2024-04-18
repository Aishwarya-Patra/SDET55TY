package typractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Script36 {
	public static void main(String[] args) throws InterruptedException  
	{
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	     String username="admin";
	     String password="admin";
	     String url="basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/";
	     driver.get("https://"+username+":"+password+"@"+url);
	}

}
