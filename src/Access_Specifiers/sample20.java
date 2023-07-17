package Access_Specifiers; 
 
public class sample20 
{ 
protected int a; 
 
protected sample20() 
{ 
a=20; 
} 
 
protected void name() 
{ 
System.out.println(a); 
} 
 
public static void main(String[] args) 
{ 
 
sample20 s20=new sample20(); 
s20.name(); 
System.out.println(s20.a); 
} 
 
} 
 
 
 
