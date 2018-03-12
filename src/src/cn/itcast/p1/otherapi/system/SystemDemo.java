package cn.itcast.p1.otherapi.system;

import java.util.Properties;
import java.util.Set;

public class SystemDemo {

	private static final String LINE_SEPARTOR = System.getProperty("line.separator");
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*
		 * System:���еķ��������Զ��Ǿ�̬�ġ�
		 * 
		 * �����ķ�����
		 * 
		 * long currentTimeMillis():��ȡ��ǰʱ��ĺ���ֵ��
		 * 
		 */

		long l1 = System.currentTimeMillis();
		System.out.println(l1);//1516345099647
		demo_1();
		long l2 = System.currentTimeMillis();
		System.out.println(l2-l1);
//		System.out.println("hello-\r\n word");
//		System.out.println("hello-"+LINE_SEPARTOR+" word");//��ȡ��ǰϵͳ�Ļ��з�
//		demo_1();
		
		//��ϵͳ����һЩ������Ϣ����Щ��Ϣ��ȫ�֣��������򶼿���ʹ�á�
//		System.setProperty("mycalsspath","c:\mycalss");
		
	}
	public static void demo_1() {
		//��ȡϵͳ������Ϣ�������浽��Properties�����С�
		/*
		 * properties�����д��涼��String���͵ļ���ֵ��
		 * ���ʹ�����Լ��Ĵ����ȡ���ķ��������Ԫ�صĲ�����
		 * 
		 */
		Properties prop = System.getProperties();
		
		Set<String> nameSet = prop.stringPropertyNames();
		
		for(String name: nameSet ) {
			String value = prop.getProperty(name);
			System.out.println(name+"::"+value);
		}
		
	}

}
