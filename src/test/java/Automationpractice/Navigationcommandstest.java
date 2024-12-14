package Automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigationcommandstest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		
		driver.navigate().back();
		System.out.println("Current url of browser:"   +driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println("current url of browser:"    +driver.getCurrentUrl());
		

	}

}
