import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReaddatafromExcelbycomparetest 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		String exp_data="Client";
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\seleniumtestdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet2");
		int rowcount=sh.getLastRowNum();
		int cellcount=sh.getRow(0).getLastCellNum();
		for(int i=0;i<=rowcount;i++)
		{
			String value=sh.getRow(i).getCell(0).toString();
			if(value.equalsIgnoreCase(exp_data))
			{
				
				for(int j=0;j<cellcount;j++)
				{
					String value1=sh.getRow(i).getCell(j).toString();
					
					System.out.print(value1+"  ");
				}
				
			}
			System.out.println(" ");
			
		}
		
		
		
	}

}
