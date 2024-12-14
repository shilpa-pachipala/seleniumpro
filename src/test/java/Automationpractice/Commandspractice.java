package Automationpractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commandspractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		//String title=driver.getTitle();
		//System.out.println("title of the page:"  +title);
		
		System.out.println("print webpage name:"  +driver.getTitle());
		
		String Url=driver.getCurrentUrl();
		System.out.println("Url of the page:"  +Url);
		
		String ps=driver.getPageSource();
		//System.out.println("page source of webpage:"   +ps);
		System.out.println(ps.contains ("html"));
		String wh=driver.getWindowHandle();
		System.out.println("Handle of webp:"   +wh);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click(); 
		 Set<String> WindowH=driver.getWindowHandles();
				 //System.out.println("Handles of pages:"   +WindowH);
		 for(String ids:WindowH)
		 {
			 System.out.println(ids);
		 }
		 
		 System.out.println();
		//driver.close();	//close first window only not all 	
				 driver.quit();
		
		

	}

}
