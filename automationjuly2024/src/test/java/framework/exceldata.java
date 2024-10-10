package framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class exceldata {

	
	@Test
	public void test()
	{
		File src= new File("D:\\training\\automationjuly2024\\Testdata\\testexcel.xlsx");
		try {
			FileInputStream fis= new FileInputStream(src);
			XSSFWorkbook wb= new XSSFWorkbook(fis);
			XSSFSheet sh= wb.getSheet("browsers");
			XSSFRow row=sh.getRow(0);
			XSSFCell cell=row.getCell(0);
			System.out.println(cell.getStringCellValue());
			cell=row.getCell(1);

			System.out.println(cell.getStringCellValue());
			
			
			wb.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		@Test
		public void test1()
		{
			File src= new File("D:\\training\\automationjuly2024\\Testdata\\testexcel.xlsx");
			try {
				FileInputStream fis= new FileInputStream(src);
				XSSFWorkbook wb= new XSSFWorkbook(fis);
				XSSFSheet sh= wb.getSheet("browsers");
				int rowcount= sh.getPhysicalNumberOfRows();
				for(int i=0;i<rowcount;i++)
				{
					int collcount=sh.getRow(i).getPhysicalNumberOfCells();
					for(int j=0;j<collcount;j++)
					{
						XSSFCell c=sh.getRow(i).getCell(j);
						System.out.println(c.getCellType()); 
						if(c.getCellType() == CellType.STRING)
						{
						System.out.println(c.getStringCellValue());
						}
						if(c.getCellType() == CellType.NUMERIC)
						{
						System.out.println(c.getNumericCellValue());
						}
					}
				}
				wb.close();
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
