 
package Contsructor; 
 
public class sample7 
{ 
//example4: user defined with parameter -> multiple constructor --> constructor overloading 
 
int num1; 
int num2; 
String name; //rahul 
 
 
//user defiend --->without parameter constructor 
sample7() 
{ 
num1=10; 
num2=20; 
} 
 
//user defiend --->with parameter(int ,int) constructor 
sample7(int a, int b) 
{ 
num1=a; 
num2=b; 
} 
 
//user defined with parameter(String) constructor 
sample7(String s1) //s1="rahul" 
{ 
name = s1; //rahul 
} 
 
 
public void studentName() 
{ 
System.out.println(name); 
} 
 
 
 
public void addition() 
{ 
System.out.println(num1+num2); 
} 
 
 
public static void main(String[] args) 
{ 
 
sample7 s7=new sample7(); 
s7.addition(); //30 
 
System.out.println("---"); 
 
sample7 s8=new sample7(5, 6); 
s8.addition(); //11 
 
System.out.println("---"); 
 
sample7 s9=new sample7("rahul"); 
s9.studentName(); 
} 
 
 
} 
 
 
 
 
