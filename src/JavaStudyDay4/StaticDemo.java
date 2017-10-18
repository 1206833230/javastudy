/*static的特点：
 * 一个修饰符 用于修饰成员
 * 静态修饰的数据 是对象所共有的
 * 优先于对象出现 随着类的加载就已经出现
 * 修饰成员多了一种调用方式，就可以直接类名调用 （类名 静态成员）
 * 节约内存
 */


package JavaStudyDay4;

public class StaticDemo {
	static int num = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.name = "小强";
		//p.show();
		Person.show();
		new StaticDemo().show1();//主函数是静态的

	}
	public  void show1()
	{
		System.out.println(num);
	}

}
/*
 * 成员变量与静态变量区别：
 * 1.两个变量的生命周期不同：
 *   成员变量随着对象的创建而存在，随着对象的被回收而释放
 *   静态变量随着类的加载而存在，随着类的消失而消失
 * 2.调用的方式不同：
 *   成员变量只能被对象调用。
 *   静态变量可以被对象调用，还可以被类名调用。
 * 3.别名不同：
 *   成员变量也称为实例变量。
 *   静态变量也称为类变量。
 * 4.数据的储存位置不同：
 *   成员变量数据储存在堆内存的对象中，所以也叫对象的特有数据。
 *   静态变量数据储存在方法区（的静态区中），也叫对象的共享数据。
 * 
 * 静态使用的注意事项：
 * 1.静态方法只能访问静态成员。（非静态可以访问非静态，又可以访问静态）
 * 2.静态方法中不可以this和super关键字。
 * 3.主函数是静态的。
 */
class Person
{
	String name;//成员变量，实例变量
	static String country = "CN";//静态变量，类变量
	public static void show()
	{
		//System.out.println(Person.country+":"+this.name);
		System.out.println(Person.country);
	}
}