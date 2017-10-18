/*
 * 继承的好处：
 *  1.提高了代码的复用性。
 *  2.让类与类之间产生联系，为下一个提供了前提。
 *  Java中支持单继承，不支持继承，但对c++中的多继承机制进行改良。
 *  单继承：
 *    一个子类只有一个直接父类
 *  多继承：
 *    一个子类可以有多个直接父类（Java中不允许，进行改良）
 *    不直接支持，因为多个父类中有相同成员会产生调用不确定性。
 *    在Java用“多实现”来实现。
 *  Java支持多层(多重)继承
 *  C继承B,B继承A。
 *  就会出现继承体系。
 *  
 *  当要使用一个继承体系时
 *  1.查看该体系中顶层类，了解体系的基本功能。
 *  2.创建体系中的最子类对象，完成功能使用。
 *  class DemoA
 *  {
 *  void show1(){}
 *  void show2(){}
 *  }
 *  class Demo2B
 *  {
 *  void show1(){}
 *  void show3(){}
 *  }
 *  什么时候继承呢/
 *  1.当类与类之间存在所属关系的时候，就定义继承，xxx是yyy中的一种，xxx extends yyy
 *  所属关系：is a 关系
 */

package JavaStudyDay8;

public class ExtendsDdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.name="zhangsan";
		s.age=22;
		s.study();

	}

}
class Person
{
	String name;
	int age;
}
class Student extends/*继承*/ Person
{
//	String name;
//	int age;
	void study()
	{
		System.out.println(name+"...student study..."+age);
	}
}
class Worker extends Person
{
//	String name;
//	int age;
	void work() 
	{
		System.out.println("worker work");
		
	}
}