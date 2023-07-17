package Access_Specifiers; 
 
public class sample1 
{ 
private int a; 
 
private sample1() 
{ 
a=10; 
} 
 
private void m1() 
{ 
System.out.println(a); 
} 
 
 
public static void main(String[] args) 
{ 
sample1 s1=new sample1(); 
s1.m1(); 
System.out.println(s1.a); 
} 
 
} 
 
 
 
 
