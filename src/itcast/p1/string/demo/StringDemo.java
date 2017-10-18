package cn.itcast.p1.string.demo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String类的特点：
		 * 字符串对象一旦被初始化就不会被改变。
		 * 
		 */
//		stringDemo1();
		stringDemo2();
	}
	public static void stringDemo2() {
		String s = "abc";//创建一个字符串在常量池中。
		String s1 = new String("abc");//创建两个对象一个new一个字符串对象在堆内存中。
		System.out.println(s==s1);
		System.out.println(s.equals(s1));//false
		//string类中的equals复写了Object中的equals建立string类自己判断字符串对象是否相同的依据
		//其实就是比较字符串内容
	}
	/*
	 * 演示字符串定义的第一种方式，并明确字符串常量池
	 */
	public static void stringDemo1() {
		String s = "abc";//"abc"储存在字符串常量池中。
//		s = "nba";
		String s1 = "abc";
		System.out.println(s==s1);//true?true
		System.out.println(s.equals(s1));
//		System.out.println("s="+s);

	}

}
