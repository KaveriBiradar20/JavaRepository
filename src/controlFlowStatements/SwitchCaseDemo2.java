package controlFlowStatements;

import java.util.Scanner;

public class SwitchCaseDemo2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character");
		String str=sc.nextLine();
		char ch=str.charAt(0);

     // char ch='r';   
    		  switch (ch) 
    		  {
			case 'a':
				System.out.println(ch+ " is vowel");
				break;
			case 'e':
				System.out.println(ch+ " is vowel");
				break;
			case 'i':
				System.out.println(ch+ " is vowel");
				break;
			case 'o':
				System.out.println(ch+ " is vowel");
				break;
			case 'u':
				System.out.println(ch+ " is vowel");
				break;

			default:
				System.out.println(ch + " is not a vowel");
				break;
			}

	}

}
