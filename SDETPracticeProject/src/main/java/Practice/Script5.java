package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script5 {

	private static final String ABC = null;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0");
		driver.manage().window().maximize();
		WebElement txt1=driver.findElement(By.id("email"));
		//txt1

	}

}
