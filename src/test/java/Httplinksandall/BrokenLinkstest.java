package Httplinksandall;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinkstest {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement>Links=driver.findElements(By.tagName("a"));
		System.out.println("Total no of links:" +Links.size());
		int brokenlinks=0;
		
		for(WebElement alllinks:Links)
		{
			String hrefAttribute=alllinks.getAttribute("href");
			if(hrefAttribute==null || hrefAttribute.isEmpty())
				{
					System.out.println("href attribute is null/empty");
					continue;
					
				}
			
			
			
		
		
		
		
		

	}
	}
}
