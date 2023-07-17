package Collection; 
 
import java.util.ArrayList; 
import java.util.Iterator; 
import java.util.ListIterator; 
 
public class example1_ArrayList 
{ 
public static void main(String[] args) 
{ 
//ArrayList al=new ArrayList(15); //initial capacity =15 --> resizable 
 
ArrayList al=new ArrayList(); //by default capacity =10 
al.add("ganesh"); 
al.add(100); 
al.add('A'); 
al.add(65.5f); 
al.add("ganesh"); 
al.add(null); 
al.add(null); 
 
 
System.out.println(al); //[ganesh 100 A 65.5] 
System.out.println(al.size()); 
System.out.println(al.isEmpty()); //false 
System.out.println(al.contains(100)); //true 
System.out.println(al.get(1)); //100 
 
System.out.println(al); 
 
//add/insert info in between arraylist --> right shift operation 
al.add(4,500); 
System.out.println(al); 
 
 
//remove/delete info in between arraylist --> left shift operation 
al.remove(4); 
System.out.println(al); 
 
 
//update or modify 
al.set(3, 75.5); 
System.out.println(al); 
 
 
System.out.println("--------print arraylist data using iterator cursor----------"); 
 
Iterator itr = al.iterator(); 
 
while(itr.hasNext()) //true 
{ 
System.out.println(itr.next()); 
} 
 
 
System.out.println("--------print arraylist data using Listiterator cursor----------"); 
 
 
ListIterator litr = al.listIterator(); 
 
while(litr.hasNext()) 
{ 
System.out.println(litr.next()); 
} 
 
 
System.out.println("--------print arraylist data using for loop----------"); 
 
for(int i=0; i<=al.size()-1; i++) 
{ 
System.out.println(al.get(i)); 
} 
 
 
System.out.println("--------print arraylist data using foreach loop----------"); 
 
for(Object s1:al) 
{ 
System.out.println(s1); 
} 
 
 
 
 
} 
 
} 
 
