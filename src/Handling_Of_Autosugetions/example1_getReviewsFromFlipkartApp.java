package Handling_Of_Autosugetions; 
 
import java.util.concurrent.TimeUnit; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; 
 
public class example1_getReviewsFromFlipkartApp 
{ 
 
public static void main(String[] args) 
{ 
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions need this
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(options);
 
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
 
driver.manage().window().maximize(); 
 
driver.get("https://www.flipkart.com/"); 
 
//click on close btn 
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click(); 
 
//search mob 
driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi 9 power"); 
 
 
//click on search icon 
driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click(); 
 
 
//get reviews 
String review = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[8]")).getText(); 
System.out.println(review); 
 
} 
 
} 
 
 
