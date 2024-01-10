package loopPrograms;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int temp=num;
		int r, rev=0; 
		while(num>0)
		{
			r=num%10;
			num=num/10;
			rev=rev*10+r;
		}
		System.out.println(" the reverse number of " + temp + " is " + rev );
		



	}

}
