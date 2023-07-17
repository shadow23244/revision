package Exception_Handling; 
 
public class example5 
{ 
public static void main(String[] args) 
{ 
 
int [] ar=new int[4]; 
 
try 
{ 
ar[8]=10; 
} 
catch (ArithmeticException e) 
{ 
System.out.println("Arithmetic Exception handled"); 
} 
catch (NullPointerException e) 
{ 
System.out.println("NullPointer Exception handled"); 
} 
catch (ArrayIndexOutOfBoundsException e) 
{ 
System.out.println("ArrayIndexOutOfBounds Exception handled"); 
} 
catch(Exception e) 
{ 
System.out.println("generic exception handled"); 
e.printStackTrace(); 
} 
 
 
System.out.println("hi"); 
System.out.println("hello"); 
 
 
 
 
} 
 
} 