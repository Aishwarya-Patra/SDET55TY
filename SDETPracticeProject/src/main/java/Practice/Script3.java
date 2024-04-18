package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		Thread.sleep(2000);
		WebElement btn=driver.findElement(By.xpath("//input[@id='fileInput']"));
		btn.sendKeys("");
		// TODO Auto-generated method stub

	}

}
