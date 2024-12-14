import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaAutosuggestiondrpdwn {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("java");
		Thread.sleep(3000);
		List<WebElement>drp=driver.findElements(By.xpath("//li[@class='sbct PZPZlf']//div[@class='wM6W7d']//span"));
		System.out.println("Total number of values:"   +drp.size());
		/*for(int i=0;i<drp.size();i++)
		{
			System.out.println(drp.get(i).getText());
		} */
		for(int i=0;i<drp.size();i++)
		{
			String text=drp.get(i).getText();
			if(text.equals("javascript"))
			{
			drp.get(i).click();	
			}
		}
		
		

	}

}
