package typractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File per=new File("C:\\Users\\Hp\\Desktop\\practicefolder\\screen.jpeg");
		FileHandler.copy(temp, per);
	}

}
