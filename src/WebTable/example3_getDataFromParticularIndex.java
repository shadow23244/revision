package WebTable; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; 
 
public class example3_getDataFromParticularIndex 
{ 
public static void main(String[] args) 
{ 
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions need this
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(options);
	
 
driver.manage().window().maximize(); 
 
driver.get("file:///C:/Users/sanjay/Desktop/Study/Selenium_Syallabus/12Th%20MarchA%20Selenum%20soft/Htm
l%20files/sample4_Webtable.html"); 
 
//for header 
String data = driver.findElement(By.xpath("//table[@id='1234']//tr[1]/th[3]")).getText(); 
System.out.println(data); 
 
 
// String data = driver.findElement(By.xpath("//table[@id='1234']//tr[4]/td[2]")).getText(); 
// System.out.println(data); 
} 
 
}