package Excel_Sheet; 
 
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.IOException; 
 
import org.apache.poi.EncryptedDocumentException; 
import org.apache.poi.ss.usermodel.Cell; 
import org.apache.poi.ss.usermodel.Row; 
import org.apache.poi.ss.usermodel.Sheet; 
import org.apache.poi.ss.usermodel.Workbook; 
import org.apache.poi.ss.usermodel.WorkbookFactory; 
 
public class example2_getNumericData 
{ 
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{ 
FileInputStream file=new FileInputStream("C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\12Th March
A Selenum soft\\12 March A.xlsx"); 
 
double value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(3).getNumericCellValue(); 
System.out.println(value); 
 
 
} 
} 