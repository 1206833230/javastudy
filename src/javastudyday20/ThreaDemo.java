package javastudyday20;

public class ThreaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo();
		new Demo();
		new Demo();
		System.gc();
		System.out.println("Hello java");

	}

}
//jvm����ʱ�������˶���̣߳������������߳�������
//1.mian�̡߳�
//2.�������մ�����ơ�
class Demo extends Object
{
	public void finalize()
	{
		System.out.println("demo ok");
	}
}