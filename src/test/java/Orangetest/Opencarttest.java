package Orangetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Opencarttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/opencart/index.php?route=account/register&language=en-gb");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Shilpa");
		

		
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("p");
		

		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("ramani@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test123");
		
		WebElement element = driver.findElement(By.xpath("//input[@name='agree']"));

		Actions actions = new Actions(driver);

		actions.moveToElement(element).click().perform();
		
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
		

		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		

	}

}
