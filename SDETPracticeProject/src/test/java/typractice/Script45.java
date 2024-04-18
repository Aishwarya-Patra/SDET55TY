package typractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script45 {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]","https://www.amazon.in/");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.linkText("Australia"));
		js.executeScript("arguments[0].scrollIntoView()", ele);
		Thread.sleep(3000);
		WebElement ele1=driver.findElement(By.id("twotabsearchtextbox"));
		js.executeScript("arguments[0].value=arguments[1]",ele1,"iphone");
		WebElement ele2=driver.findElement(By.xpath("//a[text()='Sell']"));
		js.executeScript("arguments[0].click()", ele2);
		WebElement ele3=driver.findElement(By.xpath("//span[contains(.,'Back to top')]"));
		Point loc=ele3.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		js.executeScript("window.scrollBy("+x+","+y+")", args);
		
		
		
	}

}
