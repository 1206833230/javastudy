package cn.itcast.reflect.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo4 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO 自动生成的方法存根

		getMethodDemo_3();
	}

	public static void getMethodDemo_3() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException {
		// TODO 自动生成的方法存根
        Class clazz = Class.forName("cn.itcast.bean.Person");
		
		Method method = clazz.getMethod("paramMethod", String.class,int.class);//获取空参数方法
		
		Object obj = clazz.newInstance();
		
		method.invoke(obj, "小强",89);
		
	}

	public static void getMethodDemo_2() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO 自动生成的方法存根
		Class clazz = Class.forName("cn.itcast.bean.Person");
		
		Method method = clazz.getMethod("show", null);//获取空参数方法
		//Object obj = clazz.newInstance();
		Constructor constructor = clazz.getConstructor(String.class,int.class);
		
		Object obj = constructor.newInstance("小明",30);
		
//		Person p = new Person();
//		p.show();
		method.invoke(obj,null);
	}
	

	/*
	 * 获取方法
	 */
	public static void getMethodDemo() throws ClassNotFoundException {
		// TODO 自动生成的方法存根
		
		Class clazz = Class.forName("cn.itcast.bean.Person");
		
		Method[] methods = clazz.getMethods();//获取的都是公有的方法。
		
		methods = clazz.getDeclaredMethods();//只获取本类中所有方法，包含私有的。
		for(Method method: methods) {
			System.out.println(method);
		}
	}

}
