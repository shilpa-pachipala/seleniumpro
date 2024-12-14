package Testngtesting;

import org.testng.annotations.Test;

public class Prioritytest {
  
	
  @Test(priority=0)
  void Url() {
	  System.out.println("open the Url");
  }
  @Test(priority=2)
  void Launchapp()
  {
	System.out.println("launch application");  
  }
  @Test(priority=1)
  void login()
  {
	  System.out.println("login to app");
  }
  @Test(priority=10)
  void logout()
  {
	  System.out.println("logout from app");
  }
}

