package fileHandlingDemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingDemo1 {

	public static void main(String[] args) throws IOException 
	{
		//To create file
		//File f1=new File(D:\StarAgileJPrograms\JavaSelenium1\JavaSessions + "\\MyFile.txt");
		File f1=new File(System.getProperty("user.dir")+"\\MyFile.txt");
		f1.createNewFile();
		System.out.println("New File is created");
		System.out.println("********");
		
		//To write data in file
		FileWriter wr=new FileWriter("MyFile.txt");
		wr.write("Hello all...\n Welcome to java Last Topic\n wishing you all the best");
		wr.write("\n lets start now with Selenium");
		System.out.println("File writing is completed");
		wr.close();
		
		//to read a file
		System.out.println("read file contents");
		Scanner sc=new Scanner(f1);
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
			
		}
		sc.close();
		//How to delete a file
		
		f1.delete();
		System.out.println("File is deleted");
		
	}

}
