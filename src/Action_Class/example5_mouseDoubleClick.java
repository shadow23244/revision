package Action_Class; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions; 
 
public class example5_mouseDoubleClick 
{ 
public static void main(String[] args) 
{ 
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions need this
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(options);
 
driver.manage().window().maximize(); 
 
driver.get("https://demo.guru99.com/test/simple_context_menu.html"); 
 
 
WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")); 
Actions act=new Actions(driver); 
 
// act.moveToElement(element).perform(); 
// act.doubleClick().perform(); 
 
// act.moveToElement(element).doubleClick().build().perform(); 
 
act.doubleClick(element).perform(); 
 
 
 
 
} 
 
}