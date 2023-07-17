package WebElement; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; 
public class example6_isDisplayed 
{ 
public static void main(String[] args) 
{ 
 
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions need this
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(options);
	
 
driver.get("https://www.facebook.com/"); 
 
 
boolean result = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed(); 
System.out.println(result); 
 
if(result==true) 
{ 
System.out.println("Element found"); 
} 
else 
{ 
System.out.println("Element not found"); 
} 
 
} 
 
} 
 
 
 
 
 

 
