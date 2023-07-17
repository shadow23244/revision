package Page_Object_Module; 
 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.PageFactory; 
 
//pom class 3 
 
public class KiteHomePage 
{ 
@FindBy(xpath="//span[@class='user-id']") private WebElement userID; 
 
 
public KiteHomePage(WebDriver driver) 
{ 
PageFactory.initElements(driver, this); 
} 
 
 
public void verifyUserID() 
{ 
String actUser = userID.getText(); 
String expUserID = "VS6640"; 
 
if (actUser.equals(expUserID)) 
{ 
System.out.println("Pass"); 
} 
else 
{ 
System.out.println("Fail"); 
} 
 
} 
 
 
 
} 
