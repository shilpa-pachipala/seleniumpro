package day33;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FixedDepositCalculator {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		
		String file= System.getProperty("user.dir")+"//Excelfiles//caldata.xlsx";
		int rows=ExcelUtils.getRowCount(file, "Sheet1");
		
		for(int i=1;i<=rows;i++)
		{
			//read data from excel
			
			String principle=ExcelUtils.getCellData(file, "Sheet1", i,0);
			String ROI=ExcelUtils.getCellData(file, "Sheet1", i,1);
			String per1=ExcelUtils.getCellData(file, "Sheet1", i,2);
			String per2=ExcelUtils.getCellData(file, "Sheet1", i,3);
			String Fre=ExcelUtils.getCellData(file, "Sheet1", i,4);
			String exp_mat =ExcelUtils.getCellData(file, "Sheet1", i,5);
			
			//pass data from  excel sheet to application
			
			driver.findElement(By.id("principal")).sendKeys(principle);
			driver.findElement(By.id("interest")).sendKeys(ROI);
			driver.findElement(By.id("tenure")).sendKeys(per1);
			WebElement drpdwn=driver.findElement(By.id("tenurePeriod"));
			Select tenure=new Select(drpdwn);
			
			tenure.selectByVisibleText(per2);
			
			Select fredrp=new Select(driver.findElement(By.id("frequency")));
			fredrp.selectByVisibleText(Fre);
			
			/*driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img")).click(); 
			 * selenium.ElementClickInterceptedException ===giving this error so solve by javascript*/
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement calculateoptn	=driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img"));
			js.executeScript("arguments[0].click()", calculateoptn);
		
			
			//=====>validate data & update in xl sheet
			String act_mat=driver.findElement(By.xpath("//*[@id='resp_matval']//strong")).getText();
			//if we compare string formats we dnt get accurate so convert into int format, so maturity amounr have
			// decimal so convert to double
			if(Double.parseDouble(exp_mat)== Double.parseDouble(act_mat))
				
			{
				System.out.println("test passed");
				ExcelUtils.setCellData(file, "sheet1", i,7,"passed");
				ExcelUtils.fillGreenColor(file, "Sheet1", i,7 );
				
			}
			else
			{
				System.out.println("test failed");
				ExcelUtils.setCellData(file,"Sheet1", i,7,"failes");
				ExcelUtils.fillRedColor(file, "Sheet1", i, 7);
				
			}
			
			WebElement clr_btn=driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[2]/img"));
			js.executeScript("arguments[0].click()", clr_btn);
			
			
			
			
			
			
			
		}
		
		
		
	}

}
