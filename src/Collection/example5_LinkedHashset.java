package Collection; 
 
import java.util.Iterator; 
import java.util.LinkedHashSet; 
 
public class example5_LinkedHashset 
{ 
public static void main(String[] args) 
{ 
LinkedHashSet lhs=new LinkedHashSet(); 
lhs.add("rahul"); 
lhs.add(100); 
lhs.add('A'); 
lhs.add(65.5f); 
lhs.add("rahul"); 
lhs.add(null); 
lhs.add(null); 
 
System.out.println(lhs); 
System.out.println(lhs.size()); 
System.out.println(lhs.isEmpty()); 
System.out.println(lhs.contains(100)); 
 
lhs.remove(100); 
System.out.println(lhs); 
 
System.out.println("-------print LinkedHashSet data using iterator cursor-------"); 
 
Iterator itr = lhs.iterator(); 
while(itr.hasNext()) 
{ 
System.out.println(itr.next()); 
} 
 
 
System.out.println("-------print LinkedHashSet data using for each loop-------"); 
 
for(Object s1:lhs) 
{ 
System.out.println(s1); 
} 
 
 
} 
 
} 
 
 
 
 
 
