package String_Class; 
 
public class demo6 
{ 
public static void main(String[] args) 
{ 
 
String s1="my name is rahul"; 
 
String [] ar = s1.split(" "); //{my(0) name(1) is(2) rahul(3)} 
 
System.out.println(ar[1]); //name 
System.out.println(ar.length); //4 
 
 
System.out.println("--print all data from array---"); 
 
for(int i=0; i<=ar.length-1; i++) 
{ 
System.out.println(ar[i]); 
} 
 
 
 
 
} 
 
} 
 
 
 
 
 
