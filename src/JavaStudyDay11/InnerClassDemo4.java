package JavaStudyDay11;

public class InnerClassDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Outer4().method();

	}

}
/*
�����ڲ��࣬�����ڲ���ļ�д��ʽ��
  ������ǰ�᣺
�ڲ������̳л���ʵ��һ���ⲿ���ӿڡ�
�����ڲ�����ʵ����һ�������������
��ʽ�� new �����ӿڣ���{��������}
*/
abstract class Demo
{
	abstract void show();
}
class Outer4
{
	int num = 4;
//	class Inner extends Demo
//	{
//		void show()
//		{
//			System.out.println("show ..."+num);
//		}
//	}
	public void method()
	{
//		new Inner().show();
		new Demo()// �����ڲ���
		{
			void show()
			{
				System.out.println("show ..."+num);
			}
		}.show();
	}
}