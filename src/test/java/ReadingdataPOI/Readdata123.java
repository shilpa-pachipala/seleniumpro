package ReadingdataPOI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//file>>workbook>>sheet>>row>>cell
public class Readdata123 {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\Excelfiles\\Write.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int totalrows=sheet.getLastRowNum();
		int totalcells=sheet.getRow(0).getLastCellNum();
		System.out.println("total number of rows:"+ totalrows );
		System.out.println("Total number of columns:"  +totalcells);
		
		for(int r=0;r<=totalrows;r++)
		{ 
			XSSFRow CurrentRow=sheet.getRow(r);
			for(int c=0;c<totalcells;c++)
			{
			 String value=CurrentRow.getCell(c).toString();
			 System.out.print(value+"       ");
			}
			System.out.println();
		}
		
		workbook.close();
		
		file.close();
		
		

	}
	
	

}
