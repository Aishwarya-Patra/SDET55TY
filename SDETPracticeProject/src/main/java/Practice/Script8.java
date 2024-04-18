package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(4000);
		WebElement e1=driver.findElement(By.xpath("//button[@id='buttonAlert2']"));
		e1.click();
		Thread.sleep(2000);
		Alert target=driver.switchTo().alert();
		target.accept();
		// TODO Auto-generated method stub

	}

}
