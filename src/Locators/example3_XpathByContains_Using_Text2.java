
 
package Locators; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; 
 
public class example3_XpathByContains_Using_Text2 
{ 
public static void main(String[] args) 
{ 
 

ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions need this
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver(options); 
 
driver.get("https://www.facebook.com/"); 
 
//click on Create new Acc links 
driver.findElement(By.xpath("//a[contains(text(),'Account')]")).click(); 
 
 
 
} 
 
} 
 
 

 
 
 
 
