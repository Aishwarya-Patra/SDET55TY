package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement dd=driver.findElement(By.xpath("//select[@id='select3']"));
		Thread.sleep(2000);
		Select s=new Select(dd);
		Thread.sleep(2000);
		List<WebElement> options = s.getOptions();
	    int count=	options.size();
	    System.out.println(count);
	    ArrayList<String> al=new ArrayList<String>();	
        for(int i=0;i<count;i++)
        {
            WebElement e=options.get(i);
        	String txt=e.getText();
        	al.add(txt);
        	Collections.sort(al);
        	 }
        	
        	for(int j=0;j<count;j++)
        	{
        		String c=al.get(j);
        		System.out.println(c);
        	}
		

	}

}
