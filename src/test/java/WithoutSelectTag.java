import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutSelectTag {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		
		driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/a")).click();
		driver.findElement(By.xpath(" //*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id='select-demo']")).click();
		
		//driver.get
		

	}

}
