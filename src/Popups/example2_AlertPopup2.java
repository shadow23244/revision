package Popups; 
 
import org.openqa.selenium.Alert; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; 
 
public class example2_AlertPopup2 
{ 
public static void main(String[] args) throws InterruptedException { 
 
 
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions need this
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(options); 
driver.get("https://demo.guru99.com/test/delete_customer.php"); 
 
//enter customer id 
driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123"); 
 
//click on submit btn 
driver.findElement(By.xpath("//input[@name='submit']")).click(); 
 
Thread.sleep(2000); 
 
Alert alt = driver.switchTo().alert(); 
 
//getText from alert popup 
String text = alt.getText(); 
System.out.println(text); 
 
 
// //click on cancel btn 
// alt.dismiss(); 
 
//click on OK btn from 1st alert popup 
alt.accept(); 
 
 
//click on OK btn from 2nd alert popup 
alt.accept(); 
} 
 
} 
 
