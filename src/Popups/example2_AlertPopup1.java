package Popups; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; 
 
public class example2_AlertPopup1 
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
 
//gettext from alert popup 
String text = driver.switchTo().alert().getText(); 
System.out.println(text); 
 
// //click on cancel btn 
// driver.switchTo().alert().dismiss(); 
 
 
// click on ok btn 
driver.switchTo().alert().accept(); 
 
//Thread.sleep(1000); 
 
// click on ok btn 
driver.switchTo().alert().accept(); 
 
} 
 
}