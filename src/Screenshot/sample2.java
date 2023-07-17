package Screenshot; 
 
 
import java.io.File; 
import java.io.IOException; 
 
import org.openqa.selenium.OutputType; 
import org.openqa.selenium.TakesScreenshot; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler; 
 
import net.bytebuddy.utility.RandomString; 
 
public class sample2 
{ 
public static void main(String[] args) throws IOException 
{ 
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions need this
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(options); 
 
driver.get("https://www.facebook.com/"); 
 
 
String RS = RandomString.make(2); 
 
 
File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
 
File dest=new File("C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\12Th MarchA Selenum soft\\Screens
hots\\Image" +RS+ ".jpg"); 
 
FileHandler.copy(src, dest); 
 
} 
 
}