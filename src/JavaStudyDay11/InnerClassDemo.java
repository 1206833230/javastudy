package JavaStudyDay11;

public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out = new Outer();
		out.method();
		//ֱ�ӷ����ⲿ���е��ڲ���ĳ�Ա��
//		Outer.Inner  in = new Outer().new Inner();
//		in.show();
		//����ڲ����Ǿ�̬�ģ��൱��һ���ⲿ�ࡣ
//		Outer.Inner in = new Outer.Inner();
//		in.show();
		//����ڲ����Ǿ�̬�ģ���Ա�Ǿ�̬�ġ�
		Outer.Inner.function();

	}

}
/*
 * �ڲ���ķ����ص㣺
 * 1.�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա��
 * 2.�ⲿ��Ҫ�����ڲ��࣬���뽨���ڲ������
 * 
 * һ�����������ƣ�
 * ��������ʱ���������������л����������������ﻹ�ڷ��ʱ�������������ݡ�
 * ��ʱ���ǻ��е����ﶨ����ڲ�����������
 */
class Outer
{
	private static int num = 3;
	static class Inner//�ڲ���
	{
	     void show()
		{
			System.out.println("Show run + "+num);
		}
	     static void function()//����ڲ����ж����˾�̬��Ա�����ڲ���������Ǿ�̬��
	     {
	    	 System.out.println("function run ..."+num);
	     }
	}
	public void method()
	{
		Inner in = new Inner();
		in.show();
	}
}