package WebTable; 
 
import java.util.List; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; 
 
public class example1_getRowSize 
{ 
public static void main(String[] args) 
{ 
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions need this
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(options);
	
 
driver.manage().window().maximize(); 
 
driver.get("file:///C:/Users/sanjay/Desktop/Study/Selenium_Syallabus/12Th%20MarchA%20Selenum%20soft/Htm
l%20files/sample4_Webtable.html"); 
 
 
// List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr")); 
// int rowSize = allRows.size(); 
// System.out.println(rowSize); 
 
 
int rowsize = driver.findElements(By.xpath("//table[@id='1234']//tr")).size(); 
System.out.println(rowsize); 
 
 
// System.out.println(driver.findElements(By.xpath("//table[@id='1234']//tr")).size()); 
} 
 
} 
 