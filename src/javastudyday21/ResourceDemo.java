package javastudyday21;

public class ResourceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������Դ
		Resource r = new Resource();
		//��������
		Input in  = new Input(r);
		Output out = new Output(r);
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
 */
//��Դ
class Resource
{
	String name;
	String sex;
}
class Input implements Runnable
{
	Resource r ;//= new Resource();
//	Object obj = new Object();
	Input(Resource r)
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
			}
			x = (x+1)%2;
		}
	}
}
class Output implements Runnable
{
	Resource r ;//= new Resource();
	
	Output(Resource r)
	{
		this.r = r;
	}
	public void run()
	{	 
		while(true)
		  {
		     synchronized(r)
		     {
		    	 System.out.println(r.name+"....."+r.sex);
		     }
		
		   }
		 
	}
}