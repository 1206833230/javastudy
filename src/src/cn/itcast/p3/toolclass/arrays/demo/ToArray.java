package cn.itcast.p3.toolclass.arrays.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArray {
	public static void main(String[] args) {
		/*
		 * ����ת�������أ�
		 * 
		 * ʹ�õľ���collection�ӿ��е�toArray������
		 * 
		 * ����ת�����飺���ԶԼ���������Ԫ�ؽ��в����ķ��������޶����޷�ʵ����ɾ��
		 * 
		 */
		
		List<String> list = new ArrayList<String>();
		
		list.add("anc1");
		list.add("anc2");
		list.add("anc3");
		/*
		 * toArray������Ҫ����һ��ָ�����͵����顣
		 * ���ȸ���ζ����أ�
		 * �������С�ڼ��ϵ�size����ô�÷����ᴴ��һ��ͬ���Ͳ��ͼ�����ͬsize�����顣
		 * ������ȴ��ڼ��ϵ�size����ô�÷����ͻ�ʹ��ָ�������飬�洢�����е�Ԫ�أ�����λ��Ĭ��Ϊ�ա�
		 * 
		 * ���Խ��飬��󳤶ȵ�ָ����Ϊ���ϵ�size
		 */
		
		String[] arr = list.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(arr));
	}

}
