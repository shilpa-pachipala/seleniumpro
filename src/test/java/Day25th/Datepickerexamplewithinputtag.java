package Day25th;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepickerexamplewithinputtag {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='dob']")).click();
		
		WebElement Month=driver.findElement(By.xpath("//*[@class='ui-datepicker-month']"));
		Select mon=new Select(Month);
		
		mon.selectByVisibleText("Jul");
		
		
		WebElement year=driver.findElement(By.xpath("//*[@class='ui-datepicker-year']"));
		Select yr=new Select(year);
		yr.selectByVisibleText("1992");
		
		String day="14";
		List<WebElement>alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		for(WebElement date:alldates)
		{
			if(date.getText().equals(day))
			{
				date.click();
				break;
			}
		}
				
		

	}

}
