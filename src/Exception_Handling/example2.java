package Exception_Handling; 
 
public class example2 
{ 
public static void main(String[] args) 
{ 
 
int [] ar=new int[4]; //0-3 
 
 
try 
{ 
ar[2]=10; //risky code 
} 
catch (ArrayIndexOutOfBoundsException e) 
{ 
System.out.println("ArrayIndexOutOfBounds Exception handled"); 
 
} 
 
 
System.out.println("hi"); 
System.out.println("hello"); 
 
 
 
 
} 
 
}