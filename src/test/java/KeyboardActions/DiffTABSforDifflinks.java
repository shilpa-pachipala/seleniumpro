package KeyboardActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DiffTABSforDifflinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.switchTo().newWindow(WindowType.TAB); /*if we dnt give this swtchto.newwindow tab
		 jqery web page atb will be replced by textcpmare 
		*/
		driver.get("https://text-compare.com/");
		

	}

}
