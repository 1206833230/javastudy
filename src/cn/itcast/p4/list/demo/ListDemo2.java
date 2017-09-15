package cn.itcast.p4.list.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List list = new ArrayList();
//		show(list);
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		
		ListIterator it = list.listIterator();//获取迭代器对象
		//他可以实现在迭代过程中年实现增删改查
		//只有list集合具备在此功能
		
		while(it.hasNext()) {
			Object obj = it.next();//java.util.ConcurrentModificationException
			                       //在迭代器过程中，不要使用集合操作元素，容易出现异常。
			//可以使用Iterator接的子接口ListIterator来完成。在迭代中对元素进行更多的caocuo。
			
			
			if(obj.equals("abc2")) {
				it.set("abc9");
			}
			System.out.println("next:"+it.hasNext());
			System.out.println("previous:"+it.hasPrevious());
		
			System.out.println("list:"+list);
			
		}
		
//		Iterator it = list.iterator();
//		while(it.hasNext()) {
//			Object obj = it.next();//java.util.ConcurrentModificationException
//			                       //在迭代器过程中，不要使用集合操作元素，容易出现异常。
//			//可以使用Iterator接的子接口ListIterator来完成。在迭代中对元素进行更多的caocuo。
//			
//			
//			if(obj.equals("abc2")) {
//				list.add("abc9");
//			}
//			else
//			System.out.println("next:"+obj);
//			
//		}
		System.out.println(list);

	}

//	private static void show(List list) {
//		// TODO 自动生成的方法存根
//		list.add("abc1");
//		list.add("abc2");
//		list.add("abc3");
//		list.add("abc4");
//		Iterator it = list.iterator();
//		while(it.hasNext()) {
//			System.out.println("next:"+it.next());
//			
//		}
//		for(int x=0; x<list.size(); x++) {
//			System.out.println("get:"+list.get(x));
//		}
//		
//	}

}
