package KeyboardActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutortest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.switchTo().frame("frame-one796456169");
		
		//inputbox
		//driver.findElement(By.xpath("//input[@name='RESULT_TextField-0']")).sendKeys("Shilpa");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement ipbox=driver.findElement(By.xpath("//input[@name='RESULT_TextField-0']"));
		js.executeScript("arguments[0].setAttribute('value','Mansa')", ipbox);
		
		//driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-1_0']")).click();
		
	WebElement rdbtn=	driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-1_1']"));
	
	js.executeScript("arguments[0].click()", rdbtn);
	
	WebElement submit=driver.findElement(By.xpath("//input[@name='Submit']"));
	js.executeScript("argumnet[0].click()", submit);
		
		
		
		
		
	}

}
