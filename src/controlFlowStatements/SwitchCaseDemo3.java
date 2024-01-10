package controlFlowStatements;

import java.util.Scanner;

public class SwitchCaseDemo3 
{

	public static void main(String[] args) 
	{

       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a Browser name");
       String browser=sc.nextLine();
       
       switch (browser.toLowerCase()) 
       {
	    case "firefox":
		    System.out.println("Application Running on Firefox");
		    break;
		
		case "chrome":
			System.out.println("Application Running on Chrome");
			break;
			
		case "edge":
				System.out.println("Application Running on Edge");
				break;

	default:
		System.out.println("Enter valid Browser");
		break;
	}


       
	}
	
}
