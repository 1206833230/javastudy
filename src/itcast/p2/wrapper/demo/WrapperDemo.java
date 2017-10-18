package cn.itcast.p2.wrapper.demo;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 基本数据类型对象包装类。
		 * 为了方便数据类型值，将其封装成对象，在对象中定义了属性和行为丰富该数据的操作。
		 * 用于描述该类对象称为基本数据对象包装类。
		 * byte Byte
		 * short Short
		 * int Integer
		 * long Long
		 * float Float
		 * double Double
		 * char Character
		 * boolean Boolean
		 * 
		 * 该包装对象主要用于基本数据类型的字符串之间的装换。
		 * 
		 * 基本数据类型--》字符串
		 *    1.基本数据数值+“”
		 *    2.用String类中的静态方法valueOf（基本数据类型)
		 * 字符串--》基本类型
		 * 1.
		 * 
		 */
//		int num;
//		
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.toBinaryString(-6));
//		int num1 = 4;
//		Integer i = new Integer(5);
//		int x = Integer.parseInt("123");
//		System.out.println(Integer.parseInt("123abc")+1);
//		Integer i = new Integer("123");
//		System.out.println(i.intValue(i));
		/*
		 * 整数基本不同的进制
		 * 十进制 转 其他进制 
		 * 其他进制 转 十进制
		 * parseInt("string",进制）
		 * 
		 */
		System.out.println(Integer.toBinaryString(60));
		System.out.println(Integer.toOctalString(60));
		System.out.println(Integer.toHexString(60));
		
		System.out.println(Integer.toString(60,16));
		System.out.println(Integer.parseInt("3c",16));
		
		Integer a = new Integer("3");
		Integer b = new Integer(3);
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a.compareTo(b));

	}

}
