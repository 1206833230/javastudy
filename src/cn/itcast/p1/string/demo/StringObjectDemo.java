package cn.itcast.p1.string.demo;

public class StringObjectDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		String s1 = "abc";
//		String s2 = "abc";
		//intern();对字符串池进行操作。
		String s1 = new String("abc");//创建一个对象由String管理
		String s2 = s1.intern();//获取翅中的对象
		
		System.out.print(s1==s2);
	}

}
