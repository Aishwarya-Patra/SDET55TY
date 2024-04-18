package typractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script6 {
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
	    System.out.println(option.size());
	    ArrayList<String> al=new ArrayList<String>();
	    for(WebElement element:option)
		{
			String s1=element.getText();
			System.out.println(s1);
			al.add(s1);
		}
	    Collections.sort(al,Collections.reverseOrder());
	    for(String a:al)
	    {
	    	System.out.println(a);
	    }
	    
	    
		// for(int i=0;i<(option.size()-1);i++)		       //
	    {
	          //  WebElement e=option.get(i);
	        //	String txt=e.getText();
	        	//al.add(txt);
	        	//Collections.sort(al,Collections.reverseOrder());
	        	 //}
		 //System.out.println(al);
		 

	    
			
}}}
