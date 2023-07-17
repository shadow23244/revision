package POM_With_DDF; 
 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.PageFactory; 
 
//pom class 2 
 
public class KiteLogin2Page 
{ 
//STEP1: declaration 
@FindBy(xpath="//input[@id='pin']") private WebElement Pin; //private WebElement Pin=driver.finElement(By.xpath("")) 

@FindBy(xpath="//button[text()='Continue ']") private WebElement cntBtn; //private WebElement cntBtn=driver.finElement(By.xpath("")) 

 
 
//step2: initialization 
public KiteLogin2Page(WebDriver driver) 
{ 
PageFactory.initElements(driver, this); 
} 
 
 
//step3: usage 
 
public void setKiteLogin2PagePin() 
{ 
Pin.sendKeys("706665"); 
} 
 
public void clickKiteLogin2PageCntBtn() 
{ 
cntBtn.click(); 
} 
 
 
} 