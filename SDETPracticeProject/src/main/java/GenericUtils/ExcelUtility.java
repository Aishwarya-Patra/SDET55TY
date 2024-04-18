package GenericUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelUtility 
{
	/**
	 * This method is used to Write data intoExcel
	 * @param SheetName
	 * @param Rownum
	 * @param Cellnum
	 * @param Data
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public void writeDataIntoExcel(String SheetName,int Rownum,String Data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(IpathConstant.ExcelPath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(SheetName);
		int totalcells=sh.getRow(Rownum).getPhysicalNumberOfCells();
		sh.createRow(Rownum).createCell(totalcells+1).setCellValue(Data);
		
		FileOutputStream fout=new FileOutputStream(IpathConstant.ExcelPath);
		wb.write(fout);
		wb.close();
		}
	

}
