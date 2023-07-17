package Collection; 
 
import java.util.TreeSet; 
 
public class example7_generic1 
{ 
public static void main(String[] args) 
{ 
 
TreeSet<Integer> tr=new TreeSet<Integer>(); 
 
tr.add(100); 
tr.add(600); 
tr.add(200); 
tr.add(400); 
 
for(Integer s1:tr) 
{ 
System.out.println(s1); 
} 
 
} 
 
} 
 
 
 
 
 
 
