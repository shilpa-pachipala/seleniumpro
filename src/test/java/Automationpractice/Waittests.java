package Automationpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waittests {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//right after webdrivar instance add implicitly wait comand
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//whn no such element exception occured added thd.slp to wait for 5 sec
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		

	}

}
