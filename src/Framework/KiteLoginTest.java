package Framework; 
 
import java.util.concurrent.TimeUnit; 
 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Page_Object_Module.KiteHomePage; 
import Page_Object_Module.KiteLogin1Page; 
import Page_Object_Module.KiteLogin2Page; 
 
public class KiteLoginTest 
{ 
public static void main(String[] args) throws InterruptedException 
{ 
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions need this
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(options);
 
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
 
driver.manage().window().maximize(); 
 
driver.get("https://kite.zerodha.com/"); 
 
KiteLogin1Page login1=new KiteLogin1Page(driver); 
login1.enterUN(); 
login1.enterPWD(); 
login1.clickOnLoginBtn(); 
 
KiteLogin2Page login2=new KiteLogin2Page(driver); 
login2.enterPin(); 
login2.clickOnContinueBtn(); 
 
KiteHomePage home=new KiteHomePage(driver); 
home.verifyUserID(); 
 
Thread.sleep(3000); 
 
driver.close(); 
} 
 
} 