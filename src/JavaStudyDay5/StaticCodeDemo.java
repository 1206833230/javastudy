/*
 * 静态代码块。
 * 随着类的加载而执行.而且只执行一次。
 * 作用：
 *  用于给类进行初始化。
 */

package JavaStudyDay5;

public class StaticCodeDemo {
	static
	{
		System.out.println("a");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new StaticCode().show();
		//new StaticCode().show();
		//StaticCode.show();
		Person p1 = new Person();
		p1.speak();
		Person p2 = new Person("旺财");
		p2.speak();
		new Person();

	}

}
class StaticCode
{
	static int num;
	static
	{
		num = 10;
		num *= 3;
		System.out.println("hahaha");
	}
	//StaticCode{}{}
	static void show()
	{
		System.out.println(num);
	}
}
class Person
{
	private String name1;
	{//构造代码块，可以给所有对象进行初始化
		//System.out.println("person run");
		cry();
	}
	Person()//构造函数，给对应的对象进行初始化
	{
		name1 = "baby";
		//cry();
	}
	Person(String name1)
	{
		this.name1 = name1;
		//cry();
	}
	public void cry()
	{
		System.out.println("哇哇");
	}
	public void speak()
	{
		System.out.println("name="+name1);
	}
}