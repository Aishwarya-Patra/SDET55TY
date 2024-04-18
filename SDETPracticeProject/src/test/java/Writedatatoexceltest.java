import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writedatatoexceltest {
	
		public static void main(String[] args) throws EncryptedDocumentException, IOException ,FileNotFoundException{
			FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\seleniumtestdata.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet("Sheet1");
		    sh.createRow(4).createCell(0).setCellValue("Hello");
		    sh.getRow(4).createCell(1).setCellValue("hi");
		    FileOutputStream fout = new FileOutputStream(".\\src\\test\\resources\\seleniumtestdata.xlsx");
		    wb.write(fout);
		    wb.close();
			

	}


}
