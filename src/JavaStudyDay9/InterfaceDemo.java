/*
 * ��Java�в�ֱ��֧�ֶ�̳У���Ϊ����ֵ��õĲ�ȷ���ԡ�
 * ����Java����̳л��ƽ��и�������Java�б�ɶ�ʵ�֡�
 * һ�������ʵ�ֶ���ӿڡ�
 */

package JavaStudyDay9;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DemoImpl d = new DemoImpl();
		//d.NUM = 3;
		//System.out.println(d.NUM);
		System.out.println(DemoImpl.NUM);
		System.out.println(Demo1.NUM);
		Test t = new Test();
		t.show();

	}

}

/*
 * ��һ���������еķ������ǳ����ʱ����ʱ��Ϳ��Խ��ó�������
 * ��һ����ʽ����ͱ�ʾ�����ǽӿ�interface
 * ����ӿ�ʹ�õĹ��ֲ���class����interface
 * ���ڽӿڵ��г����ĳ�Ա��������Щ��Ա���й̶������η���
 * 1.ȫ�ֳ�����
 * public static final
 * 2.���󷽷���
 * public abstract
 * �ɴ˵ó����ۣ��ӿ��еĳ�Ա���ǹ�����Ȩ�ޡ�
 */
//abstract class AbsDemo
//{
//	abstract void show1();
//	abstract void show2();
//}
interface Demo1
{
	public static final int NUM = 4;//Ҳ����д�� int NUM = 4�������Զ�����public static final
	
	abstract void show1();
	abstract void show2();
}
//������֮���Ǽ̳й�ϵ������ӿ�֮��ʵ�ֹ�ϵ
/*
 * �ӿڲ�����ʵ����
 * ֻ����ʵ���˽ӿڵ����ಢ�����˽ӿ����еĳ��󷽷��󣬸�����ſ���ʵ������
 * ��������������һ�������ࡣ
 */
class DemoImpl implements /*ʵ��*/ Demo1
{
	public void show1()
	{
	}
	public void show2()
	{
		
	}
}
interface A
{
	public void show();
	
}
interface Z
{
	public void show();
//	public int add(int a,int b);
}
class Test implements A,Z//��ʵ��
{
	public void show()
	{
		
	}
//	public int add(int a,int b)
//	{
//		return a+b+3;
//	}
}
/*
 * һ�����ڼ̳���һ�����ͬʱ��������ʵ�ֶ���ӿڡ�
 */
class Q
{
	public void method()
	{
		
	}
}
/*
 * �ӿڳ��ֱ����˵��̳еľ����ԡ�
 */
abstract class Test2 extends Q implements A,Z
{
	public void method ()
	{
		
	}
}
interface CC
{
	void show();
	
}
interface MM
{
	void method();
}
interface QQ extends CC,MM //�ӿ���ӿ�֮���Ǽ̳й�ϵ�����ҽӿ���ӿڿ��Զ�̳С�
{
	void function();
}
class WW implements QQ
{
	//������3������
	public void show() {}
	public void method() {}
	public void function() {}
	
}
	