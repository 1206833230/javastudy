package cn.itcast.p4.list.demo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		List list = new ArrayList();
		show(list);
		
		

	}

	private static void show(List list) {
		// TODO Auto-generated method stub
		//���Ԫ��
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		System.out.println(list);
		
//		//����Ԫ��
//		list.add(1,"abc9");
		//ɾ��yuansu
//		System.out.println("remove:"+list.remove(2));
		
		//�޸�Ԫ��
		System.out.println("set:"+list.set(1,"abc8"));
		//��ȡԪ��
		System.out.println("get:"+list.get(0));
		//��ȡ���б�
		System.out.println("sublist:"+list.subList(0, 2));
		
		
		
		System.out.println(list);
	}

}
