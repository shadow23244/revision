package Handling_Of_Autosugetions; 
 
import java.util.List; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; 
 
public class sample1 
{ 
public static void main(String[] args) throws InterruptedException 
{ 
 
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions need this
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(options);
 
driver.get("https://www.google.com/"); 
 
driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redmi"); 
 
Thread.sleep(2000); 
 
String expText="redmi note 20"; 
 
List<WebElement> allOptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li")); 
 
for(WebElement s1:allOptions) 
{ 
String actText = s1.getText(); 
if(actText.equals(expText)) 
{ 
s1.click(); 
break; 
} 
} 
 
 
} 
 
} 