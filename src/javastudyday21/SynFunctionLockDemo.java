/*
 * 需求：储户，两个，每个都到银行存钱每次存100，共存3次。
 */

package javastudyday21;

public class SynFunctionLockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Ticket2 t = new Ticket2();
//			Class clazz = t.getClass();
			
			Thread t1 = new Thread(t);
			Thread t2 = new Thread(t);
//			Thread t3 = new Thread(t);
//			Thread t4 = new Thread(t);
		
			t1.start();
			try{Thread.sleep(10);}catch(InterruptedException e) {}
			t.flag = false;
			t2.start();
//			t3.start();
//			t4.start();
			
//			Ticket t1 = new Ticket();
//			Ticket t2 = new Ticket();
//			Ticket t3 = new Ticket();
//			Ticket t4 = new Ticket();
//			
//			t1.start();
//			t2.start();
//			t3.start();
//			t4.start();
		}

	}
	/*
	 * 线程安全的原因：
	 * 1.多个线程在操作共享的数据。
	 * 2.操作共享数据的线程代码有多条。
	 * 
	 * 解决思路：
	 * 就是将多条操作共享的线程代码封装起来，当有线程进入执行这些代码时 ，
	 * 其他代码就不可以使用。
	 * 
	 * 同步代码块的格式
	 * synchronized（对象）
	 * {
	 *     同步代码块；
	 * }
	 * 同步好处：解决线程的安全问题。
	 * 同步的弊端：相对降低了效力，因为同步外的线程的都会判断同步锁。
	 * 
	 * 同步的前提：必须有多个线程并使用同一个锁。
	 * 
	 * 
	 * 同步函数的使用的锁是this
	 * 同步函数和同步代码块的区别：
	 * 同步函数的锁固定是this。
	 *  
	 *  
	 * 同步代码块的锁是任意的对象。
	 */
/*
 * 死锁
 */
	class Ticket2 implements Runnable
	{
		private static int num = 100;
		Object obj = new Object();
		boolean flag = true;
		public  void run()
		{
			if(flag){
			while(true)
			{
				synchronized(obj)
				{
					show();
//				      if(num>0)
//				   {
//					     try{Thread.sleep(10);}catch(InterruptedException e) {}
//					
//					     System.out.println(Thread.currentThread().getName()+"...obj..."+num--);
//				   }
				}
			}
		  }		
			 else
    		     while(true)
					this.show();
		}
		public synchronized void show()
		{
			synchronized(obj)
			{
				if(num>0)
					{
				        try{Thread.sleep(10);}catch(InterruptedException e) {}
			
			            System.out.println(Thread.currentThread().getName()+"...Function..."+num--);
			          }
			
			}
			
		}
	}
	