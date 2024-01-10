package controlFlowStatements;

import java.util.Scanner;

public class CheckForVowelChar 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		String str=sc.nextLine();
		char ch=str.charAt(0);
		//Nested if
		/*		if(ch=='a')
				{
					System.out.println(ch+" is a vowel");
				}else if(ch=='e')
				{
					System.out.println(ch+" is a vowel");
				}else if(ch=='i')
				{
					System.out.println(ch+" is a vowel");
					
				}else if(ch=='o')
				{
					System.out.println(ch+" is a vowel");
				}else if(ch=='u')
				{
					System.out.println(ch+" is a vowel");
				}else
				{
					System.out.println(ch+" is  not a vowel");
				}
		*/
		char v1='a', v2='e', v3='i',v4='o',v5='u';
		char v6='A', v7='E', v8='I', v9='O', v10='U';
		
		if(ch==v1 ||ch==v2 ||ch==v3 ||ch==v4 ||ch==v5 ||ch==v6 ||ch==v7 ||ch==v8 ||ch==v9 ||ch==v10 )
		{
			System.out.println("Entered Character " + ch + " is vowel");
		}
		else
		{
			System.out.println("Entered Character " + ch + " is not vowel");
		}
		


	}

}
