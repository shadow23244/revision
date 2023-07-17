package Collection; 
 
import java.util.ArrayList; 
import java.util.Enumeration; 
import java.util.Iterator; 
import java.util.ListIterator; 
import java.util.Vector; 
 
public class example2_Vector 
{ 
public static void main(String[] args) { 
 
Vector V = new Vector(); //by default capacity =10 
V.add("ganesh"); 
V.add(100); 
V.add('A'); 
V.add(65.5f); 
V.add("ganesh"); 
V.add(null); 
V.add(null); 
 
 
System.out.println(V); //[ganesh 100 A 65.5] 
System.out.println(V.size()); 
System.out.println(V.isEmpty()); //false 
System.out.println(V.contains(100)); //true 
System.out.println(V.get(1)); //100 
 
System.out.println(V); 
 
//add/insert info in between Vector --> right shift operation 
V.add(4,500); 
System.out.println(V); 
 
 
//remove/delete info in between Vector --> left shift operation 
V.remove(4); 
System.out.println(V); 
 
 
//update or modify 
V.set(3, 75.5); 
System.out.println(V); 
 
 
System.out.println("--------print Vector data using iterator cursor----------"); 
 
Iterator itr = V.iterator(); 
 
while(itr.hasNext()) //true 
{ 
System.out.println(itr.next()); 
} 
 
 
System.out.println("--------print Vector data using Listiterator cursor----------"); 
 
 
ListIterator litr = V.listIterator(); 
 
while(litr.hasNext()) 
{ 
System.out.println(litr.next()); 
} 
 
 
System.out.println("--------print Vector data using for loop----------"); 
 
for(int i=0; i<=V.size()-1; i++) 
{ 
System.out.println(V.get(i)); 
} 
 
 
System.out.println("--------print Vector data using foreach loop----------"); 
 
for(Object s1:V) 
{ 
System.out.println(s1); 
} 
 
 
System.out.println("--------print Vector data using enumeration cursor----------"); 
 
 
Enumeration enu = V.elements(); 
 
while(enu.hasMoreElements()) 
{ 
System.out.println(enu.nextElement()); 
} 
 
} 
 
} 
 
 
 
 
 
