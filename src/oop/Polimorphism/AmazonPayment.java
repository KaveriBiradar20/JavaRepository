package oop.Polimorphism;

public class AmazonPayment 
{
	
 public void payment(int cash)
 {
	System.out.println("User is doing payment on COD " + cash); 
	System.out.println("------------------------------");
 }
 
 public void payment(String upi, int price)
 {
	System.out.println("User is doing payment by UPI " + upi +"\n Amount to be paid " + price);
	System.out.println("------------------------------");
 }
 public void payment(int amazonpay, String voucher)
 {
	System.out.println("User is doing payment by Amazonpay " + amazonpay+ "\n Enter the Promocode to check offer" + voucher);
	System.out.println("------------------------------");
 }
 public void payment(String dcard,long cnum, int amt, int cvv)
 {
	System.out.println("User is doing payment by debitcard \nSelect the debit card " +dcard+ "\nEnter the card number " + cnum + "\nEnter the amount to be pay " + amt +"\nEnter the cvv " + cvv); 
	System.out.println("------------------------------"); 
 }
}
