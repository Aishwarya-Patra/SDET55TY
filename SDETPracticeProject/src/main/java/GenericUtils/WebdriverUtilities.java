package GenericUtils;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WebdriverUtilities {
	public void switchWindow(WebDriver driver,String url)
	{
		Set<String> wid=driver.getWindowHandles();
		for(String str:wid)
		{
			driver.switchTo().window(str);
			String txt=driver.getCurrentUrl();
			if(txt.contains(url))
			{
				break;
			}
			
		}
		
	}

}
