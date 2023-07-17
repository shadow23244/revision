package TestNG; 
 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; 
 
public class example1_NormalTestClass 
{ 
public static void main(String[] args) throws InterruptedException 
{ 
 
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions need this
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(options);
	
 
driver.manage().window().maximize(); 
 
driver.get("https://www.facebook.com/"); 
 
 
Thread.sleep(3000); 
 
driver.close(); 
} 
 
}