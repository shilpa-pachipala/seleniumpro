import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlingbrowserwindows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		
		Set<String>windowids=driver.getWindowHandles(); //store 2 winids
		
		//Approach 1 using list collectionconvert set to list collection type
		List<String>WindId=new ArrayList(windowids);
		String parentId=WindId.get(0);
		String childId=WindId.get(1);
		
		//even after clck on link driver 
		//still focus on parent wind so Switch to child Id
		
		driver.switchTo().window(childId);
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[2]/a/button")).click();
		
		//switch to parentwind
		driver.switchTo().window(parentId);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		}
}
