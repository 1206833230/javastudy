package cn.itcast.p4.news.demo;

public class ParamterDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
	 * �����Ŀɱ������
	 * ��ʵ����һ�����飬���Ǿ��յ�����Ԫ�ء�
	 * �Զ�����ЩԪ�ط�װ�����飬�򻯵����ߵ���д��
	 * 
	 * ע�⣺�ɱ�������ͣ����붨���ڲ����б�Ľ�β��
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
