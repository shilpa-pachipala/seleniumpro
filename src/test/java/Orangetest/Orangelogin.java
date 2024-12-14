package Orangetest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangelogin {
	

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin111");
		        
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(5000);
		
        String act_title=driver.getTitle();
        String exp_title="OrangeHRM123";
        if(act_title.equals(exp_title))
        {
        	System.out.println("If title of page match then Test Passed");
        }
        else
        {
        	System.out.println("Test Failed");
        }
        Thread.sleep(5000);
        //driver.quit();
        
        
	}

}
