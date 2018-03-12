package cn.itcast.p4.news.demo;

public class ParamterDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		int sum = add(4,5);
//		System.out.println("sum:"+sum);
//		int sum1 = add(4,5,6);
//		System.out.println("sum1:"+sum1);
		
//		int[] arr = {5,23,345,5,7};
//		int sum = add(arr);
//		System.out.println(sum);
//		int[] arr1 = {5,23,345,5,7,1,1,1,1};
//		int sum1 = add(arr1);
//		System.out.println(sum1);
		
		int sum = newAdd(3,1,3,4);
		System.out.println(sum);
		int sum1 = newAdd(3,1,3,4,1,1,1);
		System.out.println(sum1);

	}
	/*
	 * 函数的可变参数。
	 * 其实就是一个数组，但是就收的数组元素。
	 * 自动将这些元素封装成数组，简化调用者的书写。
	 * 
	 * 注意：可变参数类型，必须定义在参数列表的结尾。
	 */
	public static int newAdd(int... arr) {
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			
		}
		return sum;
		
//		System.out.println(arr);
//		
//		return 0;
	}
	
	public static int add(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			
		}
		return sum;
		
	}
	
	public static int add(int a,int b) {
		return a+b;
	}
	public static int add(int a,int b,int c) {
		return a+b+c;
	}

}
