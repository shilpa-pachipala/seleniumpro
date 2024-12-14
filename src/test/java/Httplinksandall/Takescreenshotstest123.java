package Httplinksandall;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Takescreenshotstest123 {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot)driver; 
		//full page screenshot
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Workspace_S\\Java folder\\seleniumpro\\Screenshots\\fullscreen.png");
		FileUtils.copyFile(src, trg);
		
		//Specific section of page
		
		WebElement productsgrid=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]"));
		File src1=productsgrid.getScreenshotAs(OutputType.FILE);
		File src2=new File("C:\\Workspace_S\\Java folder\\seleniumpro\\Screenshots\\specificsection.png");
		FileUtils.copyFile(src1, src2);
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File src_1=logo.getScreenshotAs(OutputType.FILE);
		File trg_2=new File("C:\\Workspace_S\\Java folder\\seleniumpro\\Screenshots\\logo.png");
		FileUtils.copyFile(src_1, trg_2);
		
		
		
		
		
		

	}

}
