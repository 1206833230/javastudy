package cn.itcast.reflect.demo;

import java.lang.reflect.Field;

public class ReflectDemo3 {

	public static void main(String[] args) throws Exception {
		// TODO �Զ����ɵķ������

		getFileDemo();
	}

	public static void getFileDemo() throws Exception {
		// TODO �Զ����ɵķ������
		
		Class clazz = Class.forName("cn.itcast.bean.Person");
		
		Field field = null;//clazz.getField("age");//ֻ��ȡ���е�
		field = clazz.getDeclaredField("age");//ֻ��ȡ���࣬������˽�е�
		
		//��˽���ֶεķ���ȡ��Ȩ�޼�顣�������ʡ�
		field.setAccessible(true);
		
		Object obj = clazz.newInstance();
		
		field.set(obj, 89);
		
		Object o = field.get(obj);
		
		System.out.println(o);
		
	
		
//		System.out.println(field);
	}

}
