package testNGpractice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTesting {
	WebDriver driver;
	@BeforeClass()
	@Parameters({"browser"})
	void setup(String br)
	{
		if(br.equals("Chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else 
		{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	
		
	}
   

	@Test(priority=1)
	void title() throws InterruptedException
	{
		String exp_title="OrangeHRM";
		String act_title=driver.getTitle();
		Assert.assertEquals(act_title, exp_title,"both titles are not matched");
		Thread.sleep(10000);
	}
   
	   
	   
   
   @AfterClass()
   void close()
   {
	  driver.quit(); 
   }
}
