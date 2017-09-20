package cn.itcast.p1.vector.demo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		LinkedList link = new LinkedList();
		link.addFirst("abc1");
		link.addFirst("abc2");
		link.addFirst("abc3");
		link.addFirst("abc4");
//		System.out.print(link);
		
//		System.out.println(link.getFirst());//获取第一个元素但是不删除
//		System.out.println(link.getFirst());
		
//		System.out.println(link.removeFirst());//获取元素会删除
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
