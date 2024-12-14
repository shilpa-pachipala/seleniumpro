package Annotations;


import org.testng.annotations.*;

public class BefrAftrMethodAnnotation {
 @BeforeMethod
 
 void login()
 {
	 System.out.println("test login");
 
  }
 @Test (priority=10)
 void search() //method , so befor& after want to login n out 
 {
	 System.out.println("test search ");
 }
 @AfterMethod
 
 void logout()
 {
	 System.out.println("test logout");
 }
 @Test(priority=50)
 void Advancesearch() //Method
 {
	 System.out.println("test AdvanceSearch");
 }
}
