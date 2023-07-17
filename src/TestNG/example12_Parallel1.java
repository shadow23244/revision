 
package TestNG; 
 
import java.util.concurrent.TimeUnit; 
 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.testng.annotations.Test; 
 
public class example12_Parallel1 
{ 
@Test 
public void openKiteApp() throws InterruptedException 
{ 
System.setProperty("webdriver.chrome.driver", 
"C:\\\\Users\\\\sanjay\\\\Desktop\\\\Study\\\\Selenium_Syallabus\\\\23rd AprC Selenium\\\\chromedriver_win32\\\\
chromedriver.exe"); 
 
WebDriver driver=new ChromeDriver(); 
 
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
 
driver.get("https://kite.zerodha.com/"); 
 
Thread.sleep(5000); 
 
driver.close(); 
 
} 
} 
 
 
 
 
package TestNG; 
 
import java.util.concurrent.TimeUnit; 
 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.testng.annotations.Test; 
 
