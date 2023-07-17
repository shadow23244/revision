
package TestNG; 
 
import org.testng.Reporter; 
import org.testng.annotations.Test; 
 
public class example3_EmailableReport 
{ 
 
@Test 
public void TC1() // Test case or test method 
{ 
Reporter.log("running TC1",true); 
 
} 
 
 
@Test 
public void TC2() // Test case or test method 
{ 
Reporter.log("running TC2",true); 
 
} 
 
 
@Test 
public void TC3() // Test case or test method 
{ 
Reporter.log("running TC3",true) 
}
}
