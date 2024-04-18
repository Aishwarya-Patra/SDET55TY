package XpathPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabTest {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com");
	}

}
