import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Closemultiplewindowshandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String>windowids=driver.getWindowHandles();
		for(String winid:windowids)
		{
			String title=driver.switchTo().window(winid).getTitle();
			{
				if(title.equals("OrangeHRM HR Software | OrangeHRM"))
				{
					driver.close();
				}
			}
		}
			
	}

}
