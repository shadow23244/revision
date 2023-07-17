
 
package WebElement; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; 
public class example2_clear 
{ 
public static void main(String[] args) throws InterruptedException { 
 
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions need this
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(options);
	 
 
driver.get("https://www.facebook.com/"); 
 
// driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc"); 
// Thread.sleep(2000); 
// driver.findElement(By.xpath("//input[@id='email']")).clear(); 
// Thread.sleep(2000); 
// driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz"); 
 
 
WebElement UN = driver.findElement(By.xpath("//input[@id='email']")); 
UN.sendKeys("abc"); 
Thread.sleep(2000); 
UN.clear(); 
Thread.sleep(2000); 
UN.sendKeys("xyz"); 
 
} 
 
} 
 
 
 
 
 
