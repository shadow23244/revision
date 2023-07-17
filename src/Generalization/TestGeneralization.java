package Generalization; 
 
public class TestGeneralization 
{ 
public static void main(String[] args) 
{ 
System.out.println("--Features of Jio Simcard--"); 
Jio j=new Jio(); 
j.sms(); 
j.audioCAlling(); 
j.internet(); 
j.newFeatureA(); 
 
System.out.println(); 
System.out.println("--Features of VI Simcard--"); 
VI v=new VI(); 
v.sms(); 
v.audioCAlling(); 
v.internet(); 
v.newFeatureB(); 
 
System.out.println(); 
System.out.println("--Features of Airtel Simcard--"); 
Airtel a=new Airtel(); 
a.sms(); 
a.audioCAlling(); 
a.internet(); 
a.newFeatureC(); 
 
} 
 
} 