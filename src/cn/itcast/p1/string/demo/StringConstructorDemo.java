package cn.itcast.p1.string.demo;

public class StringConstructorDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		stringConstructorDemo();
		stringConstructorDemo2();

	}

	private static void stringConstructorDemo2() {
		// TODO 自动生成的方法存根
		char[] arr = {'w','a','p','q','x'};
		String s = new String(arr,1,3);
		System.out.println("s="+s);
		
	}

	private static void stringConstructorDemo() {
		// TODO 自动生成的方法存根
//		String  s = new String();//等效于String s = “”；不等效于String s = null
		byte[] arr = {65,66,67,68};
		String s1 = new String(arr);
		System.out.println("s1"+s1);
	}

}
