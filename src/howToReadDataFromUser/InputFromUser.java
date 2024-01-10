package howToReadDataFromUser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) throws IOException
	{
		// technique no. 1: read()
		
		/*
		 * System.out.println("Enter your age :" );//i entered 22, it reads only single
		 * character that is it read only 2 and Prints ASCII of 2
		 * 
		 * int age=System.in.read();
		 * 
		 * 
		 * System.out.println(age);
		 */
		
		// Technique no. 2: BufferedReader Class
		
		/*
		 * System.out.println("Enter your age: "); InputStreamReader ir=new
		 * InputStreamReader(System.in); BufferedReader br= new BufferedReader(ir);
		 * String data=br.readLine(); int age=Integer.parseInt(data);
		 * System.out.println(age);
		 */
		
		//Technique no. 3: Scanner class --Most recommended way
		
		System.out.println("Enter your age :");
		
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		System.out.println(age);
		   
		         
		
		
	}

}
