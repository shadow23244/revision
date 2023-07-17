package Array; 
 
public class example1_intArray 
{ 
public static void main(String[] args) 
{ 
 
//step1: array declaration 
int [] ar=new int[5]; // array size 
 
//step2: array initialization 
ar[0]=40; // array index 
ar[1]=50; 
ar[2]=10; 
ar[3]=30; 
ar[4]=20; 
 
//step3: array usage 
System.out.println(ar[0]); //40 
System.out.println(ar.length); //5 
 
 
System.out.println("--print all info in array--"); 
 
// // 0 5<=4 
// for(int i=0; i<=4; i++) 
// { // 4 
// System.out.println(ar[i]); //40 50 10 30 20 
// } 
 
 
for(int i=0; i<=ar.length-1; i++) 
{ 
System.out.println(ar[i]); 
} 
 
} 
 
} 
 
 
 
