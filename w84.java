class BankAccount
{
   int id;
   double bal;

   void getdata(int id, double bal)
   {
this.id=id;
this.bal=bal;
   }

   void printdata()
   {
System.out.println("ID :"+id);
System.out.println("Balance :"+bal);
   }

   synchronized void withdraw(double w)
   {
System.out.println("Balance before withdrawal:"+bal);
bal=bal-w;
System.out.println("Balance after withdrawal:"+bal);
   }

   synchronized void deposit(double d)
   {
System.out.println("Balance before deposit:"+bal);
bal=bal+d;
System.out.println("Balance after deposit:"+bal);
   }
}

class DepositThread extends Thread
{
   BankAccount ba = new BankAccount();
   DepositThread(BankAccount ba)
{
this.ba=ba;
}
   public void run()
{
ba.deposit(2000);
}
}

class WithdrawThread extends Thread
{
   BankAccount ba = new BankAccount();
   WithdrawThread(BankAccount ba)
{
this.ba=ba;
}
   public void run()
{
ba.withdraw(5000);
}
}

public class MyThread
{
  public static void main(String args[])
  {
BankAccount ba = new BankAccount();
ba.getdata(99999,10000);
DepositThread  a = new DepositThread(ba);
WithdrawThread b = new WithdrawThread(ba);
        b.start();
a.start();
   }
}
