package TestNG; 
 
import org.testng.Reporter; 
import org.testng.annotations.Test; 
 
public class example6_Keyword5_dependsOnMethod1 
{ 
 
@Test 
public void login() 
{ 
Reporter.log("running login TC"); 
} 
 
@Test(dependsOnMethods="login") 
public void logout() 
{ 
Reporter.log("running logout TC"); 
} 
 
}