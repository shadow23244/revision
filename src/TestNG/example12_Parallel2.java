package TestNG;
public class example12_Parallel2 
{ 
@Test 
public void openFacebookApp() throws InterruptedException 
{ 
System.setProperty("webdriver.chrome.driver", 
"C:\\\\Users\\\\sanjay\\\\Desktop\\\\Study\\\\Selenium_Syallabus\\\\23rd AprC Selenium\\\\chromedriver_win32\\\\
chromedriver.exe"); 
 
WebDriver driver=new ChromeDriver(); 
 
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
 
driver.get("https://www.facebook.com/"); 
 
Thread.sleep(5000); 
 
driver.close(); 
 
} 
 
} 
 
 
 
 
<?xml version="1.0" encoding="UTF-8"?> 
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd"> 
<suite name="ParallelExecution1_Using_parallel=Classes_keyword"> 
<test name="Test1" parallel="classes"> 
<classes> 
<class name="TestNG.example12_Parallel1"/> 
<class name="TestNG.example12_Parallel2"/> 
</classes> 
</test> <!-- Test --> 
</suite> <!-- Suite --> 
[8:58 AM, 6/27/2022] Sanjay Chetlure velocity: <?xml version="1.0" encoding="UTF-8"?> 
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd"> 
<suite name="ParallelExecution2_Using parallel=tests attribute" parallel="tests"> 
 
<test name="Test1"> 
<classes> 
<class name="TestNG.example12_Parallel1"/> 
</classes> 
</test> <!-- Test --> 
 
<test name="Test2"> 
<classes> 
<class name="TestNG.example12_Parallel2"/> 
</classes> 
</test> <!-- Test --> 
 
 
</suite> <!-- Suite --> 