package cn.itcast.p1.otherapi.system;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		// TODO 自动生成的方法存根
		
		methodDemo_3();

	}
	 /* 
	  * 将日期格式的字符串-->日期对象
	  * 使用DateFormat类中的
	  */
	public static void methodDemo_3() throws ParseException {
		// TODO 自动生成的方法存根
		
//		String str_date = "2018-1-19";
//		String str_date = "2018年1月19日";
		String str_date = "2018---1---19";
		
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
		
		dateFormat = new SimpleDateFormat("yyyy---MM---dd");
		
		Date date = dateFormat.parse(str_date);
		
		System.out.println(date);
		
		
	}
	/**
	 * 对日期对象进行格式化
	 * 将日期对象-->日期格式的字符串
	 * 使用的是DateFormat类中的format方法。
	 * 
	 */

	@SuppressWarnings("unused")
	private static void methodDemo_2() {
		// TODO 自动生成的方法存根
		Date date = new Date();
		
		
		//获取日期格式对象，具体着默认的风格。FULL LONG等可以指定风格
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
		
		dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
//		System.out.println(dateFormat);
		
		//如果想获取自定义的时间格式
		
		dateFormat = new SimpleDateFormat("yyyy--MM--dd");
		
		String str_date = dateFormat.format(date);
		
		System.out.println(str_date);
	}


}
