package TypesOfVaribale; 
 
public class sample5 
{ 
 
//2. example of non-static global variable 
 
 
int c=30; //Non-static global variable 
 
 
public static void main(String[] args) 
{ 
//1. non-static global variable call from same class 
sample5 s5=new sample5(); //A. create object of same class 
System.out.println(s5.c); //B. objectName.variableName 
 
//2. non-static global variable call from diff class 
sample6 s6=new sample6(); //A. Create object of diff class 
System.out.println(s6.d); //B. objectName.variableName 
 
} 
 
 
public static void m3() 
{ 
sample5 s7=new sample5(); 
System.out.println(s7.c); 
} 
 
 
public void m4() 
{ 
System.out.println(c); 
} 
 
 
 
} 
 
 
 
 
 
