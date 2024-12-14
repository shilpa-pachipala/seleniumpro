import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestdropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium");
		Thread.sleep(3000);
		List<WebElement>options=driver.findElements(By.xpath("//li[@class='sbct PZPZlf']//div[contains(@class,'wM6W7d')]//span"));
		
		System.out.println("Total number of autosugges options:"   +options.size());
		/*for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}*/
		for(int i=0;i<options.size();i++)
		{
			String text=options.get(i).getText();
			{
				if(text.equals("selenium testing"))
				{
					options.get(i).click();
				}
			}
		}
		
		
	}

}
