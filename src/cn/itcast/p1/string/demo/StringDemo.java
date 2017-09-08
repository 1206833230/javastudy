/**
 * 
 */
package cn.itcast.p1.string.demo;

/**
 * @author Jun Li
 *
 */
public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		 * String类的特点：
		 * 字符窜对象一旦被初始化就不会被改变。
		 * 如果有就直接获取地址，没有才创建
		 */
		stringdemo1();
		stringdemo2();
		
	}

	private static void stringdemo2() {
		// TODO 自动生成的方法存根
		String s = "abc";//字符串常量池创建一个字符串
		String s1 = new String("abc");//创建了两个个对象一个new一个字符串在堆内存
		System.out.println(s1==s);//false
		System.out.println(s.equals(s1));//string类中的equals是复写 了Object中的equals建立了string类自己判断字符串对象是否相同的依据。
		//equals比较的是字符串的内容不是地址
//		System.out.println("s="+s);
//		System.out.println("s1="+s1);
		
	}

	/**
	 * 演示字符串定义的第一种方式，并明确字符串常量池的特点。
	 */
	private static void stringdemo1() {
		String s = "abc";//"abc"存储在字符串常量池中
//		s = "nba";
		String s1 = "abc";
		System.out.println(s==s1);//true?
//		System.out.println("s="+s);
	}

}
