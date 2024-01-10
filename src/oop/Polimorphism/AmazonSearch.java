package oop.Polimorphism;

public class AmazonSearch 
{
       public void search(String name)
       {
    	   System.out.println("search product by name " + name);
       }
       
       public void search(int price)
       {
    	   System.out.println("search product with price " + price);
       }
       public void search(String bname, String name)
       {
    	   System.out.println("search product by brand name " + bname + " & Product name" + name);
       }
       public void search(String name,int price)
       {
    	   System.out.println("search product by name " + name + " & Price " + price);
       }

}
