package typractice;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Script35 {

	public static void main(String[] args) throws InterruptedException  
	{
		ChromeOptions options=new ChromeOptions();
		HashMap<String,Object> ChromePrefs=new HashMap<String,Object> ();
		ChromePrefs.put("download.default_directory", "C:\\Users\\Hp\\Desktop\\practicefolder");
		options.setExperimentalOption("prefs", ChromePrefs);
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/download?sublist=0");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("writeArea")).sendKeys("Aishwarya");
		WebElement ele=driver.findElement(By.id("downloadButton"));
		ele.click();
		
		
		
	}

}
