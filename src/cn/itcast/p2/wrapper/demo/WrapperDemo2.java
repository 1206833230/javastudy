package cn.itcast.p2.wrapper.demo;

public class WrapperDemo2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int num = 4;
		num = num  + 5;
		Integer i = 4;//i = new Integer(4);自动装箱简化书写
		i = i + 6;
		
		show(66);
		Integer a = new Integer(127);
		Integer b = new Integer(128);
		System.out.println(a==b);;
		System.out.println(a.equals(b));
		Integer x = 127;//jdk以后，自动装箱，如果装箱的只一个字节，那么该数据会被共享而不会开辟子女的空间。
		Integer y = 128;
		System.out.println(x==y);;
		System.out.println(x.equals(y));

	}

	private static void show(Object i) {
		// TODO 自动生成的方法存根
		System.out.println("i="+i);
	}

}
