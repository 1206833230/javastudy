package cn.itcast.p3.collection.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 
 * @author Jun Li
 * 2018��1��6��
 * ����3:54:48
 */
public class IteratorDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Collection coll = new ArrayList();
		
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");
		
		//ʹ��Collection�е�Iterator�������������ü����еĵ�������������Ϊ�˻�ȡ�����еĵ���������
//		Iterator it = coll.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		for(Iterator it = coll.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
//		System.out.println(it.next());//ָ��ָ����һλ
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());//java.util.NoSuchElementException
	}

}