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

public class Parameterizationtest {
	
	WebDriver driver;
	
	@BeforeClass()
	void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}

	@Test(dataProvider="dp")
	
	void Testlogins(String email,String password)
	{
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("Email")).sendKeys(email);
		driver.findElement(By.name("Password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@class=\"button-1 login-button\"]")).click();
		
		String Exp_title="nopCommerce demo store";
		String Act_title=driver.getTitle();
		Assert.assertEquals(Exp_title, Act_title);
		
		
	}
	
	@AfterClass()
	void close() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
	@DataProvider(name="dp",indices= {2,4})
	String [][]logindata()
	{
		String  data[][]={ 
				            {"mansa@gmail.com","test123"},
				            {"manasa@gmail.comm","test@123"},
				            {"manasu@gmail.com","test1qa"},
		                    {"mansa@gmail.com","mansa@111"},
		                    {"shiva@gmail.com","shiva@123"}
		                    
		                };
		return data;
		
	}
}
