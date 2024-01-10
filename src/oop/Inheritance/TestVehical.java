package oop.Inheritance;

public class TestVehical 
{

	public static void main(String[] args) 
	{
		BMW b1=new BMW();
		b1.autoEngine();
		b1.start();
		b1.start();
		b1.refule();
		b1.breakFeature();
		System.out.println("*******");
		b1.price();
		
		Car c1=new Car();
		c1.start();
		c1.refule();
		c1.stop();
		c1.breakFeature();
		c1.price();
		
		System.out.println("******");
		Audi a1=new Audi();
		a1.autoGear();
		a1.refule();
		a1.start();
		a1.stop();
		a1.breakFeature();
		a1.price();

	}

}
