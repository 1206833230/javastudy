package cn.itcast.p3.toolclass.arrays.demo;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		 * Arrays: 集合框架的工具类。里面的方法都是静态的。
		 * 
		 * 好处：其实可以使用集合的方法按操作数组元素
		 * 
		 * 注意：数组的长度是固定的，所以对于集合的增删方法是不可以使用的
		 * 否则会UnsupportedOperationException
		 */
		
//		int[] arr = {3,2,1,3,5,4,54};
//		System.out.println(Arrays.toString(arr));
		
		/*
		 * 重点：List aslist(数组) 将数组转成集合。
		 * 
		 */
		demo_2();

	}
	private static void demo_2() {
		// TODO 自动生成的方法存根
		/*
		 * 如果数组中的元素对象，那么转成集合时，直接将数组元素作为集合中的元素进行集合储存。
		 * 
		 * 如果数组中的是基本类型数据，那么将该数组作为集合中的元素尽心存储。
		 */
		int[] arr = {31,11,15};
		
		List<int[]> list = Arrays.asList(arr);
		
		System.out.println(list);
		
	}
	/**
	 * 
	 */
	public static void demo() {
		String[] arr = {"abc","haha","xixi"};
//		boolean b = myCollections(arr,"xixi");
//		System.out.println(b);
		
		List<String> list = Arrays.asList(arr);
		boolean b = list.contains("xixi");
		System.out.println("b="+b);
		list.add("hhas");//UnsupportedOperationException
		System.out.println(list);
	}
	public static boolean myCollections(String[] arr,String key) {
		for(int i = 0; i <arr.length; i++) {
			if(arr[i].equals(key))
				return true;
				
		}
		return false;
	}
	public static String myToString(int[] a) {
		int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {//zhong jianshenglu panduan
            b.append(a[i]);
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
	}
}
