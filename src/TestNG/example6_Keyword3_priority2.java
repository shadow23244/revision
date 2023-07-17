package TestNG; 
 
import org.testng.Reporter; 
import org.testng.annotations.Test; 
 
public class example6_Keyword3_priority2 
{ 
@Test(priority=1) //duplicate priority 
public void TC4() 
{ 
Reporter.log("running TC4",true); 
} 
 
@Test(priority=1) //duplicate priority 
public void TC3() 
{ 
Reporter.log("running TC3",true); 
} 
 
@Test //by default priority=0 
public void TC2() 
{ 
Reporter.log("running TC2",true); 
} 
 
@Test(priority=-2) //priority can be -ve value 
public void TC1() 
{ 
Reporter.log("running TC1",true); 
} 
 
}