package JavaStudyDay11;

public class InnerClassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Outer1().method();

	}

}
/*
 * Ϊʲô�ڲ�����ֱ�ӷ����ⲿ��ĳ�Ա�أ�
 * ������Ϊ�ڲ���������ⲿ������á��ⲿ����.this
 */
class Outer1
{
	int num = 3;
	class Inner
	{
		int num = 4;
		void show()
		{
//			int num = 5;
			System.out.println(Outer1.this.num);
		}
		
	}
	void method()
	{
		new Inner().show();
	}
}