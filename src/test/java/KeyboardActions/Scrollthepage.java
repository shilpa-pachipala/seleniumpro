package KeyboardActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrollthepage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js= driver;
		//scroll by random pixel
		//js.executeScript("window.scrollBy(0,1000)", "");
		
		//System.out.println(js.executeScript("return window.pageYOffsect;"));
		
		//scroll by till element present
		WebElement name=driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[4]/div[7]/label"));
		
		js.executeScript("arguments[0].scrollIntoView();", name);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//scroll till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(5000);
		
		//scroll up again
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		
		
		
		
		
		
		
		
	}

}
