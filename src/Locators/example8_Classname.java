package Locators; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; 
 
public class example8_Classname 
{ 
public static void main(String[] args) 
{ 

ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions need this
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver(options); 
 
driver.manage().window().maximize(); 
 
driver.get("file:///C:/Users/sanjay/Desktop/Study/Selenium_Syallabus/12Th%20MarchB%20Selenum%20Soft/Ht
ml%20files/classname.html"); 
 
//enter FN 
driver.findElement(By.className("abc123")).sendKeys("abc"); 
 
 
//enter LN 
driver.findElement(By.className("abc123")).sendKeys("xyz"); 
 
} 
 
} 
 