package cn.itcast.p2.wapper.test;

import java.util.Arrays;

/**
 * 
 * @author Jun Li
 * 2018��1��5��
 * ����3:48:46
 */
/*
 * ��һ���ַ����е���ֵ���д�С���������
 *"20 78 9 -7 88 36 29"
 *
 *˼·��
 *1.���������Һ��졣������ֻ��int
 *2.��λ�ȡ������ַ�������Щ��Ҫ�������ֵ?
 *�ַ�����ֵ�����ÿո������
 *�и��С��
 *3.��ֵ���ձ��С��
 */
public class WrapperTest {
	
	private static final String SPACE_SEPARATOR = " ";

	public static void main(String[] args) {
		String numStr = "20 78 9 -7 88 36 29";
		System.out.println(numStr);
		numStr = sortStringNumber(numStr);
		System.out.println(numStr);
	}

	public static String sortStringNumber(String numStr) {
		// TODO �Զ����ɵķ������
		//1.���ַ�������ַ������顣
		String[] str_arr = stringToArray(numStr);
		//2.���ַ���������int���顣
		int[] num_arr = toIntArray(str_arr);
		//3.�������������
		mySortArray(num_arr);
		//4.��������int�������ַ���
		String temp = arrayToString(num_arr);
		return temp;
	}

	private static String arrayToString(int[] num_arr) {
		// TODO �Զ����ɵķ������
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < num_arr.length; i++) {
			if(i!=num_arr.length-1)
				sb.append(num_arr[i]+SPACE_SEPARATOR);
				else
					sb.append(num_arr[i]);
		}
		return sb.toString();
	}

	private static void mySortArray(int[] num_arr) {
		// TODO �Զ����ɵķ������
		Arrays.sort(num_arr);
	}

	private static int[] toIntArray(String[] str_arr) {
		// TODO �Զ����ɵķ������
		int[] arr = new int [str_arr.length];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(str_arr[i]);
		}
		return arr;
	}

	/**
	 * @param numStr
	 */
	public static String[] stringToArray(String numStr) {
		String[] str_arr = numStr.split(SPACE_SEPARATOR);
		
		return str_arr;
	}
}
