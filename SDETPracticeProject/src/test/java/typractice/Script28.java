package typractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Script28 {
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(3000);
		WebElement link=driver.findElement(By.xpath("//span[@class='railDrishti fa fa-bus']"));
		link.click();

}}
