package AutomationTHREEPART;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepickertest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		
		//intead click we can directly send date info with format.
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/15/2024");
		
		
		
		
		
		
		
		
	}

}
