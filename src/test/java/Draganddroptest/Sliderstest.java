package Draganddroptest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sliderstest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/#google_vignette");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		WebElement min_slider=driver.findElement(By.xpath("//span[1]"));
		System.out.println("Current location of mi slider:"   +min_slider.getLocation());
		
		act.dragAndDropBy(min_slider, 100, 0).perform();
		System.out.println("Current location of mi slider after moving:"   +min_slider.getLocation());
		
		WebElement Max_Slider=driver.findElement(By.xpath("//span[2]"));
		System.out.println("Current location of max slider:"   +Max_Slider.getLocation());
		
       act.dragAndDropBy(Max_Slider, -100, 0).perform();
       System.out.println("Current location of maxslider:"   +Max_Slider.getLocation());

	}

}
