package cn.itcast.p3.collection.demo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Collection coll = new ArrayList();
//		show(coll);
		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();
		show(c1,c2);

	}
	public static void show(Collection c1,Collection c2) {
		//���� ���Ԫ�ء�
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");
		c2.add("abc2");
		c2.add("abc6");
		c2.add("abc7");
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		//��ʾaddAll
//		c1.addAll(c2);//��c2��Ԫ��c1��
		//��ʾremoveAll
//		boolean b = c1.removeAll(c2);//��������������ͬԪ�شӵ���removeAll�ļ�����ɾ����
//		System.out.println("removeAll;"+b);
//		boolean b = c1.containsAll(c2);//��������������ͬԪ�شӵ���removeAll�ļ�����ɾ����
//		System.out.println("containsAll;"+b);
		System.out.println("c1="+c1);
		
		
		
	}
//	public static void show(Collection coll) {
//		//1.���Ԫ��add
//
//		coll.add("abc1");
//		coll.add("abc2");
//		coll.add("abc3");
//		System.out.println(coll);
////		//2.ɾ��
////		coll.remove("abc2");//��ı伯�ϵĳ���
//		
//		//3.��ռ���
//		coll.clear();
////		System.out.println(coll.contains("abc4"));//�ж�
//		System.out.println(coll);
//	}
//
}
