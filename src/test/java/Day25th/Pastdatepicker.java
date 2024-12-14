package Day25th;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pastdatepicker {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("03/10/2024");
		
		String year="2020";
		String month="May";
		String day="24";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
				
		while(true)
		{
			String mn=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(mn.equals(month) && yr.equals(year))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		
		
		//date selection
		
		List<WebElement>alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement dt:alldates)
		{
			if(dt.getText().equals(day))
			{
				dt.click();
				break;
			}
		}
		

	}

}
