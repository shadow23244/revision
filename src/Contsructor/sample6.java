package Contsructor; 
 
public class sample6 
{ 
int num3; //4 
int num4; //3 
 
//user defined --> with parameter constructor 
sample6(int c, int d) //c=4, d=3 
{ 
num3=c; //4 //assign local variable info into global variable 
num4=d; //3 
} 
 
 
public void substraction() 
{ 
System.out.println(num3-num4); //4-3 =1 
} 
 
}