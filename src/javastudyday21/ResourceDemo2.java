package javastudyday21;

public class ResourceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建资源
		Resource1 r = new Resource1();
		//创建任务
		Input1 in  = new Input1(r);
		Output1 out = new Output1(r);
		//创建线程路径
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		//开启线程
		
		t1.start();
		t2.start();
		

	}

}
/*
 * 线程间通讯：
 * 多个线程在处理同一个资源，但是任务却不同。
 * 
 * 等待、唤醒机制
 * 涉及的方法
 * 1.wait（）；
 * 2.notify();唤醒等待集中的一条线程。
 * 3.notifyAll();唤醒线程池所有线程。
 * 这些方法都必须定义在同步中。
 * 因为这些方法是用于操作线程状态的方法。
 * 都必须明确到底操作的是哪个锁上的线程。
 * 为什么操作线程的方法wait notify notifyAll定义在Object类中。
 * 因为这些方法时监视器方法。监视器就是锁。
 * 
 */
//资源
class Resource1
{
	String name;
	String sex;
	boolean flag = false;
}
class Input1 implements Runnable
{
	Resource1 r ;//= new Resource();
//	Object obj = new Object();
	Input1(Resource1 r)
	{
		this.r = r;
	}
	public void run()
	{
		int x = 0;
		while(true)
		{
			synchronized(r)
			{
				if(r.flag)
					try{r.wait();}catch(InterruptedException e) {}
				if(x==0)
				{
					
					r.name = "mike";
					r.sex = "nan";

				}
				else 
				{
					r.name = "丽丽";
					r.sex = "女女女女女";
				}
				r.flag = true;
				r.notify();
				
			
			}
			x = (x+1)%2;
		}
	}
}
class Output1 implements Runnable
{
	Resource1 r ;//= new Resource();
	
	Output1(Resource1 r)
	{
		this.r = r;
	}
	public void run()
	{	 
		while(true)
		  {
		     synchronized(r)
		     {
		    	 if(!r.flag)
		    		 try{r.wait();}catch(InterruptedException e) {}
		    	 System.out.println(r.name+"....."+r.sex);
		    	 r.flag = false;
		    	 r.notify();
		     }
		
		   }
		 
	}
}
