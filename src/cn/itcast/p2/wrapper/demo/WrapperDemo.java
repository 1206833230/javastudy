package cn.itcast.p2.wrapper.demo;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		 * 基本数据类型包装类：
		 * 为了方便操作基本数据类型值。将其封装成了对象，在对对象中定义了属性和行为丰富了该数据的操作。
		 * 用于描述该对象的类称为基本数据类型包装类。
		 * byte    Byte
		 * short   Short
		 * int     Integer
		 * long    Long 
		 * float   Float
		 * double  Double
		 * char    Character
		 * boolean Boolean
		 * 该包装对象主要用于基本类型和字符串之间的转化。
		 * 基本类型：
		 * 1.基本类型数值+“”
		 * 2.用string类中的静态方法valueOf（基本数据类型值）；
		 * 字符串----》基本数据类型
		 * 1. 使用包装类中的静态方法xxx parseXxx（“xxx类型字符串）；
		 * int parseInt（“intstring”）
		 * long parseLong("longstring")
		 * boolean parseBoolean("booleanString“）
		 * 只有character没有parse方法
		 * 2.法人如果字符串被Integer进行对象的封装
		 * 可以使一个非静态方法，intValue（）；
		 * 将一个Integer对象转换为基本数据类型值。
		 */
//		int num ;
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.toBinaryString(-6));//取反输出
//		Integer i = new Integer(5);
//		int x = Integer.parseInt("123");
//		System.out.println(Integer.parseInt("123abc")+1);
//		Integer i = new Integer("123");
//		System.out.println(i.intValue());
		/*
		 * 整数具备不同进制转换的体现。
		 * 十进制 ---转---其他进制：
		 * parse("string",进制）
		 * 其他进制---转---十进制
		 * 
		 */
		//
		System.out.println(Integer.toBinaryString(60));
		System.out.println(Integer.toOctalString(60));
		System.out.println(Integer.toHexString(60));
		System.out.println(Integer.toString(60,4));
		System.out.println(Integer.parseInt("110",10));
		System.out.println(Integer.parseInt("110",2));
		System.out.println(Integer.parseInt("110",16));
		Integer i = new Integer("3");
		Integer j = new Integer(3);
		System.out.println(i==j);
		System.out.println(i.equals(j));
		System.out.println(3>3);
		System.out.println(i.compareTo(j));

	}

}
