
package Locators; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; 
 
public class example2_XpathByText2 
{ 
public static void main(String[] args) { 
 
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions need this
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(options); 
 
driver.get("https://www.facebook.com/"); 
 
//click on Create new acc link 
driver.findElement(By.xpath("//a[text()='Create New Account']")).click(); 
 
 
} 
 
} 
 
 
 
 
 
