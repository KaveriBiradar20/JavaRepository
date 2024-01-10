package oop.Polimorphism;

public class RunTimePolyDemo {

	public static void main(String[] args) 
	{
		Parent p1=new Parent();
		p1.color();
		System.out.println("*************");
		Child c1=new Child();
		c1.color();
		System.out.println("**********");
		Parent p2=new Child();
		p2.color(); 
	}

}
