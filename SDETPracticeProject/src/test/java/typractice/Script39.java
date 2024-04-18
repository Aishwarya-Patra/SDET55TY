package typractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Script39 {
public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--use-fake-ui-for-media-stream");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://mictests.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("mic-launcher")).click();
}

}
