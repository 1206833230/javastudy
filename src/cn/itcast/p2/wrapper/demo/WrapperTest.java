package cn.itcast.p2.wrapper.demo;

import java.util.Arrays;

public class WrapperTest {
	private static final String SPACE_SEPATATOR = " ";

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*
		 * ���ַ����е���ֵ���д�С����
		 * "20 76 -7 88 36 29"
		 *  ˼·
		 *  1.�����Һ��졣������ֻ��int��
		 *  2.��ȡ����Щ�ַ�������Ҫ�������ֵ��
		 *  ��������ַ����пո������л�ȡ�ָ��ַ���
		 *  3.��ֵ���ձ����С�ַ�����ô���һ��int����?
		 *  �ַ���--���������Ϳ���ʹ�ð�װ�ࡣ
		 */
		String numStr = "20 76 -7 88 36 29";
		System.out.println(numStr);
		numStr = sortStringNumber(numStr);
		System.out.println(numStr);
		
		
		

	}

	private static String sortStringNumber(String numStr) {
		// TODO �Զ����ɵķ������
		//���ַ�������ַ�������
		String[] str_arr = stringArray(numStr);
		//���ַ������int����
		int[] num_arr = toIntArray(str_arr);
		//������������
		mysortArray(num_arr);
		//��������int�������ַ�����
		String temp = arrayToString(num_arr);
		return temp;
	}
	//��������int�������ַ�����
	private static String arrayToString(int[] num_arr) {
		// TODO �Զ����ɵķ������
		StringBuilder sb = new StringBuilder();
		for(int x = 0;x < num_arr.length; x++) {
			if(x!=num_arr.length-1)
				sb.append(num_arr[x]+SPACE_SEPATATOR);
			else
				sb.append(num_arr[x]);
		}
		return sb.toString();
	}
	//������������
	private static void mysortArray(int[] num_arr) {
		// TODO �Զ����ɵķ������
		Arrays.sort(num_arr);
	}
	//���ַ������int����
	private static int[] toIntArray(String[] str_arr) {
		// TODO �Զ����ɵķ������
		int[] arr = new int[str_arr.length];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = Integer.parseInt(str_arr[i]);
			
		}
		return arr;
	}
	//���ַ�������ַ�������
	private static String[] stringArray(String numStr) {
		// TODO �Զ����ɵķ������
		String[] str_arr = numStr.split(SPACE_SEPATATOR);
		return str_arr;
	}

}
