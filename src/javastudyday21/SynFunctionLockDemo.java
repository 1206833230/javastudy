/*
 * ���󣺴�����������ÿ���������д�Ǯÿ�δ�100������3�Ρ�
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
	 * �̰߳�ȫ��ԭ��
	 * 1.����߳��ڲ�����������ݡ�
	 * 2.�����������ݵ��̴߳����ж�����
	 * 
	 * ���˼·��
	 * ���ǽ���������������̴߳����װ�����������߳̽���ִ����Щ����ʱ ��
	 * ��������Ͳ�����ʹ�á�
	 * 
	 * ͬ�������ĸ�ʽ
	 * synchronized������
	 * {
	 *     ͬ������飻
	 * }
	 * ͬ���ô�������̵߳İ�ȫ���⡣
	 * ͬ���ı׶ˣ���Խ�����Ч������Ϊͬ������̵߳Ķ����ж�ͬ������
	 * 
	 * ͬ����ǰ�᣺�����ж���̲߳�ʹ��ͬһ������
	 * 
	 * 
	 * ͬ��������ʹ�õ�����this
	 * ͬ��������ͬ������������
	 * ͬ�����������̶���this��
	 *  
	 *  
	 * ͬ����������������Ķ���
	 */
/*
 * ����
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
	