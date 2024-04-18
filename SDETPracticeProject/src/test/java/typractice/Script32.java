package typractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script32 {
	public static void main(String[] args) throws InterruptedException  
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.id("fileInput"));
		ele.sendKeys("C:\\Users\\Hp\\Desktop\\practicefolder\\file1.txt");
		WebElement ele1=driver.findElement(By.xpath("//p[text()='file1.txt']"));
		String s=ele1.getText();
		System.out.println(s);
	}

}
