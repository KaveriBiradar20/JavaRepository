package controlFlowStatements;

import java.util.Scanner;

public class PositiveNumber 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		
		if(num>0)
		{
			System.out.println("Entered number " + num + " is Positive Number");
		}
		else
		{
			System.out.println("Entered number " + num + " is Negative Number");
		}
		


	}

}
