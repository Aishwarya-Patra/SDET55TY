package typractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script33 {
	public static void main(String[] args) throws InterruptedException  
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/fileUpload/multiple?sublist=3");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.id("fileInput"));
		//ele.sendKeys("C:\\Users\\Hp\\Desktop\\practicefolder\\file1.txt");
		ele.sendKeys(System.getProperty("user.dir")+"/src/test/resources/file1.txt");
		ele.sendKeys("C:\\Users\\Hp\\Desktop\\practicefolder\\word1.docx");
		List<WebElement> wb = driver.findElements(By.xpath("//li[@class='flex']"));
		for(WebElement w:wb)
		{
			System.out.println(w.getText());
		}
	}

}
