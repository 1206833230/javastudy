/*
 * 子父类中构造函数的特点：
 * 在子类构造对象时，发现，访问子类构造函数时，父类也运行了。
 * 为什么呢？
 * 原因是：在子类的构造函数中第一行又有一个默认的隐式语句。super（）；
 * 子类的实例化过程:子类所有的构造函数默认都会去访问父类的空参数构造函数
 * 为真么子类实例化的时候要访问父类构造函数呢？
 * 那是因为子类继承了父类，获取到了父类的内容（属性），所以在使用父类的内容之前，
 * 要先看父类是如何初始化的。
 * 所以在子类构造对象时，必须访问父类的构造函数。
 * 为什么完成这个必须的动作，就在子类的构造函数中加入super();
 * 
 * 如果父类中没有定义空参数构造函数，那么子类的构造函数必须用super明确要调用父类
 * 中的那个构造函数。
 *  父类中那个构造函数，同时子类构造函数如果使用this调用了本类构造函数时，
 *  那么super就没有了，因为super和this都只能定义第一行，所以只有一个。
 *  但是可以保证的是，子类中肯定会有其他构造函数访问父类的构造函数。
 * 
 * 注意：super语句必须定义在子类构造函数的第一行，因为父类的初始化动作要先完成。
 */

package JavaStudyDay8;

public class ExtendsDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Zi3(6);

	}

}
class Fu3
{
	int num;
	Fu3()
	{
		num = 10;
		System.out.println("A fu run");
	}
	Fu3(int x)
	{
		System.out.println("B fu run ..."+x);
		return ;
	}
}
class Zi3 extends Fu3
{
	int num;
	Zi3()
	{
		System.out.println("C Zi run"+num);
	}
	Zi3(int x)
	{ 
		this();
		//super(4);//调用的就是父类中空参数的构造函数
		//super(x);
		System.out.println("D Zi run ..."+x);
		
	}
}
class Demo //extends Object
{
	/*
	 * Demo()
	 * {
	 *     super();
	 *     return ;
	 * }
	 */
}