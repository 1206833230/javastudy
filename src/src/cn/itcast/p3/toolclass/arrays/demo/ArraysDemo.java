package cn.itcast.p3.toolclass.arrays.demo;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*
		 * Arrays: ���Ͽ�ܵĹ����ࡣ����ķ������Ǿ�̬�ġ�
		 * 
		 * �ô�����ʵ����ʹ�ü��ϵķ�������������Ԫ��
		 * 
		 * ע�⣺����ĳ����ǹ̶��ģ����Զ��ڼ��ϵ���ɾ�����ǲ�����ʹ�õ�
		 * �����UnsupportedOperationException
		 */
		
//		int[] arr = {3,2,1,3,5,4,54};
//		System.out.println(Arrays.toString(arr));
		
		/*
		 * �ص㣺List aslist(����) ������ת�ɼ��ϡ�
		 * 
		 */
		demo_2();

	}
	private static void demo_2() {
		// TODO �Զ����ɵķ������
		/*
		 * ��������е�Ԫ�ض�����ôת�ɼ���ʱ��ֱ�ӽ�����Ԫ����Ϊ�����е�Ԫ�ؽ��м��ϴ��档
		 * 
		 * ��������е��ǻ����������ݣ���ô����������Ϊ�����е�Ԫ�ؾ��Ĵ洢��
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
