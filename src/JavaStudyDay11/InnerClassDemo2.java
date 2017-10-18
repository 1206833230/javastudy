package JavaStudyDay11;

public class InnerClassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Outer1().method();

	}

}
/*
 * 为什么内部类能直接访问外部类的成员呢？
 * 那是因为内部类持有了外部类的引用。外部类名.this
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