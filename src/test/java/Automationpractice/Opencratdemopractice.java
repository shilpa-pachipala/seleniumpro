package Automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Opencratdemopractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
	    driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"challenge-stage\"]/div/label/input")).click();
		
		/*driver.findElement(By.xpath("//*[@id=\"challenge-stage\"]/div/label/input")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"logo\"]/a/img"));
		
		//*[@id="logo"]/a/img
		
		//*[@id="logo"]/a/img
		
		driver.findElement(By.xpath("//*[@id=\"logo\"]/a/img")).click(); */
		
		
		
	
		
		
		

	}

}
