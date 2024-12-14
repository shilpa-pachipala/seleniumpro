import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertswithOKandCancel {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		Alert alert=mywait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(alert.getText());
		//alert.accept();
				alert.dismiss();
		

	}

}
