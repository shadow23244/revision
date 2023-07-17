package Framework; 
 
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.IOException; 
import java.util.concurrent.TimeUnit; 
 
import org.apache.poi.EncryptedDocumentException; 
import org.apache.poi.ss.usermodel.Sheet; 
import org.apache.poi.ss.usermodel.WorkbookFactory; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; 
 
public class example2_with_DDF1 
{ 
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
{ 
FileInputStream file=new FileInputStream("C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\12Th March
A Selenum soft\\12 March A.xlsx"); 
Sheet sh = WorkbookFactory.create(file).getSheet("DDF"); 
 
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions need this
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver(options);
 
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
 
driver.manage().window().maximize(); 
 
driver.get("https://kite.zerodha.com/"); 
 
 
//Enter UN 
driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue()); 
 
//Enter pwd 
driver.findElement(By.xpath("//input[@id='password']")).sendKeys(sh.getRow(0).getCell(1).getStringCellValue())
; 
 
//click on login btn 
driver.findElement(By.xpath("//button[text()='Login ']")).click(); 
 
 
//enter pin 
driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(sh.getRow(0).getCell(2).getStringCellValue()); 
 
//click on continue btn 
driver.findElement(By.xpath("//button[text()='Continue ']")).click(); 
 
 
String actUserID = driver.findElement(By.xpath("//span[@class='user-id']")).getText(); 
String expUserID = sh.getRow(0).getCell(3).getStringCellValue(); 
 
if (actUserID.equals(expUserID)) 
{ 
System.out.println("Pass"); 
} 
else 
{ 
System.out.println("Fail"); 
} 
 
 
Thread.sleep(3000); 
 
driver.close(); 
 
 
 
 
 
} 
 
}