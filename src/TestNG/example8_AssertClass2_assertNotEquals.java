package TestNG; 
 
import org.testng.Assert; 
import org.testng.annotations.Test; 
 
public class example8_AssertClass2_assertNotEquals 
{ 
 
@Test 
public void assertNotEquals() 
{ 
String actResult="Hi"; 
String expResult="Hello"; 
 
Assert.assertNotEquals(actResult, expResult,"Failed: act & exp results are same: "); 
} 
 
 
 
}