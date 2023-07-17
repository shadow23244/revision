
package Listbox; 
 
import java.util.List; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select; 
 
public class example7_getAllOptionsInAListbox1 
{ 
public static void main(String[] args) 
{ 
 
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions need this
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(options); 
 
driver.get("file:///C:/Users/sanjay/Desktop/Study/Selenium_Syallabus/12Th%20MarchA%20Selenum%20soft/Htm
l%20files/sample5_listbox.html"); 
 
//step1: 
WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']")); 
 
Select s=new Select(selectCountry); 
 
List<WebElement> multipleOptions = s.getOptions(); 
 
for(WebElement s1:multipleOptions) 
{ 
System.out.println(s1.getText()); 
} 
 
 
} 
 
} 
 
 
 
 
 
