package HandlingOfMultipleElements; 
 
import java.util.List; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; 
 
public class example1_printAllLinksFromWebpage 
{ 
public static void main(String[] args) 
{ 
 
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions need this
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(options);
 
driver.get("https://www.facebook.com/"); 
 
List<WebElement> allLinks = driver.findElements(By.xpath("//a")); 
System.out.println(allLinks.size()); 
 
for(WebElement s1:allLinks) 
{ 
System.out.println(s1.getText()); 
} 
 
 
 
} 
 
}