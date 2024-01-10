package arrayDemo;

public class Array_1DDemo {

	public static void main(String[] args) 
	{
//		int sid[]=new int[5];
//		sid[0]=101;
//		sid[1]=102;
//		sid[2]=103;
//		sid[3]=104;
//		sid[4]=105;
		
//		System.out.println("Length of the Array " + sid.length);
//		System.out.println(sid[2]);
		
		//Dclaring in Literal way
		
		int sid[]= {101,102,103,104,105};
		System.out.println("Length of array: "+sid.length);//5
		
		System.out.println(sid[3]);//104
		
		System.out.println(sid[0]);//101
		
		//System.out.println(sid[5]);//ArrayIndexOutOfBoundsException
		
		
		// System.out.println(sid[5]); //ArrayindexOutOfBoundsException
		
		for (int i=0; i<sid.length; i++)
		{
			System.out.println(sid[i]);
		}
		
		System.out.println("*********Iterate array using for-each loop ");
		
		for(int var : sid)
		{
			System.out.println(var);
		}
		
		System.out.println("*************");
		
		
		String sname[]=new String[3];
		sname[0]="kaveri";
		sname[1]="aditi";
		sname[2]="Shreya";
		
		System.out.println("Number of students " + sname.length);
		System.out.println(sname[2]);
		
		for(int i=0; i<sname.length; i++)
		{
			System.out.println(sname[i]);
		}
		
		System.out.println("*************");
		
		double marks[]=new double[3];
		marks[0]=45.67;
		marks[1]=78.23;
		marks[2]=99.12;
		System.out.println("Total Marks are : " +(marks[0]+marks[1]+marks[2]));
		for(int i=0;i<marks.length; i++)
		{
			System.out.println(marks[i]);
		}
		
		

	}

}
