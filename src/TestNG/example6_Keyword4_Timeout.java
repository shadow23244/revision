 
package TestNG; 
 
import org.testng.Reporter; 
import org.testng.annotations.Test; 
 
public class example6_Keyword4_Timeout 
{ 
 
@Test(timeOut=6000) 
public void TC1() throws InterruptedException 
{ 
Thread.sleep(4000); 
Reporter.log("running TC1", true); 
} 
 
} 
 
 
