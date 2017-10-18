package javastudyday21;

public class ResourceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������Դ
		Resource1 r = new Resource1();
		//��������
		Input1 in  = new Input1(r);
		Output1 out = new Output1(r);
		//�����߳�·��
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		//�����߳�
		
		t1.start();
		t2.start();
		

	}

}
/*
 * �̼߳�ͨѶ��
 * ����߳��ڴ���ͬһ����Դ����������ȴ��ͬ��
 * 
 * �ȴ������ѻ���
 * �漰�ķ���
 * 1.wait������
 * 2.notify();���ѵȴ����е�һ���̡߳�
 * 3.notifyAll();�����̳߳������̡߳�
 * ��Щ���������붨����ͬ���С�
 * ��Ϊ��Щ���������ڲ����߳�״̬�ķ�����
 * ��������ȷ���ײ��������ĸ����ϵ��̡߳�
 * Ϊʲô�����̵߳ķ���wait notify notifyAll������Object���С�
 * ��Ϊ��Щ����ʱ��������������������������
 * 
 */
//��Դ
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
					r.name = "����";
					r.sex = "ŮŮŮŮŮ";
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
