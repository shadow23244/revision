package IFrame; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebDriver.TargetLocator; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; 
 
public class example2_SwitchToMainPage_From_Frame 
{ 
public static void main(String[] args) throws InterruptedException 
{ 
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions need this
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(options);
driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst"); 
 
 
//switch to frame 
driver.switchTo().frame("iframeResult"); // String FrameID 
 
 
//click on click me btn 
driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click(); 
 
Thread.sleep(2000); 
 
 
//switch to main page 
//driver.switchTo().parentFrame(); 
driver.switchTo().defaultContent(); 


//click on home icon 
driver.findElement(By.xpath("//a[@id='tryhome']")).click(); 


} 

} 
