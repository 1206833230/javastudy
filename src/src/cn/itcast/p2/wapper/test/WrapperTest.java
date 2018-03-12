package cn.itcast.p2.wapper.test;

import java.util.Arrays;

/**
 * 
 * @author Jun Li
 * 2018年1月5日
 * 下午3:48:46
 */
/*
 * 对一个字符串中的数值进行从小到大的排序
 *"20 78 9 -7 88 36 29"
 *
 *思路：
 *1.排序爬，我很熟。可是我只熟int
 *2.如何获取到这个字符串的这些需要排序的数值?
 *字符串数值都是用空格进行排
 *切割成小串
 *3.数值最终变成小串
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
		// TODO 自动生成的方法存根
		//1.将字符串变成字符串数组。
		String[] str_arr = stringToArray(numStr);
		//2.将字符串数组变成int数组。
		int[] num_arr = toIntArray(str_arr);
		//3.对数组进行排序
		mySortArray(num_arr);
		//4.将排序后的int数组变成字符串
		String temp = arrayToString(num_arr);
		return temp;
	}

	private static String arrayToString(int[] num_arr) {
		// TODO 自动生成的方法存根
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
		// TODO 自动生成的方法存根
		Arrays.sort(num_arr);
	}

	private static int[] toIntArray(String[] str_arr) {
		// TODO 自动生成的方法存根
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
