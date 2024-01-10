package controlFlowStatements;

import java.util.Scanner;

public class SimpleIf 
{

	public static void main(String[] args) 
	{
		//Accept age from user and compare whether user is valid for voting
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("User is capable for voting");
		
		}
		
		System.out.println("Ended");

	}

}
