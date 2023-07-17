package HandlingOfCustomizedListbox; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.Keys; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions; 
 
public class example1_HandlingOfCustomizedListbox 
{ 
public static void main(String[] args) throws InterruptedException 
{ 
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions need this
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(options);
 
driver.get("https://www.facebook.com/"); 
 
driver.findElement(By.xpath("//a[text()='Create New Account']")).click(); 
 
Thread.sleep(3000); 
 
//step1: 
WebElement month = driver.findElement(By.xpath("//select[@id='month']")); 
 
//step2: 
Actions act=new Actions(driver); 
 
//step3: 
act.click(month).perform(); 
 
Thread.sleep(2000); 
 
//step4: select option 
//4A: move 1 option to bottom using "ARROW_DOWN" key 
act.sendKeys(Keys.ARROW_DOWN).perform(); 
 
Thread.sleep(2000); 
 
//4A: move 1 option to top using "ARROW_UP" key 
act.sendKeys(Keys.ARROW_UP).perform(); 
act.sendKeys(Keys.ARROW_UP).perform(); 
 
Thread.sleep(2000); 
 
//4C: select option using "Enter" key 
act.sendKeys(Keys.ENTER).perform(); 
 
} 
 
}