

 
package Listbox; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select; 
 


public class example1_selectOptions_from_multiSelectableListbox 
{ 
public static void main(String[] args) throws InterruptedException { 
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions need this
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(options);
 
driver.get("file:///C:/Users/sanjay/Desktop/Study/Selenium_Syallabus/12Th%20MarchA%20Selenum%20soft/Htm
l%20files/sample5_listbox.html"); 
 
//step1: 
WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']")); 
 
//step2: 
Select s=new Select(selectCountry); 
 
//step3: 
s.selectByVisibleText("Sri"); 
s.selectByIndex(2); 
s.selectByIndex(3); 
 
} 
 
} 
 
 
 
 