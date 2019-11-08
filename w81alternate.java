class even extends Thread
{
   final int n = 10;
   public void run()
   {
	System.out.println("This is the First Thread, and prints even numbers.");
	for(int i=0;i<=n;i++)
	{
	    if(i%2==0)
		System.out.println(i);
	}
	System.out.println("_______________________________________________");

    }
}

class odd extends Thread
{
  int n=10;
  public void run()
   {
	System.out.println("This is the Second Thread, and prints odd numbers.");
	for(int i=0;i<=n;i++)
	{
		if(i%2!=0)
			System.out.println(i);
	}
	System.out.println("_______________________________________________");
    }
}

public class w81alternate
{
  public static void main(String args[])
  {
	odd o  = new odd();
	even e = new even();
	try
	{
		e.start();
		e.join();
		o.start();		 
	}
	catch(InterruptedException ie)
	{
		
	}
   }
}
