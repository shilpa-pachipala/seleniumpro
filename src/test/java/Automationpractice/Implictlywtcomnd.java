package Automationpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implictlywtcomnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//instd trd.slp will add implctlywt towait for the page to load the elemt rgt after
		// driver creatn have to add implctlywt comnd
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//this above command will tc of all script not for a single statement like trd.dlp
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		

	}

}
