package cn.itcast.reflect.demo;

import cn.itcast.bean.Person;

/*
 * JAVA反射机制是在运行状态中，对于任意一个类（class文件），都能够知道这个类的所有属性与方法。
 * 对于任意一个对象，都能够调用它的任意一个方法和属性。
 * 这种动态获取的信息以及动态调用对象的方法的功能称为java语言反射机制。
 * 
 * 动态获取类中信息，就是java反射。
 * 可以理解为对类解剖。
 * 
 * 要想对字节码文件进行解剖，必须要有字节码文件对象。
 * 如何获取字节码文件对象呢？
 */
public class RelectDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO 自动生成的方法存根

		getClassObject_3();
	}
	/*
	 * 方式三。
	 * 只要通过给定类的的字符串名称就可以获取该类，更为扩展。
	 * 可以使用Class类中的方法完成。
	 * 该方法就是ForName。
	 * 这种方式只要名称即可，更为方便，更为扩展。
	 */
	private static void getClassObject_3() throws ClassNotFoundException {
		// TODO 自动生成的方法存根
		
		String className = "cn.itcast.bean.Person";
		
		Class clazz = Class.forName(className);
		
		System.out.println(clazz);
		
	}

	/*
	 * 方式二。
	 * 2.任何数据类型都具备一个静态属性.class来获取相应的class对象。
	 * 相对简单，但是还是要明确具体类中的静态成员。
	 * 还是不够扩展。
	 */
	private static void getClassObject_2() {
		// TODO 自动生成的方法存根
		Class clazz = Person.class;
		
		Class clazz1 = Person.class;
		
		System.out.println(clazz==clazz1);
		
	}
	/*
	 * 获取字节码对象的方法。
	 * 1.Object类中的getClass()方法。
	 * 想要用这种方法，必须要明确具体的类，并创建对象。
	 * 麻烦。
	 */
	public static void getClassObject_1() {
		Person p = new Person();
		Class clazz = p.getClass();
		
		Person p1 = new Person();
		Class clazz1 = p1.getClass();
		
		System.out.println(clazz==clazz1);
	}

}
