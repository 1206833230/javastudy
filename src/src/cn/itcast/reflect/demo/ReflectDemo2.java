package cn.itcast.reflect.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo2 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO 自动生成的方法存根

		createNewObject_1();
	}
	public static void createNewObject_1() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO 自动生成的方法存根
//		cn.itcast.bean.Person p = new cn.itcast.bean.Person("小强",30);
		
		/*
		 * 当要指定名称对应类中的所体现的对象时。
		 * 而该对象初始化不适用空参数构造函数该怎办？
		 * 既然是通过指定的构造函数进行初始化，
		 * 所以应该先获取到该构造函数。通过字节码文件对象即可完成。
		 * 该方法是。getConstructor(paramateTypes)
		 */
		String name = "cn.itcast.bean.Person";
		//找寻该名称类文件，并加载进内存，并产生Class对象。
		Class clazz = Class.forName(name);
		
		Constructor constructor = clazz.getConstructor(String.class,int.class);
		
		//通过该构造器对象的newInstance方法进行对象的初始化。
		Object obj = constructor.newInstance("小明", 29);
	}
	public static void createNewObject() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//早期：new的时候，先根据被new的类的明后才能找寻该类的字节码文件，并加载进内存。
		//并创建该字节码文件对象，接着创建该字节码文件的对应的Person对象。
//		cn.itcast.bean.Person p = new cn.itcast.bean.Person(); 
		
		//现在：
		String name = "cn.itcast.bean.Person";
		
		//找寻该名称类文件，并加载进内存，并产生Class对象。
		Class clazz = Class.forName(name);
		
		//如何产生该类的对象呢？
		Object obj = clazz.newInstance();
	}

}
