package javastudyday20;

public class ThreaDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �����̵߳���Ϊ�˿���һ��ִ��·����ȥ����ָ���Ĵ������������ʵ��ͬʱ���С�
		 * �����е�ָ������
		 * jvm���������̵߳������Ƕ������������С�
		 * ���Զ�����߳������������Ķ��أ�
		 * Thread�����������̣߳��߳�����Ҫ����ģ�����Thread��Ҳ�������������
		 * ��������ͨ��Thread���е�run���������֣�Ҳ����˵��run�������Ƿ�װ�Զ����߳���������ĺ�����
		 * run�����ж�������߳�Ҫ���е�������롣
		 * �����߳���Ϊ������ָ������,����ֻ�м̳�Thread�࣬����дrun������
		 * �����еĴ��붨����run�����м��ɡ�
		 * 1.
		 */
//		Thread t1 = new Thread();
		Demo2 d1 = new Demo2("����");
		Demo2 d2 = new Demo2("xiaoqiang");
		d1.start();
		for(int x=0;x<10;x++)
		{
		       System.out.println("haha...................."+Thread.currentThread().getName());
		}
		d2.start();
		System.out.println(4/0);

	}

}
/*
 * ��δ���һ���߳��أ�
 * �����̷߳�ʽһ���̳�Thread�ࡣ
 * ���裺
 * 1.����һ����̳�Thread��
 * 2.����Thread���е�run������
 * 3.ֱ�Ӵ���Thread��������󴴽��̡߳�
 * 4.����start���������̵߳����̵߳�����run����ִ�С�
 * 
 * ʵ��Runnable�ӿڵĺô���
 * 1.���̵߳�������̵߳������з�����������е�����װ��
 *   ������������˼�뽫����ķ�װ�ɶ���
 * 2.���ⵥ�̳еľ����ԡ�
 * ���Դ����̵߳ķ�ʽ�ڶ��ֽ�Ϊʵ�á�
 */
class Demo2 extends Thread
{
	private String name;
	Demo2(String name)
	{
		super(name);
		this.name = name;
	}
	public void run()
	{
		int[] arr = new int[3];
		System.out.println(arr[3]);
		for(int x = 0;x<10;x++)
		{
//			for(int y=-999999999;y<99999999;y++) {}
			System.out.println(name+"...x="+x+"...name="+Thread.currentThread().getName());
		}
	}
}
//����run�͵���start��ʲô����
