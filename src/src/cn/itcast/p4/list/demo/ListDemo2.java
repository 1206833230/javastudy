package cn.itcast.p4.list.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		List list = new ArrayList();
//		show(list);
		
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		
		System.out.println("list:"+list);
		
		ListIterator it = list.listIterator();//��ȡ����������
		//ֻ��list�߱��ù���
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
//			//�ڵ��������У���Ҫʹ�ü��ϲ���Ԫ�أ���������쳣
//			//����ʹ��iterator�ӿڵĽӿ�ListIterator������ڵ��������ж�Ԫ�ؽ��и���Ĳ�����
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
		// TODO �Զ����ɵķ������
		//���Ԫ��
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		
//		Iterator it = list.iterator();
//		while(it.hasNext()) {
//			System.out.println("next:"+it.next());
//		}
		for(int x = 0; x < list.size(); x++) {
			System.out.println("get��"+list.get(x));
		}
	}

}
