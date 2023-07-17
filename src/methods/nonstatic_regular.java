package methods;

public class nonstatic_regular 
{
	public void a1() 
	{
		System.out.println("calling non static regular method a1 from main method");
	}
	
	public void a2(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void a3(String a, char b)
	{
		System.out.println(a+" "+b);
	}
	
	public static void main(String[] args) 
	{
		nonstatic_regular a=new nonstatic_regular();
		a.a1();
		a.a2(20, 30);		
		a.a3("hello", 'a');
		System.out.println("-------------------------------------");
		
		static_regular v=new static_regular();
		System.out.println("calling a1 from different class");
		v.a1();
		
		float a1= 14.2f;
		double a3= 14.2;
		
	}

}
