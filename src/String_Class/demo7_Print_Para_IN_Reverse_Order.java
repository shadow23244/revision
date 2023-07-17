package String_Class; 
 
public class demo7_Print_Para_IN_Reverse_Order 
{ 
public static void main(String[] args) 
{ 
 
String s1="my name is rahul"; 
 
String [] ar=s1.split(" "); //{my name is rahul} 
 
 
for(int i=ar.length-1; i>=0; i--) 
{ 
System.out.print(ar[i]+" "); 
} 
 
} 
 
} 
 
 
 
