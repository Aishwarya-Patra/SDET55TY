package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script10 {

	public static void main(String[] args) throws InterruptedException
	{WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://demoapps.qspiders.com/ui/datePick?sublist=0");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	WebElement ele1=driver.findElement(By.xpath("//input[@placeholder='Select A Date']"));
	ele1.click();
	WebElement ele2=driver.findElement(By.xpath("//div[text()='9']"));
	ele2.click();
		// TODO Auto-generated method stub

	}

}
