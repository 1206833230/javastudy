package cn.itcast.reflect.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo4 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO �Զ����ɵķ������

		getMethodDemo_3();
	}

	public static void getMethodDemo_3() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException {
		// TODO �Զ����ɵķ������
        Class clazz = Class.forName("cn.itcast.bean.Person");
		
		Method method = clazz.getMethod("paramMethod", String.class,int.class);//��ȡ�ղ�������
		
		Object obj = clazz.newInstance();
		
		method.invoke(obj, "Сǿ",89);
		
	}

	public static void getMethodDemo_2() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO �Զ����ɵķ������
		Class clazz = Class.forName("cn.itcast.bean.Person");
		
		Method method = clazz.getMethod("show", null);//��ȡ�ղ�������
		//Object obj = clazz.newInstance();
		Constructor constructor = clazz.getConstructor(String.class,int.class);
		
		Object obj = constructor.newInstance("С��",30);
		
//		Person p = new Person();
//		p.show();
		method.invoke(obj,null);
	}
	

	/*
	 * ��ȡ����
	 */
	public static void getMethodDemo() throws ClassNotFoundException {
		// TODO �Զ����ɵķ������
		
		Class clazz = Class.forName("cn.itcast.bean.Person");
		
		Method[] methods = clazz.getMethods();//��ȡ�Ķ��ǹ��еķ�����
		
		methods = clazz.getDeclaredMethods();//ֻ��ȡ���������з���������˽�еġ�
		for(Method method: methods) {
			System.out.println(method);
		}
	}

}
