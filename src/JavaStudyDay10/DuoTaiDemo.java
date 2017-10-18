/*
 * 多态在代码中的体现：
 * 父类或者接口的引用指向器=其子类对象。
 * 
 * 多态的好处：
 *  提高了代码的扩展性，前期定义的代码可以使用后期的内容。
 * 多态的弊端：
 *  前期定义的内容，不能使用后期子类定义的特有内容。
 *  多态的前提：
 *   1.必须有关系，继承，实现
 *   2.要有覆盖
 */

package JavaStudyDay10;

public class DuoTaiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Cat c = new Cat();
//		c.eat();
//		c.catchMouse();
		
		Animal a = new Cat();//自动类提升，猫对象提升了动物类型。但是特有功能无法访问。
		                     //作用就是限制特有功能的访问。
                             //向上转型
		a.eat();
		//如果还想使用具体动物猫的功能
		//你可以将该对象进行向下转型
//		Cat c = (Cat)a;//向下转型的目的是为了使用子类中的特有方法。
//		c.eat();
//		c.catchMouse();
//		Animal a1 = new Dog();
//		Cat c1 = (Cat)a1;
//		//注意 对于转型，自始至终都是子类对象在做着类型转化。
//		Cat c = new Cat();
//		Dog d = new Dog();
//		method(c);
//		method(d);
//		method(new Pig());
		method(new Dog());
	}
	public static void method(Animal a)//Animal a = new Dog();
	{
		a.eat();
		if(a instanceof Cat)//instanceof：用于判断对象的具体类型，只能用于引用数据类型判断
		{                   //通常用在向下转型类型转换
		Cat c = (Cat)a;
		c.catchMouse();
		}
		else if(a instanceof Dog)
		{
			Dog d = (Dog)a;
			d.lookHome();
		}
//		a.catchMouse();
	}
//		public static void method(Cat c)
//		{
//			c.eat();
//		}
//		public static void method(Dog d)
//		{
//			d.eat();
//		}

	

}
abstract class Animal
{
	abstract void eat();
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("啃骨头");
		
	}
	void lookHome()
	{
		System.out.println("看家");
	}
}
class Cat extends Animal
{
	void eat()
	{
		System.out.println("吃鱼");
	}
	void catchMouse()
	{
		System.out.println("抓老鼠");
	}
}
class Pig extends Animal
{
	void eat()
	{
		System.out.println("饲料");
	}
	void gongdi()
	{
		System.out.println("拱地");
	}
	
}