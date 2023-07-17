package String_Class; 
 
public class demo5 
{ 
public static void main(String[] args) 
{ 
String s1="velocity"; 
String s2="ABCD"; 
String s3="abcd"; 
String s4="my name is abc"; 
String s6=""; 
String s7="abcabab"; 
String s8="Tejashree"; 
String s9="java classes"; 
 
 
System.out.println(s4.substring(3, 7)); //3-6 name 
System.out.println(s1.substring(3)); //ocity 
 
System.out.println(s2.concat(s3)); // ABCDabcd 
System.out.println(s2+s3); //ABCD+abcd = ABCDabcd 
 
System.out.println(s9.replace("java", "selenium")); //selenium classes 
 
System.out.println("--------"); 
 
System.out.println(s1.length()); //8 
System.out.println(s1.toUpperCase()); //VELOCITY 
System.out.println(s2.toLowerCase()); //abcd 
 
System.out.println(s2.equals(s3)); //false 
System.out.println(s2.equalsIgnoreCase(s3)); //true 
System.out.println(s4.contains("name")); //true 
 
System.out.println("------"); 
System.out.println(s4.isEmpty()); //false 
System.out.println(s1.charAt(7)); //y 
 
System.out.println(s7.indexOf('b')); //1 
System.out.println(s7.lastIndexOf('a')); //5 
 
System.out.println("-----"); 
 
System.out.println(s8.startsWith("Te")); //true 
System.out.println(s8.endsWith("ee")); //true 
 
} 
 
} 
 
 
 
 
 
