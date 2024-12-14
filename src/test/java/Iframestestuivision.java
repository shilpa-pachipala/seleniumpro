import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframestestuivision {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		WebElement fram1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(fram1);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Shilpatest");
		/*without giving switch to default content we cannot goto next frmae
		as soon as work done in frame one driver focus on main page so switch to default content
		no sch elmnt excptn will throw so add default content */
		
		
		driver.switchTo().defaultContent();
		WebElement fram2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(fram2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Googletest");
		driver.switchTo().defaultContent();
		
		WebElement fram3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(fram3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Mytestin google");
		
		//when frame inside a frame no need to give swtch to dflt cntnt 
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//div[@class='AB7Lab Id5V1']")).click();
		
		driver.switchTo().defaultContent();
		
		WebElement fram4=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(fram4);
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Shilpatest123");

	}

}
