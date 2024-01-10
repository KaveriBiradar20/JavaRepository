package controlFlowStatements;

import java.util.Scanner;

public class CheckforGrade 
{

	public static void main(String[] args) 
	{
		//Using Simple Nest if
//     int marks=80;
//		
//		if(marks>=90)
//		{
//			if(marks>=95)
//			{
//				System.out.println("A++");
//			}
//			else
//			{
//				System.out.println("A");
//			}
//		}else
//		{
//			System.out.println("B");
//		}
//		
//		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your obtained Marks");
		int marks=sc.nextInt();
		if(marks>90)
		{
			System.out.println("Congrats you got A Grade ");
			
		}
		else if(marks>=95)
		{
			System.out.println("Congrats You got A++ Grade");
			
		}
		
		else if(marks<90 && marks>85)
		{
			System.out.println("you persued B grade");
		}
		else
			System.out.println("YOU PASSED");

	}

}
