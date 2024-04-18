package XpathPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectorhub {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/xpath-practice-page");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement sele=driver.findElement(By.xpath("//div[@id='userName']"));
		SearchContext shadow = sele.getShadowRoot();
		WebElement sele2=shadow.findElement(By.cssSelector(""));
		
		
		driver.close();
	}

}
