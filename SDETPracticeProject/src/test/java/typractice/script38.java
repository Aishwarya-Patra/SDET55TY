package typractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script38 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/modal/multiModal?sublist=1");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='multiModalButton']")).click();
		driver.findElement(By.xpath("//button[@id='multiClosemodal']")).click();
		WebElement ele=driver.findElement(By.xpath("//p[text()='This is the secondary modal']"));
		String s=ele.getText();
		System.out.println(s);
		
		driver.findElement(By.xpath
				("//p[text()='This is the secondary modal']/../following-sibling::section/button")).click();
		
		
		
		
		
		
		
		
	}

}
