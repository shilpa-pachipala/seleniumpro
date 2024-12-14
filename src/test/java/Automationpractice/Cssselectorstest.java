package Automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cssselectorstest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Nokia");
		

	}

	
		
	}


