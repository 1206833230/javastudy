package cn.itcast.p3.collection.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection coll = new ArrayList();
		
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");
		//ʹ��Collection�е�iterator�������������ü����еĵ�������������Ϊ�˻�ȡ�����е���������
//		Iterator it = coll.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		for(Iterator it= coll.iterator();it.hasNext();) {
			System.out.println(it.next());
		}
//		it.next();
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());//java.util.NoSuchElementException




	}

}