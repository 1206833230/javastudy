package cn.itcast.p1.vector.demo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		LinkedList link = new LinkedList();
		link.addFirst("abc1");
		link.addFirst("abc2");
		link.addFirst("abc3");
		link.addFirst("abc4");
//		System.out.print(link);
		
//		System.out.println(link.getFirst());//��ȡ��һ��Ԫ�ص��ǲ�ɾ��
//		System.out.println(link.getFirst());
		
//		System.out.println(link.removeFirst());//��ȡԪ�ػ�ɾ��
//		System.out.println(link.removeFirst());
//		System.out.println(link);
		
		while(!link.isEmpty()) {
			System.out.println(link.removeFirst());
		}
//		Iterator it = link.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}

	}

}
