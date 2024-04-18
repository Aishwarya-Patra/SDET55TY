package typractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script37 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/modal?sublist=0");
		Thread.sleep(3000);
		driver.findElement(By.id("modal1")).click();
		driver.manage().window().maximize();
		driver.findElement(By.id("closeModal")).click();
		
		// TODO Auto-generated method stub

	}

}
