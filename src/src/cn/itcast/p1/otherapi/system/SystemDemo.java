package cn.itcast.p1.otherapi.system;

import java.util.Properties;
import java.util.Set;

public class SystemDemo {

	private static final String LINE_SEPARTOR = System.getProperty("line.separator");
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		 * System:类中的方法和属性都是静态的。
		 * 
		 * 常见的方法：
		 * 
		 * long currentTimeMillis():获取当前时间的毫秒值。
		 * 
		 */

		long l1 = System.currentTimeMillis();
		System.out.println(l1);//1516345099647
		demo_1();
		long l2 = System.currentTimeMillis();
		System.out.println(l2-l1);
//		System.out.println("hello-\r\n word");
//		System.out.println("hello-"+LINE_SEPARTOR+" word");//获取当前系统的换行符
//		demo_1();
		
		//给系统设置一些属性信息。这些信息是全局，其他程序都可以使用。
//		System.setProperty("mycalsspath","c:\mycalss");
		
	}
	public static void demo_1() {
		//获取系统属性信息，并储存到了Properties集合中。
		/*
		 * properties集合中储存都是String类型的键和值。
		 * 最好使用它自己的储存和取出的方法来完成元素的操作。
		 * 
		 */
		Properties prop = System.getProperties();
		
		Set<String> nameSet = prop.stringPropertyNames();
		
		for(String name: nameSet ) {
			String value = prop.getProperty(name);
			System.out.println(name+"::"+value);
		}
		
	}

}
