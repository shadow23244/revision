
package WebElement; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
 
public class example5_isEnabled 
{ 
public static void main(String[] args) 
{ 
 
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions need this
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(options);
	 
 
driver.get("https://www.facebook.com/"); 
 
 
boolean result = driver.findElement(By.xpath("//button[text()='Log In']")).isEnabled(); 
 
System.out.println(result); 
 
if(result==true) 
{ 
System.out.println("Element is enabled"); 
} 
else 
{ 
System.out.println("Element is disabled"); 
} 
} 
 
} 
 
 
 
 
 
 
