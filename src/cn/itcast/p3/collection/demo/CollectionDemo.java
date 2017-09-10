package cn.itcast.p3.collection.demo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Collection coll = new ArrayList();
//		show(coll);
		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();
		show(c1,c2);

	}
	public static void show(Collection c1,Collection c2) {
		//给成 添加元素。
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");
		c2.add("abc2");
		c2.add("abc6");
		c2.add("abc7");
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		//演示addAll
//		c1.addAll(c2);//将c2的元素c1中
		//演示removeAll
//		boolean b = c1.removeAll(c2);//将两个集合中相同元素从调用removeAll的集合中删除。
//		System.out.println("removeAll;"+b);
//		boolean b = c1.containsAll(c2);//将两个集合中相同元素从调用removeAll的集合中删除。
//		System.out.println("containsAll;"+b);
		System.out.println("c1="+c1);
		
		
		
	}
//	public static void show(Collection coll) {
//		//1.添加元素add
//
//		coll.add("abc1");
//		coll.add("abc2");
//		coll.add("abc3");
//		System.out.println(coll);
////		//2.删除
////		coll.remove("abc2");//会改变集合的长度
//		
//		//3.清空集合
//		coll.clear();
////		System.out.println(coll.contains("abc4"));//判断
//		System.out.println(coll);
//	}
//
}
