import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandlestesttwo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		 
		Set<String>windowids=driver.getWindowHandles();
		for(String winid:windowids)//specially to work with 2nd browser windw
		{
			String title=driver.switchTo().window(winid).getTitle();
					{
				      if(title.equals("OrangeHRM HR Software | OrangeHRM"))
				      {
				    	  driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[1]/a/button")).click();
				    	  
				      }
					}
					
		}
		
		

	}

}
