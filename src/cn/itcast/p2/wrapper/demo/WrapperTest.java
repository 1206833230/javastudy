package cn.itcast.p2.wrapper.demo;

import java.util.Arrays;

public class WrapperTest {
	private static final String SPACE_SEPATATOR = " ";

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		 * 对字符串中的数值进行大小排序。
		 * "20 76 -7 88 36 29"
		 *  思路
		 *  1.排序，我很熟。可是我只熟int。
		 *  2.获取到这些字符串中需要排序的数值。
		 *  发现这个字符串中空格来进行获取分割字符。
		 *  3.数值最终变成了小字符串怎么变成一个int数呢?
		 *  字符串--》基本类型可以使用包装类。
		 */
		String numStr = "20 76 -7 88 36 29";
		System.out.println(numStr);
		numStr = sortStringNumber(numStr);
		System.out.println(numStr);
		
		
		

	}

	private static String sortStringNumber(String numStr) {
		// TODO 自动生成的方法存根
		//将字符串变成字符串数组
		String[] str_arr = stringArray(numStr);
		//将字符串变成int数组
		int[] num_arr = toIntArray(str_arr);
		//对数进行排序
		mysortArray(num_arr);
		//将排序后的int数组变成字符串。
		String temp = arrayToString(num_arr);
		return temp;
	}
	//将排序后的int数组变成字符串。
	private static String arrayToString(int[] num_arr) {
		// TODO 自动生成的方法存根
		StringBuilder sb = new StringBuilder();
		for(int x = 0;x < num_arr.length; x++) {
			if(x!=num_arr.length-1)
				sb.append(num_arr[x]+SPACE_SEPATATOR);
			else
				sb.append(num_arr[x]);
		}
		return sb.toString();
	}
	//对数进行排序
	private static void mysortArray(int[] num_arr) {
		// TODO 自动生成的方法存根
		Arrays.sort(num_arr);
	}
	//将字符串变成int数组
	private static int[] toIntArray(String[] str_arr) {
		// TODO 自动生成的方法存根
		int[] arr = new int[str_arr.length];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = Integer.parseInt(str_arr[i]);
			
		}
		return arr;
	}
	//将字符串变成字符串数组
	private static String[] stringArray(String numStr) {
		// TODO 自动生成的方法存根
		String[] str_arr = numStr.split(SPACE_SEPATATOR);
		return str_arr;
	}

}
