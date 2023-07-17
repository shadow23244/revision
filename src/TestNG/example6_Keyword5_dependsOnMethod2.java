package TestNG; 
 
import org.testng.Reporter; 
import org.testng.annotations.Test; 
 
public class example6_Keyword5_dependsOnMethod2 
{ 
 
@Test 
public void login1() 
{ 
Reporter.log("running login1 TC"); 
} 
 
 
@Test 
public void login2() 
{ 
Reporter.log("running login2 TC"); 
} 
 
@Test(dependsOnMethods= {"login1","login2"}) 
public void logout() 
{ 
Reporter.log("running logout TC"); 
} 
 
}