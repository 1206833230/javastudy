package javastudyday21;

public class DeadLockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test a = new Test(true);
		Test b = new Test(false);
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		
		t1.start();
		t2.start();
		
		

	}

}
class Test implements Runnable
{
	private boolean flag;
	Test(boolean flag)
	{
		this.flag = flag;
	}
	public void run()
	{
		if(flag)
		{
			synchronized(MyLock.locka)
			{
				System.out.println(Thread.currentThread().getName()+"..if  locka..");
				synchronized(MyLock.lockb)
				{
					System.out.println(Thread.currentThread().getName()+"..if  lockb..");
				}
			}
		}
		else
		{
			while(true)
			    synchronized(MyLock.lockb)
			    {
			    	System.out.println(Thread.currentThread().getName()+"..if  lockb..");
				    synchronized(MyLock.locka)
				    {
				    	System.out.println(Thread.currentThread().getName()+"..if  locka..");
				    }
			     }
		}
	}
}
class MyLock
{
	public static final Object locka = new Object();
	public static final Object lockb = new Object();
}
	