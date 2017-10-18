package cn.itcast.p1.string.demo;

public class StringTest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1.给定一个字符串数组。按照字典顺序进行从小到大的排序
		 * {"nba","abc","cba","zz","qq","haha"}
		 * 思路：
		 * 1.对数组进行排序。可以选择冒泡排序。
		 * 2.for嵌套和比较以及换位。
		 * 3.问题：以前拍的是整数，比较用比较运算符，可是现在是字符串对象。
		 * 字符串对象怎么比较呢?
		 * 对象中提供了用于字符串对象比较的功能。
		 * 
		 */
		String[] arr = {"nba","abc","cba","zz","qq","haha"};
		printArray(arr);
		sortString(arr);
		printArray(arr);
		
				

	}

	public static void sortString(String[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length; j++)
			{
				if(arr[i].compareTo(arr[j])>0)//字符歘比较用compareTo完成
				{
					swap(arr,i,j);
				}
			}
		}
		
		
	}

	private static void swap(String[] arr, int i, int j) {
		// TODO Auto-generated method stub
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void printArray(String[] arr) {
		// TODO Auto-generated method stub
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			if(i!=arr.length-1)
				System.out.print(arr[i]+",");
			else
				System.out.println(arr[i]+"]");
		}
		
	}

}
