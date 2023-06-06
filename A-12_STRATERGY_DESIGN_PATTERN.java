//Interface
package DesignPattern;

public interface PaymentMethod 
{
	public abstract void pay(double amount);
}

//Class
package DesignPattern;

import java.util.Scanner;

public class CreditCard implements PaymentMethod
{
	private String name;
	private double cardNumber;
	private int cvv;
	private String dateOfExpiry;

	Scanner sc = new Scanner(System.in);
	CreditCard()
	{
		System.out.println("Enter Name > > > ");
		this.name=sc.next();
		System.out.println("Enter Card Number > > > ");
		this.cardNumber=sc.nextDouble();
		System.out.println("Enter CVV > > > ");
		this.cvv=sc.nextInt();
		System.out.println("Enter Date of Expiry > > > ");
		this.dateOfExpiry=sc.next();
	}
	@Override
	public void pay(double amount)
	{
		System.out.println(amount + " Paid With Credit Card.");
	}
}

//Class
package DesignPattern;

import java.util.Scanner;

public class PayPal implements PaymentMethod 
{
	private String loginId;
	private String password;
	Scanner sc = new Scanner(System.in);
	PayPal()
	{
		System.out.println("Enter Login ID > > > ");
		this.loginId=sc.next();
		System.out.println("Enter Password > > > ");
		this.password=sc.next();
	}
	@Override
	public void pay(double amount) 
	{
		System.out.println(amount + " Paid using Paypal.");
	}
}

//Class
package DesignPattern;

import java.util.Scanner;

public class BitCoin implements PaymentMethod 
{
	private String walletId;
	private double walletNumber;
	private String walletPassword;
	Scanner sc = new Scanner(System.in);
	BitCoin()
	{
		System.out.println("Enter Wallet ID > > > ");
		this.walletId=sc.next();
		System.out.println("Enter Wallet Number > > > ");
		this.walletNumber=sc.nextDouble();
		System.out.println("Enter Password > > > ");
		this.walletPassword=sc.next();
	}
	@Override
	public void pay(double amount) 
	{
		System.out.println(amount + " Paid using Bitcoin.");
	}
}

//Class
package DesignPattern;

public class Order 
{
	private final PaymentMethod paymentGateway;
	private final double amount;
	public Order(double amount , PaymentMethod paymentGateway)
	{
		this.amount=amount;
		this.paymentGateway=paymentGateway;
	}
	public void process()
	{
		paymentGateway.pay(amount);
	}
}


//Main Class
package DesignPattern;

import java.util.Scanner;

public class DesignPattern 
{
	public static void main(String[] args) 
	{		
		double amount=0;
		int ch;
		Scanner sc = new Scanner(System.in);
		Order order;
		do
		{
			System.out.println("\nPay Using >>> \n1.Credit Card \n2.PayPal \n3.BitCoin \n4.Exit \n> > > ");
			ch=sc.nextInt();
			if(ch==1 || ch==2 || ch==3)
			{
				System.out.println("Enter Amount to Transfer > > > ");
				amount=sc.nextDouble();
			}
			switch(ch)
			{
				case 1:
					order = new Order(amount ,new CreditCard());
					order.process();
					System.out.println("Thank You For Shopping !");
					break;
					
				case 2:
					order = new Order(amount ,new PayPal());
					order.process();
					System.out.println("Thank You For Shopping !");
					break;
					
				case 3:
					order = new Order(amount ,new BitCoin());
					order.process();
					System.out.println("Thank You For Shopping !");
					break;
			}
		}while(ch!=4);
	}
}
