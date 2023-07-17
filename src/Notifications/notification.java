package Notifications; 
 
import java.util.concurrent.TimeUnit; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.chrome.ChromeOptions; 
 
public class notification 
{ 
public static void main(String[] args) throws InterruptedException 
{ 
ChromeOptions option=new ChromeOptions(); 
option.addArguments("--disable-notifications"); 
 

ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions need this
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver(options);  
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
driver.manage().window().maximize(); 
driver.get("https://kite.zerodha.com/"); 
 
 
driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("VS6640"); 
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("7066650010"); 
driver.findElement(By.xpath("//button[text()='Login ']")).click(); 
 
driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("706665"); 
driver.findElement(By.xpath("//button[text()='Continue ']")).click(); 
 
} 
 
}