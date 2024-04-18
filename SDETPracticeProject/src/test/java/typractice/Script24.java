package typractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script24 {
	public static void main(String[] args) throws InterruptedException  
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		driver.manage().window().maximize();
		driver.findElement(By.id("buttonAlert2")).click();
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		String s=alt.getText();
        alt.accept();

        System.out.println(s);
}
}
