package testNGpractice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterizationINDICE {
	
	WebDriver driver;
	
	@BeforeClass()
	void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	
	@Test(dataProvider="dp")
	void loginTest(String email,String pswd)
	{
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("Email")).sendKeys(email);
		driver.findElement(By.name("Password")).sendKeys(pswd);
		driver.findElement(By.xpath("//*[@class='button-1 login-button']")).click();
		
		String exp_title="nopCommerce demo store";
        String Act_title= driver.getTitle();
		Assert.assertEquals(Act_title, exp_title);
	}
	@AfterClass()

	void close() 
	{
		
		driver.quit();
	}
	
	@DataProvider(name="dp")
	
    String[][] logindata()
    {
	String data[][]=	{ {"man@gmail.com","man123"},
		                  {"mans@gmail.com","mana@123"},
		                  {"manasu@gmail.com","mansa@123"},
		                  {"mansa@gmail.com","mansa@123"}
		                 };
	return data;
	
	}
}
