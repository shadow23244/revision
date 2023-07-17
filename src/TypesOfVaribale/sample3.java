package TypesOfVaribale; 
 
public class sample3 
{ 
//1. example of static global variable 
 
 
static int a=10; //static-> global variable from same class 
 
 
 
public static void main(String[] args) 
{ 
System.out.println(a); // static global variable call from same class -->variableName 
 
System.out.println(sample4.b); // static global variable call from diff class -->classname.variableName 
 
 
} 
 
 
public static void m1() 
{ 
System.out.println(a); 
} 
 
public void m2() 
{ 
System.out.println(a); 
} 
 
 
 
} 
 
 
 
 
 
 
