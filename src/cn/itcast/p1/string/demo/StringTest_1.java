package cn.itcast.p1.string.demo;

public class StringTest_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		 * 给定一个字符串数组，按照字典顺序进行从小到大的进行排序。 {"nba","abc","cha","zz","qq',"haha"}
		 * 
		 * 思路; 1.对数组进行排序。可以选择冒泡，选择。 2.for嵌套和比较交换位置。
		 */
		String[] arr = { "nba", "abc", "cha", "zz", "qq", "haha" };
		printArray(arr);
		sortString(arr);
		printArray(arr);

	}

	public static void sortString(String[] arr) {
		// TODO 自动生成的方法存根
		for(int i  = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				if(arr[i].compareTo(arr[j])>0) {//字符串比较用compareTo方法完成
					swap(arr,i,j);
				}
			}
			
		}
	}

	private static void swap(String[] arr, int i, int j) {
		// TODO 自动生成的方法存根
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void printArray(String[] arr) {
		// TODO 自动生成的方法存根
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1)
				System.out.print(arr[i] + ",");
			else
				System.out.println(arr[i] + "]");
		}

	}

}
