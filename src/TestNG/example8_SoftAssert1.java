package TestNG; 
 
import org.testng.Assert; 
import org.testng.annotations.Test; 
import org.testng.asserts.SoftAssert; 
 
public class example8_SoftAssert1 
{ 
 
@Test 
public void TC() 
{ 
SoftAssert soft=new SoftAssert(); 
 
String actResult="Hi"; 
String expResult="Hello"; 
soft.assertEquals(actResult, expResult,"Failed1: both results are diff:"); 
 
boolean actResult1=false; 
soft.assertTrue(actResult1, "Failed2: act result is false"); 
 
soft.assertAll(); 
} 
 
 
}