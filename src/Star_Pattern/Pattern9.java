package Star_Pattern; 
 
public class Pattern9 
{ 
public static void main(String[] args) 
{ 
// * 
// ** 
// * 
//** 
 
int space=3; 
int star=1; 
 
// 5<=4 
for(int i=1; i<=4; i++) 
{ 
// 1<=0 
for(int j=1; j<=space; j++) 
{ 
System.out.print(" "); 
} 
// 1<=4 
for(int j=1; j<=star; j++) 
{ 
System.out.print("*"); 
} 
System.out.println(); 
 
space--; //0 
star++; //4 
} 
 
} 
 
} 
 
 
 
 
