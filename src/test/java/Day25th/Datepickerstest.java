package Day25th;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepickerstest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		
		//Approach 1
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("07/14/2024");
		//approach2: define m,d,y variables first then write conditions
		
		String year="2025";
		String Month="September";
		String date="27";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		//mnth&date seclection
		while(true)
		{
			String Mon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(Mon.equals(Month) && yr.equals(year))
			{
				break;
			}
			//next button selection
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//future date
			
			
		}
		
			//*date format selection
	List<WebElement>alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
			
		for(WebElement dt:alldates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
			
		
		
		
		
		
		
		
	
	}

}
