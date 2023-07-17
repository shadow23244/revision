package Use_Of_Static_NonStic; 
 
public class sample 
{ 
public static void main(String[] args) 
{ 
 
Emp e1=new Emp(); 
e1.empName="Rajat"; 
e1.empID=100; 
// e1.empCEOName="abc"; 
Emp.empCEOName="abc"; 
 
Emp e2=new Emp(); 
e2.empName="Rohini"; 
e2.empID=101; 
// e2.empCEOName="abc"; 
Emp.empCEOName="abc"; 
 
Emp e3=new Emp(); 
e3.empName="rahul"; 
e3.empID=102; 
// e3.empCEOName="xyz"; 
Emp.empCEOName="xyz"; 
 
 
e1.showInfo(); 
e2.showInfo(); 
e3.showInfo(); 
 
 
} 
 
}