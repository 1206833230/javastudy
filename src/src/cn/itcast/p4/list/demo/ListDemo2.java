package cn.itcast.p4.list.demo;

import java.util.ArrayList;
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
		list.add("abc4");
		
		System.out.println("list:"+list);
		
		ListIterator it = list.listIterator();//获取迭代器对象
		//只有list具备该功能
		while(it.hasNext()) {
			Object obj = it.next();
			if(obj.equals("abc2")) {
				it.set("abc9");
			}
			else {
				System.out.println("next:"+obj);
			}
			
		}
//		System.out.println("hasNext:"+it.hasNext());
//		System.out.println("hasPrevious:"+it.hasPrevious());
		
		
		while(it.hasPrevious()) {
			System.out.println("previous"+it.previous());
		}
//		Iterator it = list.iterator();
//		while(it.hasNext()) {
//			Object obj = it.next();//java.util.ConcurrentModificationException
//			//在迭代过程中，不要使用集合操作元素，如意出现异常
//			//可以使用iterator接口的接口ListIterator来完成在迭代过程中对元素进行更多的操作。
//			
//			if(obj.equals("abc2")) {
//				list.add("abc9");
//			}
//			else {
//				System.out.println("next:"+obj);
//			}
//			
//		}
       System.out.println("list:"+list);
	}

	public static void show(List list) {
		// TODO 自动生成的方法存根
		//添加元素
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		
//		Iterator it = list.iterator();
//		while(it.hasNext()) {
//			System.out.println("next:"+it.next());
//		}
		for(int x = 0; x < list.size(); x++) {
			System.out.println("get；"+list.get(x));
		}
	}

}
