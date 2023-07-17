package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class example4_XpathByContains_Using_Attribute 
{ 
public static void main(String[] args) 
{ 

ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions need this
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver(options); 
driver.get("https://www.facebook.com/"); 
 
//enter UN 
driver.findElement(By.xpath("//input[contains(@placeholder,'phone number')]")).sendKeys("abc"); 
 
 
//enter pwd 
driver.findElement(By.xpath("//input[contains(@class,'6luy _9npi')]")).sendKeys("xyz"); 
 
 
//click on login btn 
driver.findElement(By.xpath("//button[contains(@class,'4jy1 selected _51sy')]")).click(); 
} 
 
} 
 
 
