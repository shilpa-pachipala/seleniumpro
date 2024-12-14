package AutomationTHREEPART;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTablestest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//total no of rows
		/*1.List<WebElement>Rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		System.out.println("total number of rows:"   +Rows.size());
		 
		another approach but this have restrciction when have mutlple webtable dsnt wrk bcz give rows
		of all web tables prersent in wepage
		2.int row=driver.findElements(By.tagName("tr")).size();
		System.out.println("toatl rows:"   +row); */
		
		int Row =driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		//size return type integer so use int type
		
		System.out.println("Number of rows:"   +Row);
		
		
		
		//2.number of columns
		//int columns=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[2]/td")).size();
		//System.out.println("Number of columns:"   +columns);
		
		int column=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("total columns:"  +column);
		

	
	
	//3.get specific row and column info from table ex:3rd row 2nd column
	//String value= driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]//td[1]")).getText();
	//Syso("value of specific rowcolumn:"  +value);
	
	//4.read all data from rows and columns same like specific row and column but instead static value
		//make it as dynamic by giving r, c instead r[3] c[2] we make it as "+r+"  "+c+"
		//becuse in tr row[1] there is no td tag row 1 has th author th so it gives error .
		//if we give r=1 it gives exceptn//table[@name='BookTable']//tr[1]//td[1]
		/*for(int r=2;r<=Row;r++)
		
	    {
		for(int c=1;c<=column;c++ )
		{
			String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
			System.out.print(value+  "\t");
		}
		System.out.println();
	}*/
		
		//5.print books names whose author is Amit.
		//first capture Author column of all rows
		/*for(int r=2;r<=Row;r++)
		{
			String Author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			
			if(Author.equals("Amit"))
			{
				String book=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(Author+"     "+book);
			} */
			
			//6.sum of all books
			int Sum=0;
			for(int r=2;r<=Row;r++)
			{
				String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
				Sum=Sum+Integer.parseInt(price);
		    }
			System.out.println(Sum);
	}
}
