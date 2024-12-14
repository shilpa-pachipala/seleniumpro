package PageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

WebDriver driver;
		
//constructor

		LoginPage(WebDriver driver)
		{
			this.driver=driver;
			
		}
		
		//locator

	By txt_username_loc=By.xpath("//input[@placeholder='Username']");
	By txt_pswd_loc=By.xpath("//input[@placeholder='Password']");
	By txt_login_loc=By.xpath("//button[normalize-space()='Login']");


	//ActionMethods

	public void SetUserName(String user)
	{
		driver.findElement(txt_username_loc).sendKeys(user);
	}
		public void SetPsed(String pswd)
		{
			driver.findElement(txt_pswd_loc).sendKeys(pswd);
		}
		public void Loginclick()
		{
			driver.findElement(txt_login_loc).click();
			
		}
		
			
		
		

	}

       


