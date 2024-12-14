package Day25th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Doubleclicktest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		WebElement f1=driver.findElement(By.xpath("//input[@id='field1']"));
		f1.clear();
		f1.sendKeys("Shilpa");
		WebElement copybtn= driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		Actions act=new Actions(driver);
		act.doubleClick(copybtn).perform();
		//validate 2nd inout box info = 1st input box
		
		WebElement f2=driver.findElement(By.xpath("//input[@id='field2']"));
		String copiedtext=f2.getAttribute("value");
		System.out.println("text info copied to 2nd ipbox is:"  +copiedtext);
		
		if(copiedtext.equals("Shilpa"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		
		
		
		
		
				

	}

}
