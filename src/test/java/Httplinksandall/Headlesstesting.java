package Httplinksandall;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlesstesting {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions(); //only thins we have add this .
	//	options.setHeadless(true;)
	
		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin111");
		        
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
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
       // Thread.sleep(5000);
        //driver.quit();

	}

	private static Object chromedriver() {
		// TODO Auto-generated method stub
		return null;
	}

}
