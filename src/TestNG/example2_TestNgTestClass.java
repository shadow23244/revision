package TestNG; 
 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.testng.annotations.Test; 
 
public class example2_TestNgTestClass 
{ 
@Test 
public void openFacebookApp() throws InterruptedException 
{ 
System.setProperty("webdriver.chrome.driver", 
"C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\12Th MarchA Selenum soft\\chromedriver_win32 (20)\
\chromedriver.exe"); 
 
WebDriver driver=new ChromeDriver(); 
driver.manage().window().maximize(); 
driver.get("https://www.facebook.com/"); 
 
Thread.sleep(3000); 
 
driver.close(); 
 
} 
 
 
}