package Star_Pattern; 
public class Pattern13 
{ 
public static void main(String[] args) 
{ 
//** 
//* 
//** 
//* 
//** 
//* 
//** 
 
 
int star=4; 
for(int i=1; i<=7; i++) //outer for loop --> rows 
{ 
for(int j=1; j<=star; j++) 
{ 
System.out.print("*"); 
} 
System.out.println(); 
 
if(i<4) 
{ 
star--; 
} 
else 
{ 
star++; 
} 
} 
} 
 
} 
 
 
 
 
 
 

 
