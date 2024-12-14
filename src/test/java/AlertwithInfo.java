import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertwithInfo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		Alert alertwindow=driver.switchTo().alert();
		
		alertwindow.sendKeys("Google");
		
		System.out.println(alertwindow.getText());
		alertwindow.accept();
		
		String act_text=driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
		String exp_text="You entered: Google";
		
		if(act_text.equals(exp_text))	
		{
			System.out.println("Test passed");
			
		}
		else
		{
			System.out.println("test failed");
		}
		
	}

}
