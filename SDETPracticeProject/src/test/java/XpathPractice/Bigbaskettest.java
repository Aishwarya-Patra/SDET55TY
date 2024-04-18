package XpathPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bigbaskettest {
	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bigbasket.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement ele=driver.findElement(By.xpath("//div[@class='Header___StyledQuickSearch2-sc-19kl9m3-0 gzbZOD']/descendant::div//input"));
	ele.sendKeys("apple",Keys.ENTER);
	WebElement ele1=driver.findElement(By.xpath("//button[text()='Add']/ancestor::div[@class='SKUDeck___StyledDiv-sc-1e5d9gk-0 eA-dmzP']//div/h3[text()='Apple - Royal Gala Economy']"));
	//WebElement ele2=driver.findElement
    //(By.xpath("//span[text()=' - Royal Gala Economy']/ancestor::div[@class='flex-1 flex items-center mr-2.5 overflow-hidden']/following-sibling::button[text()='Add']"));
	//ele2.click();
	

}
}