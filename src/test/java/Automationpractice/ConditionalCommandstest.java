package Automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalCommandstest {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		WebElement logo=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		System.out.println("Is logo showing:"  +logo.isDisplayed());
		
		boolean SbStatus=driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
		System.out.println("Status of searchbox:"   +SbStatus);
		
		WebElement rdbtn=driver.findElement(By.xpath("//*[@id=\"pollanswers-1\"]"));
		System.out.println("before selection of radion button:"   +rdbtn.isSelected());
		
		//After selection of radiobutton
		rdbtn.click();
		System.out.println("After select rdbtn:"    +rdbtn.isSelected());
		
		
		
		
		
		
		
		
	}

}
