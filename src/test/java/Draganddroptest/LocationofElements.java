package Draganddroptest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocationofElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().window().minimize();
		
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='company-branding']"));
		
		System.out.println("location of logo bfre maximize:"  +logo.getLocation());// location of logo:(274, 54)
		
		System.out.println("location of logo after maximize:"  +logo.getLocation()); //340, 54)
		
		System.out.println("location of logo after minimize:"  +logo.getLocation()); //274, 54)
		
		//make it as fullscreen not even Address bar or new tab etc screen
		
		driver.manage().window().fullscreen();
		System.out.println("location of logo after Full screen:"  +logo.getLocation()); //(340, 39)
		Point s=new Point(50,50);
		
		driver.manage().window().setPosition(s);
		System.out.println("location of logo after Setting window 100,100:"  +logo.getLocation());
	}

}
