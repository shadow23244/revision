package Excel_Sheet; 
 
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.IOException; 
 
import org.apache.poi.EncryptedDocumentException; 
import org.apache.poi.ss.usermodel.Sheet; 
import org.apache.poi.ss.usermodel.WorkbookFactory; 
 
public class example8_printAllDataInACol 
{ 
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{ 
FileInputStream file=new FileInputStream("C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\12Th March
A Selenum soft\\12 March A.xlsx"); 
 
Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2"); 
 
 
for(int i=0; i<=4; i++) 
{ 
String value = sh.getRow(i).getCell(0).getStringCellValue(); 
System.out.println(value); 
} 
 
 
// int lastRowIndex = sh.getLastRowNum(); 
// 
// for(int i=0; i<=lastRowIndex; i++) 
// { 
// String value = sh.getRow(i).getCell(0).getStringCellValue(); 
// System.out.println(value); 
// } 
 
 
 
 
} 
 
}