package cn.itcast.p2.wapper.demo;
/**
 * 
 * @author Jun Li
 * 2018年1月5日
 * 下午3:26:08
 */
public class WrapperDemo2 {

	public static void main(String[] args) {
		int num = 4 ;
		num = num + 5;
		
		Integer i = 4;//i = new Integer(4);自动装箱，简化书写
		i = i + 6;//i = new Integer(i.intValue() + 6);//i.intValue() 自动拆箱
		
//		show(55);
		
		Integer a = new Integer(127);
		Integer b = new Integer(127);
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		//面试可能会遇到
		Integer x = 127;//jdk1.5以后，自动装箱，如果装箱的是一个字节，那么该数据会被共享不会重新开辟空间。
		Integer y = 127;
		System.out.println(x==y);//判断位置
		System.out.println(x.equals(y));//判断值
		
	}

	public static void show(Object a) {
		// TODO 自动生成的方法存根
		System.out.println("a="+a);
	}
}
