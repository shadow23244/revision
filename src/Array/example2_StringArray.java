package Array; 
 
public class example2_StringArray 
{ 
public static void main(String[] args) 
{ 
 
String [] ar=new String[4]; 
 
ar[0]="rahul"; 
ar[1]="ganesh"; 
ar[2]="mahesh"; 
ar[3]="suresh"; 
 
System.out.println(ar[3]); //suresh 
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
 
 
 
