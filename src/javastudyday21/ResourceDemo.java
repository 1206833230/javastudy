package javastudyday21;

public class ResourceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建资源
		Resource r = new Resource();
		//创建任务
		Input in  = new Input(r);
		Output out = new Output(r);
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
 */
//资源
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
				r.name = "丽丽";
				r.sex = "女女女女女";
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