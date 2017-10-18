package JavaStudyDay2;
/*
 * 描述小汽车
 * 分析：
 * 1.属性：
 *     轮胎数。
 *     颜色。
 * 2.行为：
 *   运行。
 * 定义类就是定义类中的成员
 * 成员： 成员变量《--》属性，成员函数《--》行为
 * 引用变量储存的是堆得地址值
 * 对象的出现时为了封装数据
 * 
 * 成员变量与局部变量的区别
 * 1.成员变量的定义在类中，整个类都可以访问
 *   局部变量定义在函数中、语句、局部代码中，只在所属区域有效
 * 2.成员变量储存在堆内存的对象中。
 *   局部变量储存在栈内存的方法中。
 * 3.成员变量随着对象的创建而存在，随着对象的消失而消失。
 *   局部变量随着所属区域的执行而存在，随着所属区域的结束而消失。
 * 4.成员变量都有初始化值。
 *   局部变量没有初始化值。
 *  先在栈中找 再到堆中找
 */
/*
 * 匿名对象 没有名字的对象
 * new Car（）；
 * 匿名对象，其实就是定义对象的简写格式
 *  Car  c = new Car（);
 *  c.run(）；
 *  
 *  new Car（）.run();
 *  1.当对象仅用一次的时候 ，可以使用匿名对象。
 *  new Car().num = 5;
 *  new Car().color = "green";
 *  new Car().run();
 *  2.匿名对象可以用做实际参数传递
 *  show(new Car（));
 */
class Car//储存在栈中
{
	int num;//储存在堆内存中 初始值为0
	String color;//初始值为null 储存在堆内存中
	void run()
	{
		//int num =  10;
		System.out.println(num+"..."+color);
	}
}
//不具有独立运行的能力 图纸 需要创建对象

public class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//在计算机中创建一个car的实例，通过关键字。
		//Car c = new Car();// 栈中 c就是一个类型烦的引用变量，指向了该类的对象。
		//c.num = 4;//堆中
		//c.color = "red";//堆中
		//c.run();//要使用对象中的内容可以通过对象，成员的形成类似完成调用。
		
		//Car c1 = new Car();
		//c1.num = 4;
		//c1.color = "red";
		
		//Car c2 = new Car();
		//c2.num = 4;
		//c2.color = "red";
		
		Car c1 = new Car();
		Car c2 = new Car();
		show(c1);
		show(c2);
		show(new Car());//匿名对象
		
		

	}
	public static void show(Car c)//类类型的变量一定指向对象，要不就是null
	{
		c.num = 3;
		c.color = "black";
		System.out.println(c.num +"..."+c.color);
	}

}
