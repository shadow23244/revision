package TestNG; 
 
import org.testng.Assert; 
import org.testng.annotations.Test; 
 
public class example8_AssertClass4_assertFalse 
{ 
 
@Test 
public void assertFalse() 
{ 
boolean actResult=true; 
Assert.assertFalse(actResult,"Failed- act result is true: "); 
 
} 
 
 
}