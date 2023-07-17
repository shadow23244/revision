package Contsructor; 
 
public class sample3 
{ 
//2. example of user defined constructor 
 
//step1: declaration 
int num1; //10 
int num2; //20 
 
 
//step2: initialization 
//user defined constructor -> provided by use 
//use1: to initialize global variable 
//use2: to copy/load all the members of class into object 
sample3() 
{ 
num1=10; 
num2=20; 
} 
 
 
//step3: usage 
public void addition() 
{ 
System.out.println(num1+num2); //30 
} 
 
public void multiplication() 
{ 
System.out.println(num1*num2); //10*20 = 200 
} 
 
 
 
public static void main(String[] args) 
{ 
 
sample3 s3=new sample3(); 
s3.addition(); //30 
s3.multiplication(); //200 
 
System.out.println("---------------------"); 
 
sample4 s4=new sample4(); 
s4.substraction(); //20 
 
 
} 
 
 
 
 
} 
 
 
 
 
 
