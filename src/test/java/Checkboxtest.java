import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxtest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		driver.manage().window().maximize();
		
		List<WebElement>Checkboxes=driver.findElements(By.xpath("//input[@type='checkbox'  and @class='cb1-element']"));
		
		System.out.println("number of checkboxes:" +Checkboxes.size());
		
		/*for(int i=0;i<Checkboxes.size();i++)
		{
			Checkboxes.get(i).click();
			
		} 
		/*for(WebElement chkbx:Checkboxes)
		{
			chkbx.click();
		
		} */
		Thread.sleep(5000);
		//un checking option
		//driver.findElement(By.xpath("//input[@type='button' and @id='check1']")).click();
		
		//select last 2 checkbox
		
		//total boxes-how many check boxes to be selected=index of checkbox no
		/*for(int i=2;i<Checkboxes.size();i++)
		{
			Checkboxes.get(i).click();
			
		}
		//first 2 check boxes
		for(int i=0;i<2;i++)
		{
			Checkboxes.get(i).click();
		}*/
		
		//select all boxes
		/*for(int i=0;i<Checkboxes.size();i++)
		{
			Checkboxes.get(i).click();
		}
		Thread.sleep(5000);
		for(int i=0;i<Checkboxes.size();i++)
		{
			Checkboxes.get(i).click();
			
		}*/
		//total 4 boxes select 2 and dont select remainaing
		for(int i=0;i<2;i++)
		{
			
			Checkboxes.get(i).click(); //selects 2 boxes
		}
		Thread.sleep(3000);
		for(int i=0;i<Checkboxes.size();i++)
			
		{
			if(Checkboxes.get(i).isSelected());
			{
				Checkboxes.get(i).click();
			}
		}

}
}
