package cn.itcast.reflect.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo2 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO �Զ����ɵķ������

		createNewObject_1();
	}
	public static void createNewObject_1() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO �Զ����ɵķ������
//		cn.itcast.bean.Person p = new cn.itcast.bean.Person("Сǿ",30);
		
		/*
		 * ��Ҫָ�����ƶ�Ӧ���е������ֵĶ���ʱ��
		 * ���ö����ʼ�������ÿղ������캯�������죿
		 * ��Ȼ��ͨ��ָ���Ĺ��캯�����г�ʼ����
		 * ����Ӧ���Ȼ�ȡ���ù��캯����ͨ���ֽ����ļ����󼴿���ɡ�
		 * �÷����ǡ�getConstructor(paramateTypes)
		 */
		String name = "cn.itcast.bean.Person";
		//��Ѱ���������ļ��������ؽ��ڴ棬������Class����
		Class clazz = Class.forName(name);
		
		Constructor constructor = clazz.getConstructor(String.class,int.class);
		
		//ͨ���ù����������newInstance�������ж���ĳ�ʼ����
		Object obj = constructor.newInstance("С��", 29);
	}
	public static void createNewObject() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//���ڣ�new��ʱ���ȸ��ݱ�new��������������Ѱ������ֽ����ļ��������ؽ��ڴ档
		//���������ֽ����ļ����󣬽��Ŵ������ֽ����ļ��Ķ�Ӧ��Person����
//		cn.itcast.bean.Person p = new cn.itcast.bean.Person(); 
		
		//���ڣ�
		String name = "cn.itcast.bean.Person";
		
		//��Ѱ���������ļ��������ؽ��ڴ棬������Class����
		Class clazz = Class.forName(name);
		
		//��β�������Ķ����أ�
		Object obj = clazz.newInstance();
	}

}
