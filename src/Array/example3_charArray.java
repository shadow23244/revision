package Array; 
 
public class example3_charArray 
{ 
public static void main(String[] args) 
{ 
char [] ar=new char[4]; 
 
ar[0]='A'; 
ar[1]='D'; 
ar[2]='B'; 
ar[3]='C'; 
 
System.out.println(ar[3]); //C 
System.out.println(ar.length); //4 
 
System.out.println("---print all data from String array--"); 
 
// for(int i=0; i<=3; i++) 
// { 
// System.out.println(ar[i]); 
// } 
 
for(int i=0; i<=ar.length-1; i++) 
{ 
System.out.println(ar[i]); 
} 
 
 
} 
 
} 
 
 
 
