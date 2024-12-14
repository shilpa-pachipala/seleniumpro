package testNGpractice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(testNGpractice1.ExtentReportManager.class)
public class NopCommereceListenerTest {
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.manage().window().maximize();
		
		
	}
	@Test(priority=1)
	void logotest()
	{
		boolean status=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img")).isDisplayed();
		Assert.assertEquals(status, true);
	}
	@Test(priority=2)
    void testlogin()
        {
	driver.findElement(By.name("Email")).sendKeys("shiva@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("shiva@123");
	driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
	
	
	boolean status=driver.findElement(By.linkText("My account")).isDisplayed();
	Assert.assertEquals(status, false);
        }
	@Test(priority=3,dependsOnMethods= {"testlogin"})
	void testlogout() throws InterruptedException
	{
	driver.findElement(By.linkText("Log out")).click();
	Thread.sleep(5000);
	
	}
	@AfterClass
	void teardown()
	{
		driver.quit();
		
	}
}
