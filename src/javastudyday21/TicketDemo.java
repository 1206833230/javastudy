package javastudyday21;

public class TicketDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket t = new Ticket();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
//		Ticket t1 = new Ticket();
//		Ticket t2 = new Ticket();
//		Ticket t3 = new Ticket();
//		Ticket t4 = new Ticket();
//		
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
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
 */
class Ticket extends Thread
{
	private int num = 100;
	Object obj = new Object();
	public void run()
	{
		while(true)
		{
			synchronized(obj)
			{
			      if(num>0)
			   {
				     try {
					        Thread.sleep(10);
				         }
				      catch(InterruptedException e) {}
				
				       System.out.println(Thread.currentThread().getName()+"...sale..."+num--);
			   }
			}
		}
	}
}