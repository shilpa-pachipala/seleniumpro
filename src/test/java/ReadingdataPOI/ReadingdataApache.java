package ReadingdataPOI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingdataApache {

	public static void main(String[] args) throws IOException {
		FileInputStream file =new FileInputStream(System.getProperty("user.dir")+"\\Excelfiles\\testfile.xlsx");
		
	XSSFWorkbook wrkbk=new XSSFWorkbook(file);
	
	XSSFSheet sheet=wrkbk.getSheet("Sheet1");
	int totalrows=sheet.getLastRowNum();
	int totalcells=sheet.getRow(1).getLastCellNum();
	System.out.println("total rows:" +totalrows  );
	System.out.println("totalcells:" +totalcells);
	
	for(int r=0;r<=totalrows;r++)
	{
		XSSFRow currentrow =sheet.getRow(r);
		for(int c=0;c<totalcells;c++)
		{
			String value=currentrow.getCell(c).toString();
			System.out.print(value+"    ");
		}
		System.out.println();
	}
		
	wrkbk.close();
	file.close();
	

	}

}
