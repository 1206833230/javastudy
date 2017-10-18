package cn.itcast.p4.list.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
//		show(list);
		
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		System.out.println("list:"+list);
		ListIterator it = list.listIterator();// 获取迭代器对象
		//他可以实现迭代过程中的曾删改查
		//注意：只有list具有该迭代的功能
		while(it.hasNext()){
			Object obj = it.next();
			if(obj.equals("abc2")) {
				it.set("abc9");
				
			}
			
		}
//		System.out.println("hasNext:"+it.hasNext());
//		System.out.println("prevou:"+it.hasPrevious());
	    while(it.hasPrevious())
	    {
	    	System.out.println("previous:"+it.previous());
	    }
		System.out.println("list:"+list);
	}
}
//		while(it.hasNext()) {
//			Object obj = it.next();// java.util.ConcurrentModificationException
//			//在迭代器过程中，不要使用，集合操作元素，容易出现异常。
//			///\可以使用Iterator接口的子接口ListIterator接口来完成
//			{
//				list.add("abc9");
//			}
//			System.out.println("next:"+obj);
//		}
//
//		System.out.println(list);
//	}
//
//	private static void show(List list) {
//		// TODO Auto-generated method stub
//		list.add("abc1");
//		list.add("abc2");
//		list.add("abc3");
//		list.add("abc4");
//		
//		
//		//list取出元素的独特方法
//		for(int x=0; x<list.size();x++)
//		System.out.println("get:"+list.get(x));
//		
//	}
//
//}
