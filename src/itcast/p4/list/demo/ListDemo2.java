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
		ListIterator it = list.listIterator();// ��ȡ����������
		//������ʵ�ֵ��������е���ɾ�Ĳ�
		//ע�⣺ֻ��list���иõ����Ĺ���
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
//			//�ڵ����������У���Ҫʹ�ã����ϲ���Ԫ�أ����׳����쳣��
//			///\����ʹ��Iterator�ӿڵ��ӽӿ�ListIterator�ӿ������
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
//		//listȡ��Ԫ�صĶ��ط���
//		for(int x=0; x<list.size();x++)
//		System.out.println("get:"+list.get(x));
//		
//	}
//
//}
