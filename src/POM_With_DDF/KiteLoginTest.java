package POM_With_DDF; 
 
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.IOException; 
import java.util.concurrent.TimeUnit; 
 
import org.apache.poi.EncryptedDocumentException; 
import org.apache.poi.ss.usermodel.Sheet; 
import org.apache.poi.ss.usermodel.WorkbookFactory; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Page_Object_Module.KiteHomePage; 
import Page_Object_Module.KiteLogin1Page; 
import Page_Object_Module.KiteLogin2Page; 
 
public class KiteLoginTest 
{ 
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
{ 
FileInputStream file=new FileInputStream("C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\12Th MarchA Selenum soft\\12 March A.xlsx"); 
Sheet sh = WorkbookFactory.create(file).getSheet("DDF"); 
 
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions need this
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver(options); 
 
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
 
driver.manage().window().maximize(); 
 
driver.get("https://kite.zerodha.com/"); 
 
KiteLogin1Page login1=new KiteLogin1Page(driver); 
 
String UNValue = sh.getRow(0).getCell(0).getStringCellValue(); 
login1.setKiteLogin1PageUsername(UNValue); 
String pwdValue = sh.getRow(0).getCell(1).getStringCellValue(); 
login1.setKiteLogin1PagePassword(pwdValue); 
login1.clickKiteLogin1PageLoginBtn(); 
 
KiteLogin2Page login2=new KiteLogin2Page(driver); 
 
String pin = sh.getRow(0).getCell(2).getStringCellValue(); 
login2.setKiteLogin2PagePin(pin); 
login2.clickKiteLogin2PageCntBtn(); 
 
KiteHomePage home=new KiteHomePage(driver); 
 
String expUserID = sh.getRow(0).getCell(3).getStringCellValue(); 
home.verifyKiteHomePageUserID(expUserID); 
 
Thread.sleep(3000); 
 
driver.close(); 
} 
 
}