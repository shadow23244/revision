package Popups; 
 
import java.util.ArrayList; 
import java.util.Set; 
import java.util.concurrent.TimeUnit; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; 
public class example4_switchToMainPage_From_ChildWindow 
{ 
public static void main(String[] args) throws InterruptedException 
{ 
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions need this
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(options); 
 
driver.manage().window().maximize(); 
 
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
 
driver.get("https://skpatro.github.io/demo/links/"); 
 
 
//click on new tab from main page 
driver.findElement(By.xpath("//input[@name='NewTab']")).click(); 
 
 
//get childWindow ID 
Set<String> allIds = driver.getWindowHandles(); //[mainPageId childWindowID] 
ArrayList<String> al=new ArrayList<String>(allIds); //[mainPageId(0) childWindowID(1)] 
 
 
//switch to child window 
driver.switchTo().window(al.get(1)); //String windowID 
 
//click on training link from childWindow 
driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click(); 
 
Thread.sleep(2000); 
 
 
//switch to main page 
driver.switchTo().window(al.get(0)); 
 
//click on new window from main page 
driver.findElement(By.xpath("//input[@name='NewWindow']")).click(); 
 
} 
 
}