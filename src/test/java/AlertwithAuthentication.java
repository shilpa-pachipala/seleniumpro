import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertwithAuthentication {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//we have to pass id n pswd in url itself for these kinds of authentication popups
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		String text=driver.findElement(By.xpath("//p[contains(text(),'Congratulations')]")).getText();
		if(text.contains("Congratulations"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		
	}

}
