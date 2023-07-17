package TestNG; 
 
import org.testng.Assert; 
import org.testng.annotations.Test; 
 
public class example8_AssertClass1_assertEquals 
{ 
 
@Test 
public void assertEquals() 
{ 
String actResult="Hi"; 
String expResult="Hello"; 
 
Assert.assertEquals(actResult, expResult,"Failed: both results are diff:"); 
} 
 
 
 
}