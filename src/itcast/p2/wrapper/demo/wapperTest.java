package cn.itcast.p2.wrapper.demo;

import java.util.Arrays;

public class wapperTest {
	private static final String SPACE_SEPATOR = " ";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ��һ���ַ�������ֵ���д�С���������
		 * ��2114 54 66 58 11 254 65��
		 * 1.����������Ϥint��
		 * 2.���ַ����ָ��С�ַ���
		 * 3.�ַ���ת��Ϊ��ֵ
		 * �ַ���--���������Ͱ�װ��
		 */
//		private static final String SPACE_SEPATOR = " ";
		String numStr = "2114     54    66 58 11 254 65";
		System.out.println(numStr);
		System.out.println();
		numStr = sotrStringNumber(numStr);
		System.out.println(numStr);
		
		
		

	}

	public static String sotrStringNumber(String numStr) {
		// TODO Auto-generated method stub
		//1.���ַ�������ַ�������
		String[] str_arr = stringToArray(numStr);
		//2.���ַ���������int����
		int[] num_arr = toIntArray(str_arr);
		//3.��int�����������
		mySortArray(num_arr);
		//4.��������int�������ַ���
		String temp = arrayToString(num_arr);
		return temp;
	}

	public static String arrayToString(int[] num_arr) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for(int x = 0; x<num_arr.length;x++) {
			if(x!=num_arr.length-1)
				sb.append(num_arr[x]+SPACE_SEPATOR);
			else
				sb.append(num_arr[x]);
				
		}
		return sb.toString();
	}

	public static void mySortArray(int[] num_arr) {
		// TODO Auto-generated method stub
		Arrays.sort(num_arr);
		
	}

	public static int[] toIntArray(String[] str_arr) {
		// TODO Auto-generated method stub
		int[] arr = new int[str_arr.length];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(str_arr[i]);
		}
		
		return arr;
	}

	/**
	 * @param numStr
	 * @return 
	 */
	public static String[] stringToArray(String numStr) {
		
		String[] str_arr = numStr.split(SPACE_SEPATOR+"+");
		return str_arr;
	}

	

}
