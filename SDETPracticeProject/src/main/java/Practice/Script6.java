package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui/link?sublist=0");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		int count=links.size();
		System.out.println(count);

	}

}
