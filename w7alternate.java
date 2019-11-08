import java.util.*;
import java.io.*;

class BalanceException extends Exception
{
   public BalanceException()
	{
		System.out.println("Error : Insufficient Balance.");
	}
}

class BankAccount
{
   int anum;
   String name;
   double bal;

   void getentries(int anum,String name,double balance)
   {
        this.anum=anum;
	this.name=name;
	this.bal=bal;
   }

   double printentries()
   {
        System.out.println("Account Holder's Name :"+name);
	System.out.println("Account ID		  :"+anum);
	System.out.println("Account Balance	  :"+bal);
	return bal;
   }

   void withdraw(double wamount)
   {
	try
	{
	  if(wamount>bal)
		{
			throw new BalanceException();
		}
	  else
		{
		  System.out.println("Account Balance before withdrawal :"+bal);
		  bal=bal-wamount;
		  System.out.println("Account Balance after withdrawal  :"+bal);
		}
	}

	catch(BalanceException e)
	{
		System.out.println("Sorry, your account has insufficient balance.");
	}

   }

   void deposit(int damount)
   {
	System.out.println("Account Balance before deposit :"+bal);
	bal=bal+damount;
	System.out.println("Account Balance after deposit  :"+bal);
   }
}


public class w7alternate
{
  public static void main(String args[])
  {
	Scanner s = new Scanner(System.in);
	BankAccount a = new BankAccount();
	a.getentries(18534,"Pranav",10000);
	a.deposit(2000);
	System.out.println("Please enter an amount to be withdrawn.");
	double x = s.nextDouble();
	a.withdraw(x);
  }
}
	
	
	







	
