package Excel_Sheet; 
 
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.IOException; 
 
import org.apache.poi.EncryptedDocumentException; 
import org.apache.poi.ss.usermodel.WorkbookFactory; 
 
public class example6_getNumericDataAsAString 
{ 
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{ 
 
FileInputStream file=new FileInputStream("C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\12Th March
A Selenum soft\\12 March A.xlsx"); 
 
String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue(); 
System.out.println(value); 
 
} 
 
}