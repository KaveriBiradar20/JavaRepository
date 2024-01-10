package controlFlowStatements;

import java.util.Scanner;

public class NestedIf_BrowserDemo 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Browser name");
		String Browsername= sc.nextLine();
		
		if(Browsername.equalsIgnoreCase("chrome"))
		{
			System.out.println("Applicatin is running on " + Browsername);
		}
		else if(Browsername.equalsIgnoreCase("Firefox"))
		{
			System.out.println("Applicatin is running on " + Browsername);
		}
		else if(Browsername.equalsIgnoreCase("edge"))
		{
			System.out.println("Applicatin is running on " + Browsername);
		}
		else
		{
			System.out.println("Write valid name for Browser");
		}
	}

}
