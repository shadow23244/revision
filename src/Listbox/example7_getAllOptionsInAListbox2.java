
package Listbox; 
 
import java.util.List; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select; public class example7_getAllOptionsInAListbox2 
{ 
public static void main(String[] args) throws InterruptedException 
{ 
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions need this
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(options);
 
driver.get("https://www.facebook.com/"); 
 
driver.findElement(By.xpath("//a[text()='Create New Account']")).click(); 
 
Thread.sleep(3000); 
 
//step1: 
WebElement month = driver.findElement(By.xpath("//select[@id='month']")); 
 
//step2: 
Select s=new Select(month); 
 
 
List<WebElement> multipleOptions = s.getOptions(); 
 
for(WebElement s1:multipleOptions) 
{ 
System.out.println(s1.getText()); 
} 
 
} 
 
} 
 
 
 
 
 
 
