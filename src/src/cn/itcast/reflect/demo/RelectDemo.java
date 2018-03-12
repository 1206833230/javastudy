package cn.itcast.reflect.demo;

import cn.itcast.bean.Person;

/*
 * JAVA���������������״̬�У���������һ���ࣨclass�ļ��������ܹ�֪�����������������뷽����
 * ��������һ�����󣬶��ܹ�������������һ�����������ԡ�
 * ���ֶ�̬��ȡ����Ϣ�Լ���̬���ö���ķ����Ĺ��ܳ�Ϊjava���Է�����ơ�
 * 
 * ��̬��ȡ������Ϣ������java���䡣
 * �������Ϊ������ʡ�
 * 
 * Ҫ����ֽ����ļ����н��ʣ�����Ҫ���ֽ����ļ�����
 * ��λ�ȡ�ֽ����ļ������أ�
 */
public class RelectDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO �Զ����ɵķ������

		getClassObject_3();
	}
	/*
	 * ��ʽ����
	 * ֻҪͨ��������ĵ��ַ������ƾͿ��Ի�ȡ���࣬��Ϊ��չ��
	 * ����ʹ��Class���еķ�����ɡ�
	 * �÷�������ForName��
	 * ���ַ�ʽֻҪ���Ƽ��ɣ���Ϊ���㣬��Ϊ��չ��
	 */
	private static void getClassObject_3() throws ClassNotFoundException {
		// TODO �Զ����ɵķ������
		
		String className = "cn.itcast.bean.Person";
		
		Class clazz = Class.forName(className);
		
		System.out.println(clazz);
		
	}

	/*
	 * ��ʽ����
	 * 2.�κ��������Ͷ��߱�һ����̬����.class����ȡ��Ӧ��class����
	 * ��Լ򵥣����ǻ���Ҫ��ȷ�������еľ�̬��Ա��
	 * ���ǲ�����չ��
	 */
	private static void getClassObject_2() {
		// TODO �Զ����ɵķ������
		Class clazz = Person.class;
		
		Class clazz1 = Person.class;
		
		System.out.println(clazz==clazz1);
		
	}
	/*
	 * ��ȡ�ֽ������ķ�����
	 * 1.Object���е�getClass()������
	 * ��Ҫ�����ַ���������Ҫ��ȷ������࣬����������
	 * �鷳��
	 */
	public static void getClassObject_1() {
		Person p = new Person();
		Class clazz = p.getClass();
		
		Person p1 = new Person();
		Class clazz1 = p1.getClass();
		
		System.out.println(clazz==clazz1);
	}

}
