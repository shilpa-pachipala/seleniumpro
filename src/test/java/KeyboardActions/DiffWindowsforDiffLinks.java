package KeyboardActions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DiffWindowsforDiffLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://text-compare.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}

}
