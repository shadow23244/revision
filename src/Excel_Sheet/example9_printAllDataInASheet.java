package Excel_Sheet; 
 
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.IOException; 
 
import org.apache.poi.EncryptedDocumentException; 
import org.apache.poi.ss.usermodel.Sheet; 
import org.apache.poi.ss.usermodel.WorkbookFactory; 
 
public class example9_printAllDataInASheet 
{ 
public static void main(String[] args) throws EncryptedDocumentException, IOException { 
 
 
FileInputStream file=new FileInputStream("H:\\flipkart.xlsx"); 
Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1"); 
 
int lastRowIndex = sh.getLastRowNum(); 
 
for(int i=0; i<=lastRowIndex; i++) //outer for loop rows 
{ 
int lastCellIndex = sh.getRow(i).getLastCellNum()-1; 
 
for(int j=0; j<=lastCellIndex; j++) //inner for loop cols 
{ 
String value = sh.getRow(i).getCell(j).getStringCellValue(); 
System.out.print(value+ " "); 
} 
System.out.println(); 
} 
 
} 
 
}