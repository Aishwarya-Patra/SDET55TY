package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script7 {

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui/video?sublist=0&scenario=1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement btn=driver.findElement(By.xpath("//video[@src='/assets/videofile-PWMPKjmv.mp4']"));
		btn.click();
	}

}
