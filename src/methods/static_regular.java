package methods;

public class static_regular 
{
	public static void a1() 
	{
		System.out.println("hello, good morning");
	}
	
	public static void main(String[] args) 
	{
		a1();
		
		System.out.println("-------------------------------");
		nonstatic_regular a=new nonstatic_regular();
		System.out.println("calling non static a1 mehod from different class");
		a.a1();
	}

}
