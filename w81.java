class Test
{
	boolean flag=false;
	public synchronized void Odd(int num)
	{
		if(flag)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				
			}
		}
		System.out.println(num);
		flag=true;
		notify();
	}
	public synchronized void Even(int num)
	{
		if(!flag)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				
			}
		}
		System.out.println("\t\t"+num);
		flag=false;
		notify();
	}
}
class T1 extends Thread
{
	Test m;
	public T1(Test m1)
	{
		this.m=m1;
	}
	public void run()
	{
		for(int i=1;i<10;i+=2)
		{
			m.Odd(i);
		}
	}
}
class T2 extends Thread
{
	Test m;
	public T2(Test m2)
	{
		this.m=m2;
	}
	public void run()
	{
		for(int i=2;i<=10;i+=2)
		{
			m.Even(i);
		}
	}
}
class w81
{
	public static void main(String arg[])
	{
		Test m=new Test();
		T1 odd=new T1(m);
		T2 even=new T2(m);
		odd.start();
		even.start();
	}
}
