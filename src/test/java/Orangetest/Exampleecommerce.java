package Orangetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exampleecommerce {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement emailtxt=driver.findElement(By.id("Email"));
		emailtxt.clear();
		Thread.sleep(5000);
		emailtxt.sendKeys("admin@yourstore.com");
		
		WebElement pswd=driver.findElement(By.id("Password"));
		pswd.clear();
		Thread.sleep(5000);
		pswd.sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
		
		String act_label=driver.getTitle();
		

	}

}
