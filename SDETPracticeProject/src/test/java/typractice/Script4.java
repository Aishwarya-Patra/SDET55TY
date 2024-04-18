package typractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script4 {

		public static void main(String[] args)  
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
			driver.manage().window().maximize();
			WebElement dd=driver.findElement(By.xpath("//select[@id='select3']"));
			Select sel=new Select(dd);
			sel.selectByVisibleText("India");

			WebElement dd1=driver.findElement(By.xpath("//select[@id='select5']"));
			Select s=new Select(dd1);
			s.selectByValue("Rajasthan");
			 List<WebElement> option = s.getOptions();
				int count=option.size();
				System.out.println(count);
				for(int i=0;i<count;i++)
				{
					WebElement opt=option.get(i);
					String txt=opt.getText();
					System.out.println(txt);
				}
		}}