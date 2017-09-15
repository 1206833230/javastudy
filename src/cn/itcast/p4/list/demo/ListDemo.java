package cn.itcast.p4.list.demo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List list = new ArrayList();
		show(list);

	}

	private static void show(List list) {
		// TODO 自动生成的方法存根
		//添加元素
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		System.out.println(list);
		//插入元素
//		list.add(1,"abc9");
		//删除元素
//		System.out.println("remove:"+list.remove(2));
		//修改元素
//		System.out.println("set:"+list.set(1,"abc8"));
		//获取元素
		System.out.println("get:"+list.get(0));
		//获取子列表
		System.out.println("subList:"+list.subList(1, 2));
		System.out.println(list);
	}

}
