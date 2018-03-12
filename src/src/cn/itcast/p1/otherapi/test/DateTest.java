package cn.itcast.p1.otherapi.test;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 练习：
 * "2018-3-17"到"2018-9-10"
 * 中间有多少天？
 * 思路：
 * 两个日期相减就哦了。
 * 咋整呢？
 * 必须要有两个可以进行减法运算的数。
 * 能减可以是毫秒值。如何获取毫秒值？通过date对象。
 * 如何获取date对象呢？
 * 可以将字符串转成date对象
 * 
 * 1.将日期格式的字符串转成Date对象
 * 2.将Date对象转成毫秒值
 * 3.相减，在变成天数
 */
public class DateTest {

	public static void main(String[] args) throws ParseException {
		// TODO 自动生成的方法存根
		String str_date2 = "2018-9-9";
		String str_date1 = "2018-12-10";
		test(str_date1,str_date2);

	}

	public static void test(String str_date1,String str_date2) throws ParseException {
		// TODO 自动生成的方法存根
		
		//1.将日期字符串转成日期对象
		//定义日期格式对象
		
		DateFormat dateFormat = DateFormat.getDateInstance();
		
		dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		Date date1 = dateFormat.parse(str_date1);
		Date date2 = dateFormat.parse(str_date2);
		
		long time1 = date1.getTime();
		long time2 = date2.getTime();
		
		long time = Math.abs(time2-time1);
		
		int day = getDay(time);
		
		System.out.println(day);
		
	}

	private static int getDay(long time) {
		// TODO 自动生成的方法存根
		int day = (int)(time/1000/60/60/24);
		return day;
	}

}
