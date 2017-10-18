/*
 * final
 * 继承弊端，到了封装性。
 * final关键字：
 * 1.final是一个修饰符，可以修饰方法，类，变量。
 * 2.final修饰的类不可以被继承。
 * 3.final修饰的方法不可以被覆盖。
 * 4.final修饰的变量是一个常量，只能被赋值一次。
 *  为什么要使用final修饰变量，其实在程序如果一个数据是固定的。
 *  那么直接使用这个数据就可以了，但是这样阅读性差，所以给该数据起个名字。
 *  而且这个变量名称的值不能变化，所以加上了final固定。
 *  写法规范，常量所有字母大写，单词之间用下划线链接。
 */
package JavaStudyDay9;

public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zi z = new Zi();
		z.method();

	}

}
class Fu
{
	void method()
	{
		//调用底层系统资源
	}
}
class Zi extends Fu
{
	public final double MY_PI = 3.14;
	static final int X = 1;
	void method()
	{
		final int NUMBER = 9;
		System.out.println("haha"+MY_PI+NUMBER+X);
	}
}
