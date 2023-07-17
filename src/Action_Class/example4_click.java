package Action_Class; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions; 
 
public class example4_click 
{ 
public static void main(String[] args) throws InterruptedException 
{ 
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions need this
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(options);
 
driver.manage().window().maximize(); 
 
driver.get("https://www.flipkart.com/"); 
 
//click on close btn 
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click(); 
 
Thread.sleep(2000); 
 
 
WebElement login = driver.findElement(By.xpath("//a[text()='Login']")); 
Actions act=new Actions(driver); 
 
 
// act.moveToElement(login).perform(); 
// act.click().perform(); 
 
//act.moveToElement(login).click().build().perform(); 
 
act.click(login).perform(); 
 
} 
 
}