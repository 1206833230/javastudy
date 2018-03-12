package cn.itcast.reflect.demo;

import java.lang.reflect.Field;

public class ReflectDemo3 {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根

		getFileDemo();
	}

	public static void getFileDemo() throws Exception {
		// TODO 自动生成的方法存根
		
		Class clazz = Class.forName("cn.itcast.bean.Person");
		
		Field field = null;//clazz.getField("age");//只获取公有的
		field = clazz.getDeclaredField("age");//只获取本类，但包含私有的
		
		//对私有字段的访问取消权限检查。暴力访问。
		field.setAccessible(true);
		
		Object obj = clazz.newInstance();
		
		field.set(obj, 89);
		
		Object o = field.get(obj);
		
		System.out.println(o);
		
	
		
//		System.out.println(field);
	}

}
