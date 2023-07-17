package control_statements;

public class if_ifelse
{
	public static void main(String[] args) 
	{
		int a =10;
		
		if(a>10)
		{
			System.out.println("a is greater than 10");
		}
		else
		{
			System.out.println("a is less than 10");
		}
		
		int b=40;
		
		if(b>90)
		{
			System.out.println("b is greater than 90");
		}
		else if(b>80 && b<89)
		{
			System.out.println("b is greater than 80");
		}
		else if(b>1 && b<79)
		{
			System.out.println("b is greater than 1");
		}
		
	}

}
