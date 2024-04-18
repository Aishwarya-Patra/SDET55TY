package XpathPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Srilankatest {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/rankings/team-rankings/mens/test");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String country="Srilanka";
		boolean flag=false;
		List<WebElement> allteams = driver.findElements(By.xpath("//h3[@class='si-team-name']"));
		for(WebElement ele:allteams)
		{
			if(country.equalsIgnoreCase(ele.getText()))
			{
				flag = true;
				break;
			}
		}
		
		if(flag)
			System.out.println("Srilanka is present");
		
		else 
			System.out.println("Srilanka is not present");
			
		}
	}


