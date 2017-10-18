package cn.itcast.p1.string.demo;

public class StringConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringConstructorDemo2();
		stringConstructorDemo();

	}

	private static void stringConstructorDemo2() {
		// TODO Auto-generated method stub
		char[] arr = {'w','a','a','c'};
		String s = new String(arr,1,3);
		System.out.println("s="+s);
		
	}

	private static void stringConstructorDemo() {
		// TODO Auto-generated method stub
//		String s = new String();//等效于String s = “”；不等效于String s = null;
		byte[] arr = {65,66,67,68};
		String s1 = new String(arr);
		System.out.println("s1="+s1);
		
	}

}
