package controlFlowStatements;

import java.util.Scanner;

public class NestedIfDemo 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr three numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println(a + " is greater than " + b + c );
		
		}
		else if(b>a && b> c)
		{
			
			System.out.println(b + " is greater number " + a + " & " + c);
		}
		else
		{
			System.out.println(c + " is greater than " + a + " & " + b);
		
		}
		
		
		
		
	}

}
