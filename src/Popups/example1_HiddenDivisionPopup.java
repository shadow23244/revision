package Popups; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; 
 
public class example1_HiddenDivisionPopup 
{ 
public static void main(String[] args) throws InterruptedException { 
 
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions need this
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(options); 
driver.get("https://www.flipkart.com/"); 
 
 
//click on close btn 
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click(); 
 
Thread.sleep(2000); 
 
//click on login btn 
driver.findElement(By.xpath("//a[text()='Login']")).click(); 
 
 
//enter UN 
driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("abc"); 
 
//enter pwd 
driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("xyz"); 
 
 
 
} 
 
}