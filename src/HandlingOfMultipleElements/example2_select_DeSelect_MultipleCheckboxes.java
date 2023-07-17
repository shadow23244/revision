package HandlingOfMultipleElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class example2_select_DeSelect_MultipleCheckboxes 
{ 
public static void main(String[] args) throws InterruptedException 
{ 
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions need this
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(options);
 
driver.get("file:///C:/Users/sanjay/Desktop/Study/Selenium_Syallabus/12Th%20MarchA%20Selenum%20soft/Mul
tipleCheckboxes.html"); 
 
 
List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']")); 
 
 
for(WebElement s1: allCheckboxes) 
{ 
s1.click(); 
Thread.sleep(1000); 
} 
 
 
for(int i=allCheckboxes.size()-1; i>=0; i--) 
{ 
allCheckboxes.get(i).click(); 
Thread.sleep(1000); 
} 
 
 
 
} 
 
}