import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdowntestSelecttag {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.seleniumeasy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@id='btn_basic_example']")).click();
		driver.findElement(By.xpath("//*[@id=\"basic\"]/div/a[4]")).click();
		Thread.sleep(5000);
		
		WebElement drpcntry=driver.findElement(By.xpath("//*[@id='select-demo']"));
		
		Select dropdownvalue=new Select(drpcntry);
//select an option from dropdown1
		dropdownvalue.selectByVisibleText("Sunday");
		//dropdownvalue.selectByIndex(4);
		//we also have selectbyvalue but when value n visible txt
		//are same we cannot use valuebymethod 
		
		//number of options in dropdown
		List<WebElement>dropdwnvalues=dropdownvalue.getOptions();
		System.out.println("Total values in dropdown:"  +dropdwnvalues.size());
		
		/*for(int i=0;i<dropdwnvalues.size();i++)
		{
		System.out.println(dropdwnvalues.get(i).getText());
		} */
		for(WebElement options:dropdwnvalues)
		{
			System.out.println(options.getText());
		}
		
		
	}

}
