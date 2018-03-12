package cn.itcast.p2.wapper.demo;
/**
 * 
 * @author Jun Li
 * 2018年1月4日
 * 下午9:55:30
 */
public class WapperDemo {

	/*
	 * @param agrs
	 */
	public static void main(String[] args) {
		/*
		 * 基本数据类型对象包装类。
		 * 为了方便操作基本数据数据类型值，将其封装成了对象，在对象定义了属性和行为丰富了该数据的操作。
		 * 用于描述该对象的类就称为基本数据类型包装类。
		 * 
		 * 该包装类用于基本类型和字符串之间的转化。
		 * 
		 * 基本数据类型-->字符串
		 * 1.基本数据类型值+“”
		 * int long = parseLong("longstring")
		 * 2.用String类中的静态方法ValueOf(基本数据类型)
		 * 3.用Integr的静态方法valueOf(基本数据类型)
		 * 2.如果字符串被Integer进行对象封装。
		 *   可以使用另一个非静态方法。intValue（）；
		 *   将一个Integer对象转成基本数据类型值。
		 * 
		 */
//		int num;
		
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.toBinaryString(-6));
//		int num1 = 4;//基本数值
//		Integer i = new Integer(num1);//将数据封装成对象
//		System.out.print(Integer.parseInt("123"+1));
		Integer i = new Integer("123");
		System.out.println(i.intValue());//将对象转化为基本数据类型值
		/*
		 * 整数具备不同进制
		 * 
		 * 十进制转-->其他进制
		 * toBinaryString
		 * toOctalString
		 * toHexString
		 * toString
		 * 其他进制-->转十进制
		 * parseInt
		 */
		//十进制转-->其他进制
		System.out.println(Integer.toBinaryString(60));
		System.out.println(Integer.toOctalString(60));
		System.out.println(Integer.toHexString(60));
		
		System.out.println(Integer.toString(60,16));
		//其他进制-->转十进制
		System.out.println(Integer.parseInt("110",2));
		
		Integer a = new Integer("3");
		Integer b = new Integer(3);
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
//		System.out.println(3>3);
		System.out.println(a.compareTo(b));
	}
}

