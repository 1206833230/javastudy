package cn.itcast.p4.list.demo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		List list = new ArrayList();
		show(list);

	}

	public static void show(List list) {
		// TODO �Զ����ɵķ������
		//����Ԫ��
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		
		//����Ԫ��
//		list.add(1,"abc9");
		
		//ɾ��Ԫ��
//		System.out.println("remove:"+list.remove(2));
		
		//�޸�Ԫ��
//		System.out.println("set��"+list.set(1,"abc3"));
		
		//��ȡԪ��
//		System.out.println("get��"+list.get(2));
		
		//��ȡ���б�
		System.out.println("sublist:"+list.subList(1,2));
		
		System.out.println(list);
	}

}