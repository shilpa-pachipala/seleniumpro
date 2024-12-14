package Orangetest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locatorstest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
	List<WebElement>slides    =driver.findElements(By.className("homeslider-container"));
	System.out.println("Number of slides:"  +slides.size()); //size give total number of images
	List<WebElement>Images=driver.findElements(By.tagName("img")); //img is tag name
	System.out.println("total number of images:"   +Images.size());
	List<WebElement>links=driver.findElements(By.tagName("a"));
	System.out.println("Number of links:"  +links.size());
	
	}

}
