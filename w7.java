import java.util.*;
class ExceptionHandling extends Exception
{
String name,type;
long acno;
double bal;
ExceptionHandling(String n,long an,String t,double b)
{
name=n;
bal=b;
acno=an;
type=t;
}
ExceptionHandling(String msg)
{
    super(msg);
}
void deposit(double d)
{
bal+=d;
System.out.println("Balance Updated!");
System.out.println("Current Balance = "+bal);
}
void withdraw(double w)
{
    try
    {
        if(w<bal)
        {
            bal-=w;
            System.out.println("Balance Updated!");
            System.out.println("Current Balance = "+bal);
        }
        else
        {
            ExceptionHandling eh = new ExceptionHandling("Insufficient Balance in the Account");
            throw eh;
        }
    }
    catch(ExceptionHandling eh)
    {
        System.out.println("Error: "+eh.getMessage());
    }
}
void display()
{
System.out.println("Name :"+name);
System.out.println("Account Number :"+acno);
System.out.println("Type of Account :"+type);
System.out.println("Balance :"+bal);
}
}
class w7
{
public static void main(String arg[])
{
int c;
System.out.println("Enter name,account number,type of account,minimum balance");
Scanner s= new Scanner(System.in);
String n=s.nextLine();
long an=s.nextLong();
String t=s.next();
double b=s.nextDouble();
ExceptionHandling ba = new ExceptionHandling(n,an,t,b);
do
{
System.out.println("1 : Deposit\n2 : Withdraw\n3 : Display\n4 : Exit\nEnter your choice");
c=s.nextInt();
switch(c)
{
case 1 :System.out.println("Enter amount to be deposited");
double d=s.nextDouble();
ba.deposit(d);
break;
case 2 :System.out.println("Enter amount to be withdrawn");
double w=s.nextDouble();
ba.withdraw(w);
break;
case 3 :ba.display();
break;
case 4:break;
default:System.out.println("INVALID INPUT");
}
}while(c!=4);
}
}
