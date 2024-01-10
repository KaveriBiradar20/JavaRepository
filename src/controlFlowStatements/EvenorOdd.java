package controlFlowStatements;

import java.util.Scanner;

public class EvenorOdd 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Entered number " + num + " is even number");
			
		}
		else
		{
			System.out.println("Entered number " + num + " is odd number");
		}
		

	}

}
