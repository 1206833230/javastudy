package cn.itcast.p1.string.demo;

public class StringConstructorDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		stringConstructorDemo();
		stringConstructorDemo2();

	}

	private static void stringConstructorDemo2() {
		// TODO �Զ����ɵķ������
		char[] arr = {'w','a','p','q','x'};
		String s = new String(arr,1,3);
		System.out.println("s="+s);
		
	}

	private static void stringConstructorDemo() {
		// TODO �Զ����ɵķ������
//		String  s = new String();//��Ч��String s = ����������Ч��String s = null
		byte[] arr = {65,66,67,68};
		String s1 = new String(arr);
		System.out.println("s1"+s1);
	}

}
