package PageObjectClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTestReferPOC {
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	@Test()
	void testlogin()
	{
		LoginPage lgp=new LoginPage(driver); //LoginPage is constructor , constructor will initiate the driver
		//so give the driver here to activate the driver in that LoginPage class--->>
		lgp.SetUserName("Admin");
		lgp.SetPsed("admin123");
		lgp.Loginclick();
	}

	void teardown() 
	{
		driver.quit();
		
	}
}
