package XpathPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericUtils.ExcelUtility;

public class Excel8Test 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.amazon.in/Apple-iPhone-13-128GB-Pink/dp/B09G9FPGTN/ref=sr_1_4?crid=171NVT4HY8JHU&dib=eyJ2IjoiMSJ9.eFa-TvbcC_zjCq_5PD2KO_ePKUUNdp4RD7PFjLb5LiUyOTQBpioo_qGJecBbCfBK8ohI8BpyfVexO3q6OWC95X8EfzVQ-hqDdWSPh6cyYAsMidl-5epinsTEmgQ34TSMdk_kZcEyjXSFBeTROiuBIhHvWcgGbxQZ4Inx_gtGMPUrVKUaRS3PQtxia3R_wqYHy8Ncv5GUueyOKeC0jWbfMDJUI1ju6-k-DiTQJMlEXB4.SZSmSPpfU1hiWUJZG3yOO8ph-SYZpe4oqyPm_LdKysI&dib_tag=se&keywords=iphone+13&qid=1712818042&sprefix=%2Caps%2C418&sr=8-4");
				
				String price = driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone 13 (128GB) - Pink')]/ancestor::div[@id=\"centerCol\"]/descendant::div//span[@class='a-price-whole']")).getText();
				
				System.out.println(price+" :is the Price of Iphone 13");
			

		
	   ExcelUtility eutil=new ExcelUtility();
	//   eutil.writeDataIntoExcel(price,Rownum, price);
	
	}

}
