package Testngtesting;

import java.time.Duration;
import org.openqa.selenium.By;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrmNGTest {
  
	WebDriver driver;
	//declare it as global variable so it can be accessible through all the code instead one method
	
@Test(priority=1)
  void Url() 
  
  {
	WebDriverManager.chromedriver().setup();
	
	driver=new ChromeDriver(); //dont write webdriver declared above so dnt write webdriver again it will consider as local var
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
@Test (priority=4)
void closeapp()
{
	driver.quit();
}
}
