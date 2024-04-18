package typractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script49 {
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele=driver.findElement(By.id("email"));
		ele.click();
		String txt="admin@gmail.com";
		Robot r=new Robot();
		for(char c:txt.toCharArray())
		{
			int finaltext=KeyEvent.getExtendedKeyCodeForChar(c);
			r.keyPress(finaltext);
			r.keyRelease(finaltext);
			
		}
		
	}

}
