package TestNG; 
 
import org.testng.Reporter; 
import org.testng.annotations.AfterClass; 
import org.testng.annotations.AfterMethod; 
import org.testng.annotations.BeforeClass; 
import org.testng.annotations.BeforeMethod; 
import org.testng.annotations.Test; 
 
public class example5_Annotations 
{ 
@BeforeClass 
public void openBrowser() 
{ 
Reporter.log("--Open browser--",true); 
} 
 
 
@BeforeMethod 
public void loginToApp() 
{ 
Reporter.log("--Login To App--",true); 
} 
 
@Test 
public void verifyUserID2() 
{ 
Reporter.log("running verify user ID TC2",true); 
} 
 
@Test 
public void verifyUserID1() 
{ 
Reporter.log("running verify user ID TC1",true); 
} 
 
@AfterMethod 
public void logoutFromApp() 
{ 
Reporter.log("--logout from app--",true); 
} 
 
 
@AfterClass 
public void closeBrowser() 
{ 
Reporter.log("--close browser--",true); 
} 
 
} 