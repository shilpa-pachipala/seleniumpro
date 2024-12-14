package Automationpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explctlywttest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        WebElement username=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"username\"]")));
        username.sendKeys("Admin");
        
        WebElement password=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"password\"]")));
        password.sendKeys("admin123");
        ////*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button
        WebElement button=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")));
        button.click();
        
        
	}

}
