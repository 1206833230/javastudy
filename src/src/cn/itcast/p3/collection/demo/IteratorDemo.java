package cn.itcast.p3.collection.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 
 * @author Jun Li
 * 2018年1月6日
 * 下午3:54:48
 */
public class IteratorDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Collection coll = new ArrayList();
		
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");
		
		//使用Collection中的Iterator（）方法，调用集合中的迭代器方法，是为了获取集合中的迭代器对象。
//		Iterator it = coll.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		for(Iterator it = coll.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
//		System.out.println(it.next());//指针指向下一位
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());//java.util.NoSuchElementException
	}

}
