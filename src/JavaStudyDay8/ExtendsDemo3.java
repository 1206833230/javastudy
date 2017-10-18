/*
 * 成员变量
 * 当子父类中出现成员函数一模一样的情况，会运行子类的函数。
 * 这种现象，称为覆盖操作，这时函数在子父类中的特性。
 * 函数的两个特征：
 *   1.重载，同一个类中overload
 *   2.覆盖，子父类中，覆盖也称重写，覆写。override
 *   覆盖注意事项：
 *   1.子方法覆盖父类方法时，子类权限覆盖必须大于等于父类权限
 *   2.静态只能覆盖静态，或被静态覆盖。
 * 什么时候使用覆盖操作
 * 当跟对一个类进行子类的扩展时，子类需要保留父类烦人功能声明。
 * 但是要定义子类中该功能的特有内容时，就要使用覆盖操作完成。
 */
package JavaStudyDay8;
public class ExtendsDemo3 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Zi1 z = new Zi1();
//		z.show2();
//		z.show1();
//		z.show();
//		Phone p = new Phone();
//		p.show();
		NewPhone p = new NewPhone();
		p.newshow();

	}

}
//class Fu1
//{
//	public static void show()
//	{
//		System.out.println("fu show  run");
//		
//	}
//}
//class Zi1 extends Fu1
//{
//	public static void show()
//	{
//		System.out.println("Zi show fu");
//	}
//}
class Phone
{
	void show()
	{
		System.out.println("number");
		
	}
}
class NewPhone extends Phone
{
	void newshow()
	{
		super.show();
		System.out.println("pie");
		System.out.println("name");
	}
}