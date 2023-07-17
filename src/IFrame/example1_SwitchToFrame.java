package IFrame; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; 
 
public class example1_SwitchToFrame 
{ 
public static void main(String[] args) 
{ 
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions need this
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(options);
driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst"); 
 
 
//switch to frame 
//driver.switchTo().frame("iframeResult"); // String FrameID 
//driver.switchTo().frame("iframeResult"); //String FrameName 
//driver.switchTo().frame(1); //int frameIndex 
driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']"))); //frameWebElement 
 
 
//click on click me btn 
driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click(); 
 
} 
 
} 
