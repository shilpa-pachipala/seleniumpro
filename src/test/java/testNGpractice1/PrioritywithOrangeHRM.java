package testNGpractice1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrioritywithOrangeHRM {
	
	WebDriver driver;
	
	@Test(priority=1)
	
	
	void openUrl() 
	
	{
		WebDriverManager.chromedriver().clearDriverCache().setup();//important update to do to make this error free
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 
		 
		
	}
	@Test(priority=2)
	
	void logins() throws InterruptedException
	{
		  driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		        
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(5000);
		
		
	}
	

	 @Test(priority=3)
	 void closeapp()
	 {
		 driver.quit();
	 }

}
