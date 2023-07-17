package Action_Class; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions; 
 
public class example6_mouseDragAndDrop 
{ 
public static void main(String[] args) 
{ 
 
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions need this
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(options);
 
driver.manage().window().maximize(); 
 
driver.get("http://demo.guru99.com/test/drag_drop.html"); 
 
 
WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]")); 
WebElement dest = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]")); 
 
 
Actions act=new Actions(driver); 
 
 
act.dragAndDrop(src, dest).perform(); 
//act.moveToElement(src).clickAndHold().moveToElement(dest).release().build().perform(); 
 
 
} 
 
}