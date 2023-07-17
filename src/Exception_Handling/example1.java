package Exception_Handling; 
 
public class example1 
{ 
public static void main(String[] args) 
{ 
 
int a=10; 
int b=2; 
 
int c=0; 
 
 
try 
{ 
c=a/b; // 10/2 = 5 //risky code 
} 
catch(ArithmeticException e) 
{ 
System.out.println("arithmatic exception handled"); 
c=a/1; //alternate solution --> optional 
} 
 
 
System.out.println(c); 
System.out.println("gm"); 
 
 
 
} 
 
}